import org.jenkinsci.plugins.scriptsecurity.scripts.*


println "groovy:"
println "  - script: |"
println "      import org.jenkinsci.plugins.scriptsecurity.scripts.*"
println "      ScriptApproval scriptApproval = ScriptApproval.get()"
println "      ["

// List all Signatures approved on Jenkins
def signatures = ScriptApproval.get().getApprovedSignatures()
signatures.each { 
    //Print hash of each signature
    print "        '${it}'"
    //If not last signature, print comma
    if (it != signatures.last()) {
        println ","
    } else {
        println ""
    }
}
println "      ].each { hash -> scriptApproval.approveSignature(hash) }";
println "      ["
//List Signatures already approved assuming permission on Jenkins
def signaturesAcl = ScriptApproval.get().getAclApprovedSignatures()
signaturesAcl.each {
    //Print hash of each signature
    print "        '${it}'"
    //If not last signature, print comma
    if (it != signaturesAcl.last()) {
        println ", "
    } else {
        println ""
    }        
}
 
println "      ].each { hash -> scriptApproval.aclApproveSignature(hash) }";
println "      scriptApproval.save()"  