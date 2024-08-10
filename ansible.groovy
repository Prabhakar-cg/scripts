folder('artemis') {
    displayName('Artemis')
    description('Artemis mission')
    pipelineJob('Myfirstpipeline') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/Prabhakar-cg/scripts.git')
            }
        }
    }
}
}


