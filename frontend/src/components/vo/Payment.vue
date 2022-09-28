<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title>
            {{label}}
        </v-card-title>
        <v-card-text v-if="value">
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="PaymentType" v-model="value.paymentType"/>
            </div>
            <div v-else>
                PaymentType :  {{value.paymentType }}
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field type="number" label="Amount" v-model="value.amount"/>
            </div>
            <div v-else>
                Amount :  {{value.amount }}
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name:"Payment",
        props: {
            editMode: Boolean,
            value : Object,
            label : String,
        },
        created(){
            if(!this.value) {
                this.value = {
                    'paymentType': '',
                    'amount': 0,
                };
            }
        },
        watch: {
            value(newVal) {
                this.$emit('input', newVal);
            },
        },
    }
</script>

<style scoped>
    <div>
        <v-card style="width:300px; margin-left:5%;" outlined>
            
            <v-card-title>
                
            </v-card-title>
            <v-card-text style = "margin-left:-15px; margin-top:10px;">
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="PaymentType" v-model="value.paymentType"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    PaymentType :  {{value.paymentType }}
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Amount" v-model="value.amount"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Amount :  {{value.amount }}
                </div>
            </v-card-text>
        
        </v-card>
export default {
    name:"Payment",
    props: {
        editMode: Boolean,
        value : Object,
        label : String,
    },
    data: () => ({
        date: new Date().toISOString().substr(0, 10),
    }),
    
    
}
    .address-v-card-title {
        display: contents;
    .address-v-text-field {
        margin-top:5px;
</style>