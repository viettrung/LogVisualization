/*
 * File: app/view/HourAreaChart.js
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

Ext.define('MyApp.view.HourAreaChart', {
    extend: 'Ext.chart.CartesianChart',
    alias: 'widget.hourareachart',

    requires: [
        'MyApp.view.HourAreaChartViewModel',
        'MyApp.view.HourAreaChartViewController',
        'Ext.chart.axis.Category',
        'Ext.chart.axis.Numeric',
        'Ext.chart.series.Area',
        'Ext.chart.interactions.PanZoom'
    ],

    controller: 'hourareachart',
    viewModel: {
        type: 'hourareachart'
    },
    padding: '10 0 0 0',
    insetPadding: 40,

    bind: {
        store: '{hourStore}'
    },
    axes: [
        {
            type: 'category',
            renderer: function(label, layout, lastLabel) {
                return label + 'h';
            },
            fields: [
                'hour'
            ],
            grid: true,
            label: {
                rotate: {
                    degrees: -45
                }
            },
            title: 'Hour of Time',
            position: 'bottom'
        },
        {
            type: 'numeric',
            renderer: function(label, layout, lastLabel) {
                return label + '%';
            },
            fields: [
                'percentage'
            ],
            grid: true,
            position: 'left',
            title: 'Percent'
        }
    ],
    series: [
        {
            type: 'area',
            tooltip: {
                trackMouse: true,
                style: 'background: #FFF',
                height: 20,
                renderer: function(storeItem, item) {
                    this.setTitle(storeItem.get('hour') + 'h: ' + storeItem.get('percentage') + '%');
                }
            },
            xField: 'hour',
            yField: [
                'percentage'
            ]
        }
    ],
    interactions: [
        {
            type: 'panzoom'
        }
    ]

});