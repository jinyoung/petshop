

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="petProfiles"
                        to="/petDataManagements/petProfiles"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        애견 프로필
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="recommendedProducts"
                        to="/productRecommendations/recommendedProducts"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        추천 제품
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="purchasedProducts"
                        to="/productPurchases/purchasedProducts"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        구매된 제품
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="socialMediaPosts"
                        to="/socialMediaInteractions/socialMediaPosts"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        소셜 미디어 포스트
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="productReviews"
                        to="/productReviews/productReviews"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        제품 후기
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container style="padding:0px;" v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container style="padding:0px;" v-else fluid>
                <div style="width:100%; margin:0px 0px 20px 0px; position: relative;">
                    <v-img style="width:100%; height:300px;"
                        src="https://oaidalleapiprodscus.blob.core.windows.net/private/org-IsZwoYj8yobpFySuytSuI26N/user-ha9EUDa76s1yoHT6JzgqOaFI/img-sK9KZSv1AdFmZLSNzPg5PztS.png?st=2023-09-01T01%3A05%3A12Z&se=2023-09-01T03%3A05%3A12Z&sp=r&sv=2021-08-06&sr=b&rscd=inline&rsct=image/png&skoid=6aaadede-4fb3-4698-a8f6-684d7786b067&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2023-09-01T00%3A45%3A34Z&ske=2023-09-02T00%3A45%3A34Z&sks=b&skv=2021-08-06&sig=xuE4J67rg6ZiAsPxq3ZxQvjDnI66r9U8%2BeiHgeNqEcs%3D"
                    ></v-img>
                    <div class="App-main-text-overlap">애견 의류 간식 사료등을 애견의 프로필에 따라 자동으로 추천하는 쇼핑몰. 주 사용자는 인스타등 애견을 뽐내고 싶어하는 애견주들.</div>
                    <div class="App-sub-text-overlap">Undefined 고객님을 위한 최고의 서비스!
혁신적인 솔루션과 탁월한 세부 사항을 제공하여 최고의 경험을 선사합니다. 함께 새로운 비즈니스 가능성과 성공을 창출하세요. 지금 바로 Undefined와 함께하세요!</div>
                </div>
                <v-row>
                    <v-col cols="4" class="d-flex justify-center" v-for="(aggregate, index) in aggregate" :key="index">
                        <div 
                            class="flip-card"
                            @mouseover="flipCard(index)"
                            @mouseleave="unflipCard(index)"
                            :class="{ 'is-flipped': flipped[index] }"
                        >
                            <div class="flip-card-inner">
                                <div class="flip-card-front">
                                    <v-card
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <div style="text-align: left; padding:10px 15px 15px 15px; margin-top:-10px;">
                                            <h2>{{ aggregate.title }}</h2>
                                            <div>{{ aggregate.description }}</div>
                                        </div>
                                    </v-card>
                                </div>
                                <div class="flip-card-back">
                                    <v-card
                                        color="primary"
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                        :key="aggregate.key"
                                        :to="aggregate.route"
                                        @click="changeUrl()"
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <h2 style="color:white;">{{ aggregate.title }} 관리</h2>
                                    </v-card>
                                </div>
                            </div>
                        </div>
                    </v-col>
                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
        flipped: [],
        ImageUrl: 'https://oaidalleapiprodscus.blob.core.windows.net/private/org-IsZwoYj8yobpFySuytSuI26N/user-ha9EUDa76s1yoHT6JzgqOaFI/img-sK9KZSv1AdFmZLSNzPg5PztS.png?st=2023-09-01T01%3A05%3A12Z&se=2023-09-01T03%3A05%3A12Z&sp=r&sv=2021-08-06&sr=b&rscd=inline&rsct=image/png&skoid=6aaadede-4fb3-4698-a8f6-684d7786b067&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2023-09-01T00%3A45%3A34Z&ske=2023-09-02T00%3A45%3A34Z&sks=b&skv=2021-08-06&sig=xuE4J67rg6ZiAsPxq3ZxQvjDnI66r9U8%2BeiHgeNqEcs%3D',
        aggregate: [
            { 
                title: '애견 프로필', 
                description: '애견의 프로필 정보를 관리하는 집합체입니다.', 
                key: 'petProfiles', 
                route: '/petDataManagements/petProfiles',
                ImageUrl: '',
            },
            { 
                title: '추천 제품', 
                description: '애견의 프로필에 따라 추천되는 제품을 관리하는 집합체입니다.', 
                key: 'recommendedProducts', 
                route: '/productRecommendations/recommendedProducts',
                ImageUrl: '',
            },
            { 
                title: '구매된 제품', 
                description: '애견주가 구매한 제품을 관리하는 집합체입니다.', 
                key: 'purchasedProducts', 
                route: '/productPurchases/purchasedProducts',
                ImageUrl: '',
            },
            { 
                title: '소셜 미디어 포스트', 
                description: '애견주의 소셜 미디어 포스트를 관리하는 집합체입니다.', 
                key: 'socialMediaPosts', 
                route: '/socialMediaInteractions/socialMediaPosts',
                ImageUrl: '',
            },
            { 
                title: '제품 후기', 
                description: '애견주의 제품 후기 및 평가를 관리하는 집합체입니다.', 
                key: 'productReviews', 
                route: '/productReviews/productReviews',
                ImageUrl: '',
            },
            
        ],
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },
    watch: {
        cards(newCards) {
            this.flipped = new Array(newCards.length).fill(false);
        },
    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
            this.flipped.fill(false);
        },
        goHome() {
            this.urlPath = null;
        },
        flipCard(index) {
            this.$set(this.flipped, index, true);
        },
        unflipCard(index) {
            this.$set(this.flipped, index, false);
        },
    }
};
</script>
<style>
</style>
