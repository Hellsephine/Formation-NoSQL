// Exo sur les Aggregation

const result = db.ArrayEntity.aggregate([
    {$unwind:{path: '$values'}},
    {$match:{'values':{$gt:0}}},
    {$group: {_id : 0, totalPrice : {$avg :'$values'}}}
])
    printjson(result);