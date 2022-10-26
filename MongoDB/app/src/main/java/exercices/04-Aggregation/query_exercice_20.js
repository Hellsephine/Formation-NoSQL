// Exo sur les Aggregation

const result = db.SimpleEntity.aggregate({
    
   $group: {_id : 0, totalPrice : { $sum :'$price' }}
    
})
    printjson(result)