# README #


### What is this repository for? ###
The repository concerns the paper "Extending Behavior Trees for Robotic Missions with Quality Requirements." It contains the domain-specific language (DSL) we developed using model-driven (MD) techniques in the paper.
We built the DSL on top of [BehaviorTree.CPP 4.6](https://github.com/BehaviorTree/BehaviorTree.CPP). The meta-model provided can be seen as a meta-model for BehaviorTree.CPP with quality concerns. A high-resolution picture of our DSL's meta-model is provided [here](meta-model%20pictures).
The results of the survey presented in the paper can be found [here](/Paper-survey-results)

### How do I set up the DSL? ###
Requirements: to develop the DSL we used the following tools:
- Eclipse Modeling Tools (version 2024-09 (4.33.0)).
- Xtext (version Xtext Complete SDK	2.36.0.v20240825-0714). Note that, in our experience, different versions of Xtext might cause errors, so it might be better to have the same version.
- The execution environment in Eclipse is Java-SE 21. Note that, in our experience, different versions of Java might cause errors, so it might be better to have the same version, or change in the "MANIFEST.MF" files, "Bundle-RequiredExecutionEnvironment" field, the Java to your own version.

We will soon add a demo video to show how to run the DSL.

### Importnat files in the DSL: ###
In the following, we provide links to important files in the DSL that was mentioned in our paper:
- The meta-model of the DSL [btcpp.aird](btcpp/model)
- The grammar of the DSL, where the syntax and supported types of behavior-tree nodes are provided [QualityBtCpp.xtext](/org.xtext.btcpp.qualitybtcpp/src/org/xtext/btcpp/QualityBtCpp.xtext).
- The model-to-text transformer that auto-generates from our DSL model to BehaviorTree.CPP XML-like language [QualityBtCppGenerator.xtend](/org.xtext.btcpp.qualitybtcpp/src/org/xtext/btcpp/generator/QualityBtCppGenerator.xtend).
- Our DSL code for the illustrative example in the paper of the laboratory mobile robot [paper_example.qualitybtcpp](/illustrative_example/paper_example.qualitybtcpp).
### Who do I talk to? ###
* Razan Ghzouli razan.ghzouli@chalmers.se





