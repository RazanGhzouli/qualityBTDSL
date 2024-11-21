# README #


### What is this repository for? ###
The repository concerns the paper "Extending Behavior Trees for Robotic Missions with Quality Requirements." It contains the domain-specific language (DSL) we developed using model-driven (MD) techniques in the paper.
We built the DSL on top of [BehaviorTree.CPP 4.6](https://github.com/BehaviorTree/BehaviorTree.CPP). The meta-model provided can be seen as a meta-model for BehaviorTree.CPP with quality concerns. A high-resolution picture of our DSL's meta-model is provided [here](meta-model%20pictures).

### How do I set up the DSL? ###
Requirements: to develop the DSL we used the following tools:
- Eclipse Modeling Tools (version 2024-09 (4.33.0)).
- Xtext (version Xtext Complete SDK	2.36.0.v20240825-0714). Note that, in our experience, different versions of Xtext might cause errors, so it might be better to have the same version.
- The execution environment in Eclipse is Java-SE 21. Note that, in our experience, different versions of Java might cause errors, so it might be better to have the same version, or change in the "MANIFEST.MF" files, "Bundle-RequiredExecutionEnvironment" field, the Java to your own version.
We will add soon a demo video to show how to run the DSL.
### Who do I talk to? ###
* Razan Ghzouli razan.ghzouli@chalmers.se





