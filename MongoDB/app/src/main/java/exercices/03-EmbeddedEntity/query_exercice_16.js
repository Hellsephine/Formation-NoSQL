// Exo sur EmbeddedEntity

const result = db.EmbeddedEntity.find({
    "embedded.value": { "$gt":0.2}
})
    printjson(result)
