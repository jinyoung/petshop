<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title  v-if="editMode">
            {{label}}
        </v-card-title>
        <v-card-title  v-if="!editMode">
            Your Profile
            <v-col
                cols="12"
                sm="3"
            >
                <v-btn
                v-if="avatarMode"
                icon
                color="grey"
                @click="changeUserCard()"
                >
                    <v-icon>mdi-credit-card</v-icon>
                </v-btn>
                <v-btn
                v-if="!avatarMode"
                icon
                color="grey"
                @click="changeUserCard()"
                >
                    <v-icon>mdi-account-box</v-icon>
                </v-btn>
            </v-col>
        </v-card-title>

        <v-card-text v-if="value">
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Id" v-model="value.userId"/>
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Password" v-model="value.password"/>
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Name" v-model="value.name"/>
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Email" v-model="value.email"/>
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Address" v-model="value.address"/>
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Phone" v-model="value.phone"/>
            </div>
            <div v-if="!editMode">
                <v-card
                    v-if="!editMode && avatarMode"
                    class="mx-auto"
                    max-width="200"
                    height="200"
                    style="margin-bottom:10px;"
                >
                    <v-row
                        align="center"
                        class="fill-height"
                    >
                        <v-col class="py-0">
                            <v-avatar width="120" height="120" color="white" style="margin: 15px 0 -5px 40px;">
                                <v-img
                                    :src="value.profileImg ? value.profileImg:'https://user-images.githubusercontent.com/92732781/174538537-631a0ee2-40bb-4589-a58b-67da0ef17e38.png'"
                                    class="mx-auto"
                                ></v-img>
                            </v-avatar>
                            <v-list-item
                                color="rgba(0, 0, 0, .4)"
                            >
                                <v-list-item-content>
                                    <v-list-item-title class="text-h6" align="center">
                                        {{value.name }}
                                    </v-list-item-title>
                                </v-list-item-content>
                            </v-list-item>
                        </v-col>
                    </v-row>
                </v-card>
                <v-card
                    v-if="!editMode && !avatarMode"
                    class="mx-auto"
                    max-width="400"
                    style="margin-bottom:10px;"
                >
                    <v-row
                        align="end"
                        class="fill-height"
                    >
                        <v-col
                        align-self="start"
                        class="pa-0"
                        cols="12"
                        >
                        </v-col>
                        <v-col class="py-0">
                        <v-avatar color="white" style="margin: 15px 0 -5px 15px;">
                            <v-img
                                :src="value.profileImg ? value.profileImg:'https://user-images.githubusercontent.com/92732781/174538537-631a0ee2-40bb-4589-a58b-67da0ef17e38.png'"
                                class="mx-auto"
                            ></v-img>
                        </v-avatar>
                        <v-list-item
                            color="rgba(0, 0, 0, .4)"
                        >
                            <v-list-item-content>
                                <v-list-item-title class="text-h6">
                                    
                                </v-list-item-title>
                                <v-list-item-subtitle style="font-weight:500;">
                                    Id :  {{value.userId }}<br>
                                    Password :  {{value.password }}<br>
                                    Email :  {{value.email }}<br>
                                    Address :  {{value.address }}<br>
                                    Phone :  {{value.phone }}
                                </v-list-item-subtitle>
                            </v-list-item-content>
                        </v-list-item>
                        </v-col>
                    </v-row>
                </v-card>
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name:"User",
        props: {
            editMode: Boolean,
            value : Object,
            label : String, 
        },
        data: () => ({
            avatarMode : false,
        }),
        created(){
            if(!this.value) {
                this.value = {
                    'userId': '',
                    'password': '',
                    'name': '',
                    'email': '',
                    'address': '',
                    'phone': '',
                };
            }
        },
        watch: {
            value(newVal) {
                this.$emit('input', newVal);
            },
        },
        methods: {
            changeUserCard() {
                this.avatarMode = !this.avatarMode;
            }
        }
    }
</script>

<style scoped>
    <div>
        <v-card-title>
            
        <v-card-text style = "margin-left:-15px; margin-top:10px;">
            <div class="grey--text ml-4 user-v-text-field" v-if="editMode" style = "margin-top:-20px;">
                <v-text-field label="Id" v-model="value.id"/>
            <div class="grey--text ml-4" style="margin-top:-25px;" v-else>
                Id :  {{value.id }}
            <div class="grey--text ml-4 user-v-text-field" v-if="editMode" style = "margin-top:-20px;">
            <div class="grey--text ml-4" v-else>
                Password :  {{value.password }}
            <div class="grey--text ml-4 user-v-text-field" v-if="editMode" style = "margin-top:-20px;">
            <div class="grey--text ml-4" v-else>
                Name :  {{value.name }}
            <div class="grey--text ml-4 user-v-text-field" v-if="editMode" style = "margin-top:-20px;">
            <div class="grey--text ml-4" v-else>
                Email :  {{value.email }}
            <div class="grey--text ml-4 user-v-text-field" v-if="editMode" style = "margin-top:-20px;">
            <div class="grey--text ml-4" v-else>
                Address :  {{value.address }}
            <div class="grey--text ml-4 user-v-text-field" v-if="editMode" style = "margin-top:-20px;">
            <div class="grey--text ml-4" v-else>
                Phone :  {{value.phone }}
export default {
    name:"User",
    props: {
        editMode: Boolean,
        value : Object,
        label : String, 
    },
    data: () => ({
        date: new Date().toISOString().substr(0, 10),
        address: {}
    }),
    
}
    .user-v-text-field {
        margin-right:-30px;
    .edit-user-v-text-field {
        margin-top:5px;
        margin-bottom:-20px;
</style>