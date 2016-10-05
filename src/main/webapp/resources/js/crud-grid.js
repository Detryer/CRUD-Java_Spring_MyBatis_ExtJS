Ext.onReady(function () {
    Ext.QuickTips.init();

    Ext.state.Manager.setProvider(new Ext.state.CookieProvider());

    var bookStore = new Ext.data.ArrayStore({
        model: 'books',
        autoLoad: true,
        proxy: Ext.Ajax.request({
            url: '/select',
            reader: {
                type: 'json',
                root: 'books',
                fields: [
                    {name: 'bookId', type: 'int'},
                    {name: 'bookTitle', type: 'string'},
                    {name: 'bookGenre', type: 'string'},
                    {name: 'authorName', type: 'string'}
                ]
            },
            writer: {
                type: 'json',
                writeAllFields: false,
                allowSingle: false,
                nameProperty: 'books'
            }
        })
    });

    var grid = new Ext.grid.GridPanel({
        store: bookStore,
        columns: [
            {
                id: 'id',
                header: 'ID',
                width: 160,
                sortable: true,
                dataIndex: 'id'
            },
            {
                header: 'Title',
                width: 75,
                sortable: true,
                dataIndex: 'bookTitle'
            },
            {
                header: 'Genre',
                width: 75,
                sortable: true,
                dataIndex: 'bookGenre'
            },
            {
                header: 'Author',
                width: 75,
                sortable: true,
                dataIndex: 'authorName'
            }
            // {
            //     xtype: 'actioncolumn',
            //     width: 50,
            //     items: [{
            //         icon: '../shared/icons/fam/delete.gif',  // Use a URL in the icon config
            //         tooltip: 'Sell stock',
            //         handler: function (grid, rowIndex, colIndex) {
            //             var rec = store.getAt(rowIndex);
            //             alert("Sell " + rec.get('company'));
            //         }
            //     }, {
            //         getClass: function (v, meta, rec) {          // Or return a class from a function
            //             if (rec.get('change') < 0) {
            //                 this.items[1].tooltip = 'Do not buy!';
            //                 return 'alert-col';
            //             } else {
            //                 this.items[1].tooltip = 'Buy stock';
            //                 return 'buy-col';
            //             }
            //         },
            //         handler: function (grid, rowIndex, colIndex) {
            //             var rec = store.getAt(rowIndex);
            //             alert("Buy " + rec.get('company'));
            //         }
            //     }]
            // }
        ],
        stripeRows: true,
        autoExpandColumn: 'books',
        height: 350,
        width: 600,
        title: 'Array Grid',
        // config options for stateful behavior
        stateful: true,
        stateId: 'grid'
    });

    // render the grid to the specified div in the page
    grid.render('grid-example');
});