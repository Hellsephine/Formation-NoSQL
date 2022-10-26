// Exo sur les Aggregation

const result = db.ReferencedEntity.aggregate([
    {$group: {_id : '$simple_entity_id' , totalPrice : {$sum :'$price'}}}
])
    printjson(result);