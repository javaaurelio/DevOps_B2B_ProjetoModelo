def getConfig(Environment) {
//List devList  = ["Select:selected", "Cluster Online - DEV", "Cluster Bank - DEV"]
//List prodList  = ["Select:selected", "Cluster Online - PROD", "Cluster Bank - PROD"]
def EnvironmentMap = [
	  "Cluster Online - DEV": [
		B2B_REST: [URL:"172.17.0.1:5074", AUTH: "Basic ZGFzaF9vcGVyOnBhc3N3b3Jk"],
		B2B_DEVOPS: [URL:"172.17.0.1:5077", AUTH: "Basic ZGFzaF9vcGVyOnBhc3N3b3Jk"],
		B2B_HOME_INSTALL: [DIR:"/opt/IBM/SterlingIntegrator", HOST:"172.17.0.1", USER: "fabio"],
        PROPERTIES_FILE: [FILE:"${JENKINS_HOME}/jarCustomizados/properties/PRD_CONFIG_APP_A.properties"]
	  ],
	  "Cluster Bank - DEV": [
		B2B_REST: [URL:"172.17.0.1:5074", AUTH: "Basic ZGFzaF9vcGVyOnBhc3N3b3Jk"],
		B2B_DEVOPS: [URL:"172.17.0.1:5077", AUTH: "Basic ZGFzaF9vcGVyOnBhc3N3b3Jk"],
		B2B_HOME_INSTALL: [DIR:"/opt/IBM/SterlingIntegrator", HOST:"172.17.0.1", USER: "fabio"],
        PROPERTIES_FILE: [FILE:"${JENKINS_HOME}/jarCustomizados/properties/PRD_CONFIG_APP_A.properties"]
	  ],
      "Cluster Online - PROD": [
		B2B_REST: [HOST:"172.17.0.1:5074", AUTH: "Basic ZGFzaF9vcGVyOnBhc3N3b3Jk"],
		B2B_DEVOPS: [URL:"172.17.0.1:5077", AUTH: "Basic ZGFzaF9vcGVyOnBhc3N3b3Jk"],
		B2B_HOME_INSTALL: [DIR:"/opt/IBM/SterlingIntegrator", HOST:"172.17.0.1", USER: "fabio"],
        PROPERTIES_FILE: [FILE:"${JENKINS_HOME}/jarCustomizados/properties/PRD_CONFIG_APP_A.properties"]
	  ],
      "Cluster Bank - PROD": [
		B2B_REST: [HOST:"172.17.0.1:5074", AUTH: "Basic ZGFzaF9vcGVyOnBhc3N3b3Jk"],
		B2B_DEVOPS: [URL:"172.17.0.1:5077", AUTH: "Basic ZGFzaF9vcGVyOnBhc3N3b3Jk"],
		B2B_HOME_INSTALL: [DIR:"/opt/IBM/SterlingIntegrator", HOST:"172.17.0.1", USER: "fabio"],
        PROPERTIES_FILE: [FILE:"${JENKINS_HOME}/jarCustomizados/properties/PRD_CONFIG_APP_A.properties"]
	  ]
]
   println("Environment_Selected: " + Environment)
   return EnvironmentMap[Environment]
}
return this