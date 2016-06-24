class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

         "/"(action: "index",controller: "test")

        "500"(view:'/error')
	}
}
