<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title v-if="editMode">
            {{label}}
        </v-card-title>

        <v-img
            style="width:400px; height:300px; border-radius:10px; position:relative; margin-left:5px; top:5px;"
            :style="editMode ? 'cursor:pointer;':''"
            :src="value.imgFile ? value.imgFile:'https://cdn.vuetifyjs.com/images/cards/cooking.png'"
            class="mx-auto"
            @click="selectFile()"
        ></v-img>

        <v-card-text v-if="value">
            <div v-if="editMode">
                <v-text-field label="Image Name" v-model="value.imgName"/>
                <slot name="actions"></slot>
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name:"Photo",
        props: {
            editMode: Boolean,
            value : Object,
            label : String, 
        },
        created(){
            if(!this.value) {
                this.value = {
                    'imgName': '',
                    'imgFile': '',
                };
            }
        },
        watch: {
            value(newVal) {
                this.$emit('input', newVal);
            },
        },
        methods: {
            selectFile(){
                if(this.editMode == false) {
                    return false;
                }

                var me = this
                var input = document.createElement("input");
                input.type = "file";
                input.accept = "image/*";
                input.id = "uploadInput";
                
                input.click();
                input.onchange = function (event) {
                    var file = event.target.files[0]
                    var reader = new FileReader();

                    reader.onload = function () {
                        var result = reader.result;
                        me.value.imgFile = result;
                        
                    };
                    reader.readAsDataURL( file );
                };
            },
        }
    }
</script>

<style scoped>
    <div>
        <v-card-title>
            
        <v-card-text style = "margin-left:-15px; margin-top:10px;">
            <div class="grey--text ml-4 photo-v-text-field" v-if="editMode" style = "margin-top:-20px;">
                <v-text-field label="Id" v-model="value.id"/>
            <div class="grey--text ml-4" style="margin-top:-25px;" v-else>
                Id :  {{value.id }}
            <div class="grey--text ml-4 photo-v-text-field" v-if="editMode" style = "margin-top:-20px;">
                <v-text-field label="Name" v-model="value.name"/>
            <div class="grey--text ml-4" v-else>
                Name :  {{value.name }}
            <div class="grey--text ml-4 photo-v-text-field" v-if="editMode" style = "margin-top:-20px;">
                <v-text-field label="Url" v-model="value.url"/>
            <div class="grey--text ml-4" v-else>
                Url :  {{value.url }}
export default {
    name:"Photo",
    props: {
        editMode: Boolean,
        value : Object,
        label : String, 
    },
    data: () => ({
        date: new Date().toISOString().substr(0, 10),
    }),
    
    
}
    .photo-v-text-field {
        margin-right:-30px;
    .address-v-text-field {
        margin-top:5px;
</style>