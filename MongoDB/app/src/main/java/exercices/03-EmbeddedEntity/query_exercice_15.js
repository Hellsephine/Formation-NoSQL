// Exo sur EmbeddedEntity

const result = db.EmbeddedEntity.find({
    "embedded.name":"Embedded 2"

})
    printjson(result)
