// Exo sur les Aggregation

const result = db.ArrayEntity.aggregate([ 
    {$unwind:{path: '$values'}},
    {$group: {_id : 0, totalPrice : {$sum :'$values'}}}
])
    printjson(result);