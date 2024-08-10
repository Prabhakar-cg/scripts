folder('artemis') {
    displayName('Artemis')
    description('Artemis mission')
}

job('artemis/myfirstjob') {
    description('My first job')
    scm {
        git('https://github.com/Prabhakar-cg/scripts.git')
    }
}


