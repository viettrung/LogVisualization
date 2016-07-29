/*
 * File: app/view/HourAreaChartViewModel.js
 *
 * This file was generated by Sencha Architect version 3.2.0.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 5.1.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 5.1.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('MyApp.view.HourAreaChartViewModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.hourareachart',

    requires: [
        'Ext.data.Store',
        'Ext.data.proxy.Ajax',
        'Ext.data.reader.Json',
        'Ext.data.field.Field',
        'Ext.util.Sorter'
    ],

    stores: {
        hourStore: {
            autoLoad: false,
            proxy: {
                type: 'ajax',
                url: '/hourController/getCounts',
                reader: {
                    type: 'json',
                    rootProperty: 'records'
                }
            },
            fields: [
                {
                    name: 'numOfRequest'
                },
                {
                    name: 'percentage'
                },
                {
                    name: 'hour'
                }
            ],
            listeners: {
                load: 'onJsonstoreLoad'
            },
            sorters: {
                property: 'hour'
            }
        }
    }

});