// Exo sur les Aggregation

const result = db.SimpleEntity.aggregate([
    {$match:{
        $or:[
            {'disabled':false},
            {'disabled':{$exists:false}}
        ]}},
    {$group: {_id : 0, totalPrice : {$sum :'$price'}}}
])
    printjson(result);


