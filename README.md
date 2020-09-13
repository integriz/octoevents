# Octo Events

Octo Event é uma aplicação que recebe eventos do Github Events via webhooks e os expõe via API para uso futuro.

![alt text](imgs/octo_events.png)

 A aplicação consiste na construção de 2 endpoints:

## 1. Endpoint Webhook

O endpoint Webhook recebe eventos do Github e os salva no banco Postgres. 

Detalhes sobre Webhooks:

* Webhooks Overview: https://developer.github.com/webhooks/ 
* Creating Webhooks : https://developer.github.com/webhooks/creating/
* Webhooks criada no link https://github.com/integriz/octoevents/settings/hooks

O endpoint é disponibilizado em `/events`

## 2. Endpoint Events 

O endpoint Events irá expor eventos por uma API que os filtrará através do número da issue:

**Request:**

> GET /issues/1000/events

**Response:**

> 200 OK
```javascript
[ 
  { "action": "open", created_at: "...",}, 
  { "action": "closed", created_at: "...",} 
]
```

**Instruções de integração com o Github **

* Foi utilizado o ngrok (https://ngrok.com/) como ferramenta para receber as chamadas do webhook na máquina local de teste. 
  Ele gera uma URL pública que roteia para a máquina local.

  No windows no prompt executado o comando ngrok http 4040 

![alt text](imgs/ngrok.png)

   GitHub

![alt text](imgs/add_webhook.png)
 
**Observações finais**

Criar banco com o nome teste ou se preferir outro nome altere o arquivo application.properties

A aplicação pode também ser disponibilizada no tomcat e está configurada no pom.xml bastando alterar <packaging>jar</packaging> para <packaging>war</packaging>

Api feita com springBoot 

Intruções de instalação e uso Projeto feito com: maven / 2.3.3.RELEASE / JUnit 5

1 - Clone esse projeto em um diretorio de dua maquina

2 - Navegue até a pasta raiz do projeto - [cd octoevent]

3 - Execute o comando maven: [mvn clean install] - Apos a execução do comando o maven irá gerar o .jar executavel na pasta target

4 - Execute o comando [java -jar target/octoevent-0.0.1-SNAPSHOT.jar] para iniciar a aplicação

5 - A aplicação criará o endpoint no endereço: http://localhost:8080/events.

6 - Ela espera receber uma requisição POST e receberá um json no seguinte formato:


{
    "zen": "Anything added dilutes everything else.",
    "hook_id": 999999999,
    "hook": {
        "type": "Repository",
        "id": 99999999,
        "name": "web",
        "active": true,
        "events": [
            "*"
        ],
        "config": {
            "content_type": "json",
            "insecure_ssl": "0",
            "secret": "********",
            "url": "http://ceb9e5400cd9.ngrok.io/events"
        },
        "updated_at": "2020-09-11T13:52:34Z",
        "created_at": "2020-09-11T13:52:34Z",
        "url": "https://api.github.com/repos/integriz/octoevents/hooks/999999999",
        "test_url": "https://api.github.com/repos/integriz/octoevents/hooks/999999999/test",
        "ping_url": "https://api.github.com/repos/integriz/octoevents/hooks/999999999/pings",
        "last_response": {
            "code": null,
            "status": "unused",
            "message": null
        }
    },
    "repository": {
        "id": 999999999,
        "node_id": "99999999yOTQ3MDQ0MDU=",
        "name": "octoevent",
        "full_name": "seulogin/octoevent",
        "private": false,
        "owner": {
            "login": "seulogin",
            "id": 99999999,
            "node_id": "MDQ6VXNlcjE4NjQ5MDg3",
            "avatar_url": "https://avatars3.githubusercontent.com/u/99999999?v=4",
            "gravatar_id": "",
            "url": "https://api.github.com/users/seulogin",
            "html_url": "https://github.com/seulogin",
            "followers_url": "https://api.github.com/users/seulogin/followers",
            "following_url": "https://api.github.com/users/seulogin/following{/other_user}",
            "gists_url": "https://api.github.com/users/seulogin/gists{/gist_id}",
            "starred_url": "https://api.github.com/users/seulogin/starred{/owner}{/repo}",
            "subscriptions_url": "https://api.github.com/users/seulogin/subscriptions",
            "organizations_url": "https://api.github.com/users/seulogin/orgs",
            "repos_url": "https://api.github.com/users/seulogin/repos",
            "events_url": "https://api.github.com/users/seulogin/events{/privacy}",
            "received_events_url": "https://api.github.com/users/seulogin/received_events",
            "type": "User",
            "site_admin": false
        },
        "html_url": "https://github.com/seulogin/octoevents",
        "description": "Octo Event é uma aplicação que recebe eventos do Github Events via webhooks e os expõe via API para uso futuro.",
        "fork": false,
        "url": "https://api.github.com/repos/seulogin/octoevents",
        "forks_url": "https://api.github.com/repos/seulogin/octoevents/forks",
        "keys_url": "https://api.github.com/repos/seulogin/octoevents/keys{/key_id}",
        "collaborators_url": "https://api.github.com/repos/seulogin/octoevents/collaborators{/collaborator}",
        "teams_url": "https://api.github.com/repos/seulogin/octoevents/teams",
        "hooks_url": "https://api.github.com/repos/seulogin/octoevents/hooks",
        "issue_events_url": "https://api.github.com/repos/seulogin/octoevents/issues/events{/number}",
        "events_url": "https://api.github.com/repos/seulogin/octoevents/events",
        "assignees_url": "https://api.github.com/repos/seulogin/octoevents/assignees{/user}",
        "branches_url": "https://api.github.com/repos/seulogin/octoevents/branches{/branch}",
        "tags_url": "https://api.github.com/repos/seulogin/octoevents/tags",
        "blobs_url": "https://api.github.com/repos/seulogin/octoevents/git/blobs{/sha}",
        "git_tags_url": "https://api.github.com/repos/seulogin/octoevents/git/tags{/sha}",
        "git_refs_url": "https://api.github.com/repos/seulogin/octoevents/git/refs{/sha}",
        "trees_url": "https://api.github.com/repos/seulogin/octoevents/git/trees{/sha}",
        "statuses_url": "https://api.github.com/repos/seulogin/octoevents/statuses/{sha}",
        "languages_url": "https://api.github.com/repos/seulogin/octoevents/languages",
        "stargazers_url": "https://api.github.com/repos/seulogin/octoevents/stargazers",
        "contributors_url": "https://api.github.com/repos/seulogin/octoevents/contributors",
        "subscribers_url": "https://api.github.com/repos/seulogin/octoevents/subscribers",
        "subscription_url": "https://api.github.com/repos/seulogin/octoevents/subscription",
        "commits_url": "https://api.github.com/repos/seulogin/octoevents/commits{/sha}",
        "git_commits_url": "https://api.github.com/repos/seulogin/octoevents/git/commits{/sha}",
        "comments_url": "https://api.github.com/repos/seulogin/octoevents/comments{/number}",
        "issue_comment_url": "https://api.github.com/repos/seulogin/octoevents/issues/comments{/number}",
        "contents_url": "https://api.github.com/repos/seulogin/octoevents/contents/{+path}",
        "compare_url": "https://api.github.com/repos/seulogin/octoevents/compare/{base}...{head}",
        "merges_url": "https://api.github.com/repos/seulogin/octoevents/merges",
        "archive_url": "https://api.github.com/repos/seulogin/octoevents/{archive_format}{/ref}",
        "downloads_url": "https://api.github.com/repos/seulogin/octoevents/downloads",
        "issues_url": "https://api.github.com/repos/seulogin/octoevents/issues{/number}",
        "pulls_url": "https://api.github.com/repos/seulogin/octoevents/pulls{/number}",
        "milestones_url": "https://api.github.com/repos/seulogin/octoevents/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/seulogin/octoevents/notifications{?since,all,participating}",
        "labels_url": "https://api.github.com/repos/seulogin/octoevents/labels{/name}",
        "releases_url": "https://api.github.com/repos/seulogin/octoevents/releases{/id}",
        "deployments_url": "https://api.github.com/repos/seulogin/octoevents/deployments",
        "created_at": "2020-09-11T13:35:37Z",
        "updated_at": "2020-09-11T13:35:37Z",
        "pushed_at": "2020-09-11T13:35:38Z",
        "git_url": "git://github.com/seulogin/octoevents.git",
        "ssh_url": "git@github.com:seulogin/octoevents.git",
        "clone_url": "https://github.com/seulogin/octoevents.git",
        "svn_url": "https://github.com/seulogin/octoevents",
        "homepage": null,
        "size": 0,
        "stargazers_count": 0,
        "watchers_count": 0,
        "language": null,
        "has_issues": true,
        "has_projects": true,
        "has_downloads": true,
        "has_wiki": true,
        "has_pages": false,
        "forks_count": 0,
        "mirror_url": null,
        "archived": false,
        "disabled": false,
        "open_issues_count": 0,
        "license": null,
        "forks": 0,
        "open_issues": 0,
        "watchers": 0,
        "default_branch": "master"
    },
    "sender": {
        "login": "seulogin",
        "id": 99999999,
        "node_id": "99999999jQ5MDg3",
        "avatar_url": "https://avatars3.githubusercontent.com/u/99999999?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/seulogin",
        "html_url": "https://github.com/seulogin",
        "followers_url": "https://api.github.com/users/seulogin/followers",
        "following_url": "https://api.github.com/users/seulogin/following{/other_user}",
        "gists_url": "https://api.github.com/users/seulogin/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/seulogin/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/seulogin/subscriptions",
        "organizations_url": "https://api.github.com/users/seulogin/orgs",
        "repos_url": "https://api.github.com/users/seulogin/repos",
        "events_url": "https://api.github.com/users/seulogin/events{/privacy}",
        "received_events_url": "https://api.github.com/users/seulogin/received_events",
        "type": "User",
        "site_admin": false
    }
}



7 - A aplicação criará o endpoint no endereço: http://localhost:8080/issues/999999999/events onde 999999999 deve ser substituido pelo hook_id que deseja pesquisar.

8 - Ela retorna um json através de uma requisição GET. Esse json pode ser importado no programa Postman.

Java 100.0%







