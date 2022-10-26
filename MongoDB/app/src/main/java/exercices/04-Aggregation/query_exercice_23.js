// Exo sur les Aggregation

const result = db.SimpleEntity.aggregate([
    {$group: {_id : '$disabled', totalPrice : {$sum :'$price'}}},
    {$group: {_id : '$disabled', TotalPrice : {$avg :'$totalPrice'}}}
])
    printjson(result);