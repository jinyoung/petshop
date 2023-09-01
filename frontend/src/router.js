
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetDataManagementPetProfileManager from "./components/listers/PetDataManagementPetProfileCards"
import PetDataManagementPetProfileDetail from "./components/listers/PetDataManagementPetProfileDetail"

import ProductRecommendationRecommendedProductManager from "./components/listers/ProductRecommendationRecommendedProductCards"
import ProductRecommendationRecommendedProductDetail from "./components/listers/ProductRecommendationRecommendedProductDetail"

import ProductPurchasePurchasedProductManager from "./components/listers/ProductPurchasePurchasedProductCards"
import ProductPurchasePurchasedProductDetail from "./components/listers/ProductPurchasePurchasedProductDetail"

import SocialMediaInteractionSocialMediaPostManager from "./components/listers/SocialMediaInteractionSocialMediaPostCards"
import SocialMediaInteractionSocialMediaPostDetail from "./components/listers/SocialMediaInteractionSocialMediaPostDetail"

import ProductReviewProductReviewManager from "./components/listers/ProductReviewProductReviewCards"
import ProductReviewProductReviewDetail from "./components/listers/ProductReviewProductReviewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/petDataManagements/petProfiles',
                name: 'PetDataManagementPetProfileManager',
                component: PetDataManagementPetProfileManager
            },
            {
                path: '/petDataManagements/petProfiles/:id',
                name: 'PetDataManagementPetProfileDetail',
                component: PetDataManagementPetProfileDetail
            },

            {
                path: '/productRecommendations/recommendedProducts',
                name: 'ProductRecommendationRecommendedProductManager',
                component: ProductRecommendationRecommendedProductManager
            },
            {
                path: '/productRecommendations/recommendedProducts/:id',
                name: 'ProductRecommendationRecommendedProductDetail',
                component: ProductRecommendationRecommendedProductDetail
            },

            {
                path: '/productPurchases/purchasedProducts',
                name: 'ProductPurchasePurchasedProductManager',
                component: ProductPurchasePurchasedProductManager
            },
            {
                path: '/productPurchases/purchasedProducts/:id',
                name: 'ProductPurchasePurchasedProductDetail',
                component: ProductPurchasePurchasedProductDetail
            },

            {
                path: '/socialMediaInteractions/socialMediaPosts',
                name: 'SocialMediaInteractionSocialMediaPostManager',
                component: SocialMediaInteractionSocialMediaPostManager
            },
            {
                path: '/socialMediaInteractions/socialMediaPosts/:id',
                name: 'SocialMediaInteractionSocialMediaPostDetail',
                component: SocialMediaInteractionSocialMediaPostDetail
            },

            {
                path: '/productReviews/productReviews',
                name: 'ProductReviewProductReviewManager',
                component: ProductReviewProductReviewManager
            },
            {
                path: '/productReviews/productReviews/:id',
                name: 'ProductReviewProductReviewDetail',
                component: ProductReviewProductReviewDetail
            },



    ]
})
