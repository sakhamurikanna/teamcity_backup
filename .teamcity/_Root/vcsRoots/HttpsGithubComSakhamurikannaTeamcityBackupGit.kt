package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object HttpsGithubComSakhamurikannaTeamcityBackupGit : GitVcsRoot({
    uuid = "72e82720-8321-4da7-9147-f1e4d13bde11"
    extId = "HttpsGithubComSakhamurikannaTeamcityBackupGit"
    name = "https://github.com/sakhamurikanna/teamcity_backup.git"
    url = "https://github.com/sakhamurikanna/teamcity_backup.git"
    authMethod = password {
        userName = "sakhamurikanna"
        password = "credentialsJSON:46c320aa-e0ac-409a-9b92-163ff1670036"
    }
})
