
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetManager from "./components/listers/PetCards"
import PetDetail from "./components/listers/PetDetail"

import ItemManager from "./components/listers/ItemCards"
import ItemDetail from "./components/listers/ItemDetail"
import OrderItemManager from "./components/listers/OrderItemCards"
import OrderItemDetail from "./components/listers/OrderItemDetail"
import CustomerManager from "./components/listers/CustomerCards"
import CustomerDetail from "./components/listers/CustomerDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/pets',
                name: 'PetManager',
                component: PetManager
            },
            {
                path: '/pets/:id',
                name: 'PetDetail',
                component: PetDetail
            },

            {
                path: '/items',
                name: 'ItemManager',
                component: ItemManager
            },
            {
                path: '/items/:id',
                name: 'ItemDetail',
                component: ItemDetail
            },
            {
                path: '/orderItems',
                name: 'OrderItemManager',
                component: OrderItemManager
            },
            {
                path: '/orderItems/:id',
                name: 'OrderItemDetail',
                component: OrderItemDetail
            },
            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },
            {
                path: '/customers/:id',
                name: 'CustomerDetail',
                component: CustomerDetail
            },



    ]
})
import PetManager from "./components/PetManager"
import ItemManager from "./components/ItemManager"
import OrderItemManager from "./components/OrderItemManager"
import CustomerManager from "./components/CustomerManager"
