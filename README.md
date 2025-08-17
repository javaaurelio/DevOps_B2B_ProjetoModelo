# DevOps_B2B_ProjetoModelo


ERROR: Checkout of Git remote '/var/jenkins_home/git/DevOps_B2B_ProjetoModelo/local_remote.git' aborted because it references a local directory, which may be insecure. You can allow local checkouts anyway by setting the system property 'hudson.plugins.git.GitSCM.ALLOW_LOCAL_CHECKOUT' to true.
ERROR: Maximum checkout retry attempts reached, aborting


Resolucao(toda vez):
http://192.168.56.101:7070/manage/script

Script Console
hudson.plugins.git.GitSCM.ALLOW_LOCAL_CHECKOUT=true
