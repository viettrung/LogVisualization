/*
 * File: app/view/RefererDomainChart.js
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

Ext.define('MyApp.view.RefererDomainChart', {
    extend: 'Ext.chart.CartesianChart',
    alias: 'widget.refererdomainchart',

    requires: [
        'MyApp.view.DomainChartViewModel1',
        'MyApp.view.DomainChartViewController1',
        'Ext.chart.axis.Category',
        'Ext.chart.axis.Numeric',
        'Ext.chart.series.Bar'
    ],

    controller: 'refererdomainchart',
    viewModel: {
        type: 'refererdomainchart'
    },
    padding: '10 0 0 0',
    insetPadding: 40,

    bind: {
        store: '{refererDomainStore}'
    },
    axes: [
        {
            type: 'category',
            fields: [
                'refererDomain'
            ],
            grid: true,
            label: {
                rotate: {
                    degrees: -45
                }
            },
            title: 'Referer Domain',
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
            type: 'bar',
            highlight: {
                fill: '#000',
                'stroke-width': 20,
                stroke: '#fff'
            },
            style: {
                opacity: 0.8
            },
            tooltip: {
                trackMouse: true,
                style: 'background: #FFF',
                height: 20,
                renderer: function(storeItem, item) {
                    this.setTitle(storeItem.get('refererDomain') + ': ' + storeItem.get('percentage') + '%');
                }
            },
            xField: 'refererDomain',
            yField: [
                'percentage'
            ]
        }
    ]

});