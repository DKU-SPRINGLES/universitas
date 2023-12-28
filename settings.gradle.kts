rootProject.name = "universitas"

include("universitas-common")
include("universitas-domain")
include("universitas-usecase")

// infrastructure
include(":universitas-infrastructure-persistence")
project(":universitas-infrastructure-persistence").projectDir = file("universitas-infrastructure/persistence")

include(":universitas-infrastructure-http")
project(":universitas-infrastructure-http").projectDir = file("universitas-infrastructure/http")

include(":universitas-infrastructure-redis")
project(":universitas-infrastructure-redis").projectDir = file("universitas-infrastructure/redis")

// bootstrap
include(":universitas-bootstrap-api")
project(":universitas-bootstrap-api").projectDir = file("universitas-bootstrap/api")

include(":universitas-bootstrap-batch")
project(":universitas-bootstrap-batch").projectDir = file("universitas-bootstrap/batch")
