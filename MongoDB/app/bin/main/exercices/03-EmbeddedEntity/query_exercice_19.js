// Exo sur EmbeddedEntity

const result = db.EmbeddedEntity.find({
    
    "$or":[
        {"embedded.value": { "$gt":0.4}},
        {"extra.name":{"$exists":true}}
    ]
    
})
    printjson(result)