// Exo sur EmbeddedEntity

const result = db.EmbeddedEntity.find({
    "embedded.value": { "$gt":0.4},
    "name":{"$exists":true}

})
    printjson(result)
