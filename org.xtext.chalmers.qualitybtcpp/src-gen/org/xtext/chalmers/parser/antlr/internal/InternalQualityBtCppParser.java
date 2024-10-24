package org.xtext.chalmers.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.chalmers.services.QualityBtCppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQualityBtCppParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'main_tree_to_execute'", "'behaviortrees'", "','", "'}'", "'BehaviorTree'", "'ID'", "'node'", "'Parameter'", "'key'", "'value'", "'QualityRequirement'", "'description'", "'AlwaysFailureNode'", "'satisfices'", "'('", "')'", "'satisfies'", "'parameters'", "'AlwaysSuccessNode'", "'SetBlackboardNode'", "'output_key'", "'FallbackNode'", "'child'", "'IfThenElseNode'", "'ManualSelectorNode'", "'ParallelNode'", "'SequenceWithMemoryNode'", "'SwitchNode'", "'ReactiveFallbackNode'", "'WhileDoElseNode'", "'ReactiveSequenceNode'", "'SequenceNode'", "'TimeoutNode'", "'msec'", "'KeepRunningUntilFailureNode'", "'InverterNode'", "'ForceSuccessNode'", "'ForceFailureNode'", "'RepeatNode'", "'num_cycles'", "'SubTree'", "'ScriptNode'", "'ScriptConditionNode'", "'RetryNode'", "'num_attempts'", "'ParallelAllNode'", "'DelayNode'", "'delay_msec'", "'PreconditionNode'", "'EntryUpdatedDecoratorNode'", "'RunOnceNode'", "'LoopNode'", "'ConsumeQueueNode'", "'TestNode'", "'EntryUpdatedActionNode'", "'UnsetBlackboardNode'", "'ThreadedActionNode'", "'CoroActionNode'", "'SleepNode'", "'PopFromQueueNode'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalQualityBtCppParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQualityBtCppParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQualityBtCppParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQualityBtCpp.g"; }



     	private QualityBtCppGrammarAccess grammarAccess;

        public InternalQualityBtCppParser(TokenStream input, QualityBtCppGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected QualityBtCppGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalQualityBtCpp.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalQualityBtCpp.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalQualityBtCpp.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalQualityBtCpp.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'main_tree_to_execute' ( (lv_main_tree_to_execute_3_0= ruleEString ) ) otherlv_4= 'behaviortrees' otherlv_5= '{' ( (lv_behaviortrees_6_0= ruleBehaviorTree ) ) (otherlv_7= ',' ( (lv_behaviortrees_8_0= ruleBehaviorTree ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_main_tree_to_execute_3_0 = null;

        EObject lv_behaviortrees_6_0 = null;

        EObject lv_behaviortrees_8_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:77:2: ( (otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'main_tree_to_execute' ( (lv_main_tree_to_execute_3_0= ruleEString ) ) otherlv_4= 'behaviortrees' otherlv_5= '{' ( (lv_behaviortrees_6_0= ruleBehaviorTree ) ) (otherlv_7= ',' ( (lv_behaviortrees_8_0= ruleBehaviorTree ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalQualityBtCpp.g:78:2: (otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'main_tree_to_execute' ( (lv_main_tree_to_execute_3_0= ruleEString ) ) otherlv_4= 'behaviortrees' otherlv_5= '{' ( (lv_behaviortrees_6_0= ruleBehaviorTree ) ) (otherlv_7= ',' ( (lv_behaviortrees_8_0= ruleBehaviorTree ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalQualityBtCpp.g:78:2: (otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'main_tree_to_execute' ( (lv_main_tree_to_execute_3_0= ruleEString ) ) otherlv_4= 'behaviortrees' otherlv_5= '{' ( (lv_behaviortrees_6_0= ruleBehaviorTree ) ) (otherlv_7= ',' ( (lv_behaviortrees_8_0= ruleBehaviorTree ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalQualityBtCpp.g:79:3: otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'main_tree_to_execute' ( (lv_main_tree_to_execute_3_0= ruleEString ) ) otherlv_4= 'behaviortrees' otherlv_5= '{' ( (lv_behaviortrees_6_0= ruleBehaviorTree ) ) (otherlv_7= ',' ( (lv_behaviortrees_8_0= ruleBehaviorTree ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getRootKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getMain_tree_to_executeKeyword_2());
            		
            // InternalQualityBtCpp.g:91:3: ( (lv_main_tree_to_execute_3_0= ruleEString ) )
            // InternalQualityBtCpp.g:92:4: (lv_main_tree_to_execute_3_0= ruleEString )
            {
            // InternalQualityBtCpp.g:92:4: (lv_main_tree_to_execute_3_0= ruleEString )
            // InternalQualityBtCpp.g:93:5: lv_main_tree_to_execute_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRootAccess().getMain_tree_to_executeEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_main_tree_to_execute_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"main_tree_to_execute",
            						lv_main_tree_to_execute_3_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRootAccess().getBehaviortreesKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalQualityBtCpp.g:118:3: ( (lv_behaviortrees_6_0= ruleBehaviorTree ) )
            // InternalQualityBtCpp.g:119:4: (lv_behaviortrees_6_0= ruleBehaviorTree )
            {
            // InternalQualityBtCpp.g:119:4: (lv_behaviortrees_6_0= ruleBehaviorTree )
            // InternalQualityBtCpp.g:120:5: lv_behaviortrees_6_0= ruleBehaviorTree
            {

            					newCompositeNode(grammarAccess.getRootAccess().getBehaviortreesBehaviorTreeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_behaviortrees_6_0=ruleBehaviorTree();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					add(
            						current,
            						"behaviortrees",
            						lv_behaviortrees_6_0,
            						"org.xtext.chalmers.QualityBtCpp.BehaviorTree");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:137:3: (otherlv_7= ',' ( (lv_behaviortrees_8_0= ruleBehaviorTree ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQualityBtCpp.g:138:4: otherlv_7= ',' ( (lv_behaviortrees_8_0= ruleBehaviorTree ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRootAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalQualityBtCpp.g:142:4: ( (lv_behaviortrees_8_0= ruleBehaviorTree ) )
            	    // InternalQualityBtCpp.g:143:5: (lv_behaviortrees_8_0= ruleBehaviorTree )
            	    {
            	    // InternalQualityBtCpp.g:143:5: (lv_behaviortrees_8_0= ruleBehaviorTree )
            	    // InternalQualityBtCpp.g:144:6: lv_behaviortrees_8_0= ruleBehaviorTree
            	    {

            	    						newCompositeNode(grammarAccess.getRootAccess().getBehaviortreesBehaviorTreeParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_behaviortrees_8_0=ruleBehaviorTree();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"behaviortrees",
            	    							lv_behaviortrees_8_0,
            	    							"org.xtext.chalmers.QualityBtCpp.BehaviorTree");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleTreeNode"
    // InternalQualityBtCpp.g:174:1: entryRuleTreeNode returns [EObject current=null] : iv_ruleTreeNode= ruleTreeNode EOF ;
    public final EObject entryRuleTreeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreeNode = null;


        try {
            // InternalQualityBtCpp.g:174:49: (iv_ruleTreeNode= ruleTreeNode EOF )
            // InternalQualityBtCpp.g:175:2: iv_ruleTreeNode= ruleTreeNode EOF
            {
             newCompositeNode(grammarAccess.getTreeNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTreeNode=ruleTreeNode();

            state._fsp--;

             current =iv_ruleTreeNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTreeNode"


    // $ANTLR start "ruleTreeNode"
    // InternalQualityBtCpp.g:181:1: ruleTreeNode returns [EObject current=null] : (this_AlwaysFailureNode_0= ruleAlwaysFailureNode | this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode | this_SetBlackboardNode_2= ruleSetBlackboardNode | this_FallbackNode_3= ruleFallbackNode | this_IfThenElseNode_4= ruleIfThenElseNode | this_ManualSelectorNode_5= ruleManualSelectorNode | this_ParallelNode_6= ruleParallelNode | this_SequenceWithMemoryNode_7= ruleSequenceWithMemoryNode | this_SwitchNode_8= ruleSwitchNode | this_ReactiveFallbackNode_9= ruleReactiveFallbackNode | this_WhileDoElseNode_10= ruleWhileDoElseNode | this_ReactiveSequenceNode_11= ruleReactiveSequenceNode | this_SequenceNode_12= ruleSequenceNode | this_TimeoutNode_13= ruleTimeoutNode | this_KeepRunningUntilFailureNode_14= ruleKeepRunningUntilFailureNode | this_InverterNode_15= ruleInverterNode | this_ForceSuccessNode_16= ruleForceSuccessNode | this_ForceFailureNode_17= ruleForceFailureNode | this_RepeatNode_18= ruleRepeatNode | this_SubTree_19= ruleSubTree | this_ScriptNode_20= ruleScriptNode | this_ScriptConditionNode_21= ruleScriptConditionNode | this_RetryNode_22= ruleRetryNode | this_ParallelAllNode_23= ruleParallelAllNode | this_DelayNode_24= ruleDelayNode | this_PreconditionNode_25= rulePreconditionNode | this_EntryUpdatedDecoratorNode_26= ruleEntryUpdatedDecoratorNode | this_RunOnceNode_27= ruleRunOnceNode | this_LoopNode_28= ruleLoopNode | this_ConsumeQueueNode_29= ruleConsumeQueueNode | this_TestNode_30= ruleTestNode | this_EntryUpdatedActionNode_31= ruleEntryUpdatedActionNode | this_UnsetBlackboardNode_32= ruleUnsetBlackboardNode | this_ThreadedActionNode_33= ruleThreadedActionNode | this_CoroActionNode_34= ruleCoroActionNode | this_SleepNode_35= ruleSleepNode | this_PopFromQueueNode_36= rulePopFromQueueNode ) ;
    public final EObject ruleTreeNode() throws RecognitionException {
        EObject current = null;

        EObject this_AlwaysFailureNode_0 = null;

        EObject this_AlwaysSuccessNode_1 = null;

        EObject this_SetBlackboardNode_2 = null;

        EObject this_FallbackNode_3 = null;

        EObject this_IfThenElseNode_4 = null;

        EObject this_ManualSelectorNode_5 = null;

        EObject this_ParallelNode_6 = null;

        EObject this_SequenceWithMemoryNode_7 = null;

        EObject this_SwitchNode_8 = null;

        EObject this_ReactiveFallbackNode_9 = null;

        EObject this_WhileDoElseNode_10 = null;

        EObject this_ReactiveSequenceNode_11 = null;

        EObject this_SequenceNode_12 = null;

        EObject this_TimeoutNode_13 = null;

        EObject this_KeepRunningUntilFailureNode_14 = null;

        EObject this_InverterNode_15 = null;

        EObject this_ForceSuccessNode_16 = null;

        EObject this_ForceFailureNode_17 = null;

        EObject this_RepeatNode_18 = null;

        EObject this_SubTree_19 = null;

        EObject this_ScriptNode_20 = null;

        EObject this_ScriptConditionNode_21 = null;

        EObject this_RetryNode_22 = null;

        EObject this_ParallelAllNode_23 = null;

        EObject this_DelayNode_24 = null;

        EObject this_PreconditionNode_25 = null;

        EObject this_EntryUpdatedDecoratorNode_26 = null;

        EObject this_RunOnceNode_27 = null;

        EObject this_LoopNode_28 = null;

        EObject this_ConsumeQueueNode_29 = null;

        EObject this_TestNode_30 = null;

        EObject this_EntryUpdatedActionNode_31 = null;

        EObject this_UnsetBlackboardNode_32 = null;

        EObject this_ThreadedActionNode_33 = null;

        EObject this_CoroActionNode_34 = null;

        EObject this_SleepNode_35 = null;

        EObject this_PopFromQueueNode_36 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:187:2: ( (this_AlwaysFailureNode_0= ruleAlwaysFailureNode | this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode | this_SetBlackboardNode_2= ruleSetBlackboardNode | this_FallbackNode_3= ruleFallbackNode | this_IfThenElseNode_4= ruleIfThenElseNode | this_ManualSelectorNode_5= ruleManualSelectorNode | this_ParallelNode_6= ruleParallelNode | this_SequenceWithMemoryNode_7= ruleSequenceWithMemoryNode | this_SwitchNode_8= ruleSwitchNode | this_ReactiveFallbackNode_9= ruleReactiveFallbackNode | this_WhileDoElseNode_10= ruleWhileDoElseNode | this_ReactiveSequenceNode_11= ruleReactiveSequenceNode | this_SequenceNode_12= ruleSequenceNode | this_TimeoutNode_13= ruleTimeoutNode | this_KeepRunningUntilFailureNode_14= ruleKeepRunningUntilFailureNode | this_InverterNode_15= ruleInverterNode | this_ForceSuccessNode_16= ruleForceSuccessNode | this_ForceFailureNode_17= ruleForceFailureNode | this_RepeatNode_18= ruleRepeatNode | this_SubTree_19= ruleSubTree | this_ScriptNode_20= ruleScriptNode | this_ScriptConditionNode_21= ruleScriptConditionNode | this_RetryNode_22= ruleRetryNode | this_ParallelAllNode_23= ruleParallelAllNode | this_DelayNode_24= ruleDelayNode | this_PreconditionNode_25= rulePreconditionNode | this_EntryUpdatedDecoratorNode_26= ruleEntryUpdatedDecoratorNode | this_RunOnceNode_27= ruleRunOnceNode | this_LoopNode_28= ruleLoopNode | this_ConsumeQueueNode_29= ruleConsumeQueueNode | this_TestNode_30= ruleTestNode | this_EntryUpdatedActionNode_31= ruleEntryUpdatedActionNode | this_UnsetBlackboardNode_32= ruleUnsetBlackboardNode | this_ThreadedActionNode_33= ruleThreadedActionNode | this_CoroActionNode_34= ruleCoroActionNode | this_SleepNode_35= ruleSleepNode | this_PopFromQueueNode_36= rulePopFromQueueNode ) )
            // InternalQualityBtCpp.g:188:2: (this_AlwaysFailureNode_0= ruleAlwaysFailureNode | this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode | this_SetBlackboardNode_2= ruleSetBlackboardNode | this_FallbackNode_3= ruleFallbackNode | this_IfThenElseNode_4= ruleIfThenElseNode | this_ManualSelectorNode_5= ruleManualSelectorNode | this_ParallelNode_6= ruleParallelNode | this_SequenceWithMemoryNode_7= ruleSequenceWithMemoryNode | this_SwitchNode_8= ruleSwitchNode | this_ReactiveFallbackNode_9= ruleReactiveFallbackNode | this_WhileDoElseNode_10= ruleWhileDoElseNode | this_ReactiveSequenceNode_11= ruleReactiveSequenceNode | this_SequenceNode_12= ruleSequenceNode | this_TimeoutNode_13= ruleTimeoutNode | this_KeepRunningUntilFailureNode_14= ruleKeepRunningUntilFailureNode | this_InverterNode_15= ruleInverterNode | this_ForceSuccessNode_16= ruleForceSuccessNode | this_ForceFailureNode_17= ruleForceFailureNode | this_RepeatNode_18= ruleRepeatNode | this_SubTree_19= ruleSubTree | this_ScriptNode_20= ruleScriptNode | this_ScriptConditionNode_21= ruleScriptConditionNode | this_RetryNode_22= ruleRetryNode | this_ParallelAllNode_23= ruleParallelAllNode | this_DelayNode_24= ruleDelayNode | this_PreconditionNode_25= rulePreconditionNode | this_EntryUpdatedDecoratorNode_26= ruleEntryUpdatedDecoratorNode | this_RunOnceNode_27= ruleRunOnceNode | this_LoopNode_28= ruleLoopNode | this_ConsumeQueueNode_29= ruleConsumeQueueNode | this_TestNode_30= ruleTestNode | this_EntryUpdatedActionNode_31= ruleEntryUpdatedActionNode | this_UnsetBlackboardNode_32= ruleUnsetBlackboardNode | this_ThreadedActionNode_33= ruleThreadedActionNode | this_CoroActionNode_34= ruleCoroActionNode | this_SleepNode_35= ruleSleepNode | this_PopFromQueueNode_36= rulePopFromQueueNode )
            {
            // InternalQualityBtCpp.g:188:2: (this_AlwaysFailureNode_0= ruleAlwaysFailureNode | this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode | this_SetBlackboardNode_2= ruleSetBlackboardNode | this_FallbackNode_3= ruleFallbackNode | this_IfThenElseNode_4= ruleIfThenElseNode | this_ManualSelectorNode_5= ruleManualSelectorNode | this_ParallelNode_6= ruleParallelNode | this_SequenceWithMemoryNode_7= ruleSequenceWithMemoryNode | this_SwitchNode_8= ruleSwitchNode | this_ReactiveFallbackNode_9= ruleReactiveFallbackNode | this_WhileDoElseNode_10= ruleWhileDoElseNode | this_ReactiveSequenceNode_11= ruleReactiveSequenceNode | this_SequenceNode_12= ruleSequenceNode | this_TimeoutNode_13= ruleTimeoutNode | this_KeepRunningUntilFailureNode_14= ruleKeepRunningUntilFailureNode | this_InverterNode_15= ruleInverterNode | this_ForceSuccessNode_16= ruleForceSuccessNode | this_ForceFailureNode_17= ruleForceFailureNode | this_RepeatNode_18= ruleRepeatNode | this_SubTree_19= ruleSubTree | this_ScriptNode_20= ruleScriptNode | this_ScriptConditionNode_21= ruleScriptConditionNode | this_RetryNode_22= ruleRetryNode | this_ParallelAllNode_23= ruleParallelAllNode | this_DelayNode_24= ruleDelayNode | this_PreconditionNode_25= rulePreconditionNode | this_EntryUpdatedDecoratorNode_26= ruleEntryUpdatedDecoratorNode | this_RunOnceNode_27= ruleRunOnceNode | this_LoopNode_28= ruleLoopNode | this_ConsumeQueueNode_29= ruleConsumeQueueNode | this_TestNode_30= ruleTestNode | this_EntryUpdatedActionNode_31= ruleEntryUpdatedActionNode | this_UnsetBlackboardNode_32= ruleUnsetBlackboardNode | this_ThreadedActionNode_33= ruleThreadedActionNode | this_CoroActionNode_34= ruleCoroActionNode | this_SleepNode_35= ruleSleepNode | this_PopFromQueueNode_36= rulePopFromQueueNode )
            int alt2=37;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 38:
                {
                alt2=7;
                }
                break;
            case 39:
                {
                alt2=8;
                }
                break;
            case 40:
                {
                alt2=9;
                }
                break;
            case 41:
                {
                alt2=10;
                }
                break;
            case 42:
                {
                alt2=11;
                }
                break;
            case 43:
                {
                alt2=12;
                }
                break;
            case 44:
                {
                alt2=13;
                }
                break;
            case 45:
                {
                alt2=14;
                }
                break;
            case 47:
                {
                alt2=15;
                }
                break;
            case 48:
                {
                alt2=16;
                }
                break;
            case 49:
                {
                alt2=17;
                }
                break;
            case 50:
                {
                alt2=18;
                }
                break;
            case 51:
                {
                alt2=19;
                }
                break;
            case 53:
                {
                alt2=20;
                }
                break;
            case 54:
                {
                alt2=21;
                }
                break;
            case 55:
                {
                alt2=22;
                }
                break;
            case 56:
                {
                alt2=23;
                }
                break;
            case 58:
                {
                alt2=24;
                }
                break;
            case 59:
                {
                alt2=25;
                }
                break;
            case 61:
                {
                alt2=26;
                }
                break;
            case 62:
                {
                alt2=27;
                }
                break;
            case 63:
                {
                alt2=28;
                }
                break;
            case 64:
                {
                alt2=29;
                }
                break;
            case 65:
                {
                alt2=30;
                }
                break;
            case 66:
                {
                alt2=31;
                }
                break;
            case 67:
                {
                alt2=32;
                }
                break;
            case 68:
                {
                alt2=33;
                }
                break;
            case 69:
                {
                alt2=34;
                }
                break;
            case 70:
                {
                alt2=35;
                }
                break;
            case 71:
                {
                alt2=36;
                }
                break;
            case 72:
                {
                alt2=37;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQualityBtCpp.g:189:3: this_AlwaysFailureNode_0= ruleAlwaysFailureNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getAlwaysFailureNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlwaysFailureNode_0=ruleAlwaysFailureNode();

                    state._fsp--;


                    			current = this_AlwaysFailureNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityBtCpp.g:198:3: this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getAlwaysSuccessNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlwaysSuccessNode_1=ruleAlwaysSuccessNode();

                    state._fsp--;


                    			current = this_AlwaysSuccessNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityBtCpp.g:207:3: this_SetBlackboardNode_2= ruleSetBlackboardNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getSetBlackboardNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetBlackboardNode_2=ruleSetBlackboardNode();

                    state._fsp--;


                    			current = this_SetBlackboardNode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQualityBtCpp.g:216:3: this_FallbackNode_3= ruleFallbackNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getFallbackNodeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FallbackNode_3=ruleFallbackNode();

                    state._fsp--;


                    			current = this_FallbackNode_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQualityBtCpp.g:225:3: this_IfThenElseNode_4= ruleIfThenElseNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getIfThenElseNodeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfThenElseNode_4=ruleIfThenElseNode();

                    state._fsp--;


                    			current = this_IfThenElseNode_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQualityBtCpp.g:234:3: this_ManualSelectorNode_5= ruleManualSelectorNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getManualSelectorNodeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManualSelectorNode_5=ruleManualSelectorNode();

                    state._fsp--;


                    			current = this_ManualSelectorNode_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalQualityBtCpp.g:243:3: this_ParallelNode_6= ruleParallelNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getParallelNodeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelNode_6=ruleParallelNode();

                    state._fsp--;


                    			current = this_ParallelNode_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalQualityBtCpp.g:252:3: this_SequenceWithMemoryNode_7= ruleSequenceWithMemoryNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getSequenceWithMemoryNodeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceWithMemoryNode_7=ruleSequenceWithMemoryNode();

                    state._fsp--;


                    			current = this_SequenceWithMemoryNode_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalQualityBtCpp.g:261:3: this_SwitchNode_8= ruleSwitchNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getSwitchNodeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SwitchNode_8=ruleSwitchNode();

                    state._fsp--;


                    			current = this_SwitchNode_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalQualityBtCpp.g:270:3: this_ReactiveFallbackNode_9= ruleReactiveFallbackNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getReactiveFallbackNodeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReactiveFallbackNode_9=ruleReactiveFallbackNode();

                    state._fsp--;


                    			current = this_ReactiveFallbackNode_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalQualityBtCpp.g:279:3: this_WhileDoElseNode_10= ruleWhileDoElseNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getWhileDoElseNodeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileDoElseNode_10=ruleWhileDoElseNode();

                    state._fsp--;


                    			current = this_WhileDoElseNode_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalQualityBtCpp.g:288:3: this_ReactiveSequenceNode_11= ruleReactiveSequenceNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getReactiveSequenceNodeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReactiveSequenceNode_11=ruleReactiveSequenceNode();

                    state._fsp--;


                    			current = this_ReactiveSequenceNode_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalQualityBtCpp.g:297:3: this_SequenceNode_12= ruleSequenceNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getSequenceNodeParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceNode_12=ruleSequenceNode();

                    state._fsp--;


                    			current = this_SequenceNode_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalQualityBtCpp.g:306:3: this_TimeoutNode_13= ruleTimeoutNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getTimeoutNodeParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeoutNode_13=ruleTimeoutNode();

                    state._fsp--;


                    			current = this_TimeoutNode_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalQualityBtCpp.g:315:3: this_KeepRunningUntilFailureNode_14= ruleKeepRunningUntilFailureNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getKeepRunningUntilFailureNodeParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeepRunningUntilFailureNode_14=ruleKeepRunningUntilFailureNode();

                    state._fsp--;


                    			current = this_KeepRunningUntilFailureNode_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalQualityBtCpp.g:324:3: this_InverterNode_15= ruleInverterNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getInverterNodeParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_InverterNode_15=ruleInverterNode();

                    state._fsp--;


                    			current = this_InverterNode_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalQualityBtCpp.g:333:3: this_ForceSuccessNode_16= ruleForceSuccessNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getForceSuccessNodeParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForceSuccessNode_16=ruleForceSuccessNode();

                    state._fsp--;


                    			current = this_ForceSuccessNode_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalQualityBtCpp.g:342:3: this_ForceFailureNode_17= ruleForceFailureNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getForceFailureNodeParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForceFailureNode_17=ruleForceFailureNode();

                    state._fsp--;


                    			current = this_ForceFailureNode_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalQualityBtCpp.g:351:3: this_RepeatNode_18= ruleRepeatNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getRepeatNodeParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeatNode_18=ruleRepeatNode();

                    state._fsp--;


                    			current = this_RepeatNode_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalQualityBtCpp.g:360:3: this_SubTree_19= ruleSubTree
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getSubTreeParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubTree_19=ruleSubTree();

                    state._fsp--;


                    			current = this_SubTree_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalQualityBtCpp.g:369:3: this_ScriptNode_20= ruleScriptNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getScriptNodeParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScriptNode_20=ruleScriptNode();

                    state._fsp--;


                    			current = this_ScriptNode_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalQualityBtCpp.g:378:3: this_ScriptConditionNode_21= ruleScriptConditionNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getScriptConditionNodeParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScriptConditionNode_21=ruleScriptConditionNode();

                    state._fsp--;


                    			current = this_ScriptConditionNode_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalQualityBtCpp.g:387:3: this_RetryNode_22= ruleRetryNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getRetryNodeParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetryNode_22=ruleRetryNode();

                    state._fsp--;


                    			current = this_RetryNode_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalQualityBtCpp.g:396:3: this_ParallelAllNode_23= ruleParallelAllNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getParallelAllNodeParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelAllNode_23=ruleParallelAllNode();

                    state._fsp--;


                    			current = this_ParallelAllNode_23;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 25 :
                    // InternalQualityBtCpp.g:405:3: this_DelayNode_24= ruleDelayNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getDelayNodeParserRuleCall_24());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelayNode_24=ruleDelayNode();

                    state._fsp--;


                    			current = this_DelayNode_24;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 26 :
                    // InternalQualityBtCpp.g:414:3: this_PreconditionNode_25= rulePreconditionNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getPreconditionNodeParserRuleCall_25());
                    		
                    pushFollow(FOLLOW_2);
                    this_PreconditionNode_25=rulePreconditionNode();

                    state._fsp--;


                    			current = this_PreconditionNode_25;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 27 :
                    // InternalQualityBtCpp.g:423:3: this_EntryUpdatedDecoratorNode_26= ruleEntryUpdatedDecoratorNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getEntryUpdatedDecoratorNodeParserRuleCall_26());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntryUpdatedDecoratorNode_26=ruleEntryUpdatedDecoratorNode();

                    state._fsp--;


                    			current = this_EntryUpdatedDecoratorNode_26;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 28 :
                    // InternalQualityBtCpp.g:432:3: this_RunOnceNode_27= ruleRunOnceNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getRunOnceNodeParserRuleCall_27());
                    		
                    pushFollow(FOLLOW_2);
                    this_RunOnceNode_27=ruleRunOnceNode();

                    state._fsp--;


                    			current = this_RunOnceNode_27;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 29 :
                    // InternalQualityBtCpp.g:441:3: this_LoopNode_28= ruleLoopNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getLoopNodeParserRuleCall_28());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopNode_28=ruleLoopNode();

                    state._fsp--;


                    			current = this_LoopNode_28;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 30 :
                    // InternalQualityBtCpp.g:450:3: this_ConsumeQueueNode_29= ruleConsumeQueueNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getConsumeQueueNodeParserRuleCall_29());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConsumeQueueNode_29=ruleConsumeQueueNode();

                    state._fsp--;


                    			current = this_ConsumeQueueNode_29;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 31 :
                    // InternalQualityBtCpp.g:459:3: this_TestNode_30= ruleTestNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getTestNodeParserRuleCall_30());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestNode_30=ruleTestNode();

                    state._fsp--;


                    			current = this_TestNode_30;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 32 :
                    // InternalQualityBtCpp.g:468:3: this_EntryUpdatedActionNode_31= ruleEntryUpdatedActionNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getEntryUpdatedActionNodeParserRuleCall_31());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntryUpdatedActionNode_31=ruleEntryUpdatedActionNode();

                    state._fsp--;


                    			current = this_EntryUpdatedActionNode_31;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 33 :
                    // InternalQualityBtCpp.g:477:3: this_UnsetBlackboardNode_32= ruleUnsetBlackboardNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getUnsetBlackboardNodeParserRuleCall_32());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnsetBlackboardNode_32=ruleUnsetBlackboardNode();

                    state._fsp--;


                    			current = this_UnsetBlackboardNode_32;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 34 :
                    // InternalQualityBtCpp.g:486:3: this_ThreadedActionNode_33= ruleThreadedActionNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getThreadedActionNodeParserRuleCall_33());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThreadedActionNode_33=ruleThreadedActionNode();

                    state._fsp--;


                    			current = this_ThreadedActionNode_33;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 35 :
                    // InternalQualityBtCpp.g:495:3: this_CoroActionNode_34= ruleCoroActionNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getCoroActionNodeParserRuleCall_34());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoroActionNode_34=ruleCoroActionNode();

                    state._fsp--;


                    			current = this_CoroActionNode_34;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 36 :
                    // InternalQualityBtCpp.g:504:3: this_SleepNode_35= ruleSleepNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getSleepNodeParserRuleCall_35());
                    		
                    pushFollow(FOLLOW_2);
                    this_SleepNode_35=ruleSleepNode();

                    state._fsp--;


                    			current = this_SleepNode_35;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 37 :
                    // InternalQualityBtCpp.g:513:3: this_PopFromQueueNode_36= rulePopFromQueueNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getPopFromQueueNodeParserRuleCall_36());
                    		
                    pushFollow(FOLLOW_2);
                    this_PopFromQueueNode_36=rulePopFromQueueNode();

                    state._fsp--;


                    			current = this_PopFromQueueNode_36;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTreeNode"


    // $ANTLR start "entryRuleBehaviorTree"
    // InternalQualityBtCpp.g:525:1: entryRuleBehaviorTree returns [EObject current=null] : iv_ruleBehaviorTree= ruleBehaviorTree EOF ;
    public final EObject entryRuleBehaviorTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorTree = null;


        try {
            // InternalQualityBtCpp.g:525:53: (iv_ruleBehaviorTree= ruleBehaviorTree EOF )
            // InternalQualityBtCpp.g:526:2: iv_ruleBehaviorTree= ruleBehaviorTree EOF
            {
             newCompositeNode(grammarAccess.getBehaviorTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorTree=ruleBehaviorTree();

            state._fsp--;

             current =iv_ruleBehaviorTree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorTree"


    // $ANTLR start "ruleBehaviorTree"
    // InternalQualityBtCpp.g:532:1: ruleBehaviorTree returns [EObject current=null] : (otherlv_0= 'BehaviorTree' otherlv_1= '{' otherlv_2= 'ID' ( (lv_ID_3_0= ruleEString ) ) otherlv_4= 'node' otherlv_5= '{' ( (lv_node_6_0= ruleTreeNode ) ) (otherlv_7= ',' ( (lv_node_8_0= ruleTreeNode ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleBehaviorTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_ID_3_0 = null;

        EObject lv_node_6_0 = null;

        EObject lv_node_8_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:538:2: ( (otherlv_0= 'BehaviorTree' otherlv_1= '{' otherlv_2= 'ID' ( (lv_ID_3_0= ruleEString ) ) otherlv_4= 'node' otherlv_5= '{' ( (lv_node_6_0= ruleTreeNode ) ) (otherlv_7= ',' ( (lv_node_8_0= ruleTreeNode ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalQualityBtCpp.g:539:2: (otherlv_0= 'BehaviorTree' otherlv_1= '{' otherlv_2= 'ID' ( (lv_ID_3_0= ruleEString ) ) otherlv_4= 'node' otherlv_5= '{' ( (lv_node_6_0= ruleTreeNode ) ) (otherlv_7= ',' ( (lv_node_8_0= ruleTreeNode ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalQualityBtCpp.g:539:2: (otherlv_0= 'BehaviorTree' otherlv_1= '{' otherlv_2= 'ID' ( (lv_ID_3_0= ruleEString ) ) otherlv_4= 'node' otherlv_5= '{' ( (lv_node_6_0= ruleTreeNode ) ) (otherlv_7= ',' ( (lv_node_8_0= ruleTreeNode ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalQualityBtCpp.g:540:3: otherlv_0= 'BehaviorTree' otherlv_1= '{' otherlv_2= 'ID' ( (lv_ID_3_0= ruleEString ) ) otherlv_4= 'node' otherlv_5= '{' ( (lv_node_6_0= ruleTreeNode ) ) (otherlv_7= ',' ( (lv_node_8_0= ruleTreeNode ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorTreeAccess().getBehaviorTreeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorTreeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorTreeAccess().getIDKeyword_2());
            		
            // InternalQualityBtCpp.g:552:3: ( (lv_ID_3_0= ruleEString ) )
            // InternalQualityBtCpp.g:553:4: (lv_ID_3_0= ruleEString )
            {
            // InternalQualityBtCpp.g:553:4: (lv_ID_3_0= ruleEString )
            // InternalQualityBtCpp.g:554:5: lv_ID_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviorTreeAccess().getIDEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_ID_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorTreeRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_3_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviorTreeAccess().getNodeKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getBehaviorTreeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalQualityBtCpp.g:579:3: ( (lv_node_6_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:580:4: (lv_node_6_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:580:4: (lv_node_6_0= ruleTreeNode )
            // InternalQualityBtCpp.g:581:5: lv_node_6_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getBehaviorTreeAccess().getNodeTreeNodeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_node_6_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorTreeRule());
            					}
            					add(
            						current,
            						"node",
            						lv_node_6_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:598:3: (otherlv_7= ',' ( (lv_node_8_0= ruleTreeNode ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQualityBtCpp.g:599:4: otherlv_7= ',' ( (lv_node_8_0= ruleTreeNode ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBehaviorTreeAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalQualityBtCpp.g:603:4: ( (lv_node_8_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:604:5: (lv_node_8_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:604:5: (lv_node_8_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:605:6: lv_node_8_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getBehaviorTreeAccess().getNodeTreeNodeParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_node_8_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBehaviorTreeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"node",
            	    							lv_node_8_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getBehaviorTreeAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBehaviorTreeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorTree"


    // $ANTLR start "entryRuleEString"
    // InternalQualityBtCpp.g:635:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQualityBtCpp.g:635:47: (iv_ruleEString= ruleEString EOF )
            // InternalQualityBtCpp.g:636:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQualityBtCpp.g:642:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQualityBtCpp.g:648:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQualityBtCpp.g:649:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQualityBtCpp.g:649:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQualityBtCpp.g:650:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityBtCpp.g:658:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameter"
    // InternalQualityBtCpp.g:669:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalQualityBtCpp.g:669:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalQualityBtCpp.g:670:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalQualityBtCpp.g:676:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_key_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:682:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalQualityBtCpp.g:683:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalQualityBtCpp.g:683:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalQualityBtCpp.g:684:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getKeyKeyword_2());
            		
            // InternalQualityBtCpp.g:696:3: ( (lv_key_3_0= ruleEString ) )
            // InternalQualityBtCpp.g:697:4: (lv_key_3_0= ruleEString )
            {
            // InternalQualityBtCpp.g:697:4: (lv_key_3_0= ruleEString )
            // InternalQualityBtCpp.g:698:5: lv_key_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_key_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_3_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getValueKeyword_4());
            		
            // InternalQualityBtCpp.g:719:3: ( (lv_value_5_0= ruleEString ) )
            // InternalQualityBtCpp.g:720:4: (lv_value_5_0= ruleEString )
            {
            // InternalQualityBtCpp.g:720:4: (lv_value_5_0= ruleEString )
            // InternalQualityBtCpp.g:721:5: lv_value_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleQualityRequirement"
    // InternalQualityBtCpp.g:746:1: entryRuleQualityRequirement returns [EObject current=null] : iv_ruleQualityRequirement= ruleQualityRequirement EOF ;
    public final EObject entryRuleQualityRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityRequirement = null;


        try {
            // InternalQualityBtCpp.g:746:59: (iv_ruleQualityRequirement= ruleQualityRequirement EOF )
            // InternalQualityBtCpp.g:747:2: iv_ruleQualityRequirement= ruleQualityRequirement EOF
            {
             newCompositeNode(grammarAccess.getQualityRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityRequirement=ruleQualityRequirement();

            state._fsp--;

             current =iv_ruleQualityRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityRequirement"


    // $ANTLR start "ruleQualityRequirement"
    // InternalQualityBtCpp.g:753:1: ruleQualityRequirement returns [EObject current=null] : ( () otherlv_1= 'QualityRequirement' otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleQualityRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:759:2: ( ( () otherlv_1= 'QualityRequirement' otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalQualityBtCpp.g:760:2: ( () otherlv_1= 'QualityRequirement' otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalQualityBtCpp.g:760:2: ( () otherlv_1= 'QualityRequirement' otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalQualityBtCpp.g:761:3: () otherlv_1= 'QualityRequirement' otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalQualityBtCpp.g:761:3: ()
            // InternalQualityBtCpp.g:762:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualityRequirementAccess().getQualityRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQualityRequirementAccess().getQualityRequirementKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getQualityRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:776:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQualityBtCpp.g:777:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getQualityRequirementAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:781:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:782:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:782:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:783:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQualityRequirementAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQualityRequirementRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:801:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQualityBtCpp.g:802:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getQualityRequirementAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:806:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalQualityBtCpp.g:807:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:807:5: (lv_description_6_0= ruleEString )
                    // InternalQualityBtCpp.g:808:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQualityRequirementAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQualityRequirementRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getQualityRequirementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityRequirement"


    // $ANTLR start "entryRuleAlwaysFailureNode"
    // InternalQualityBtCpp.g:834:1: entryRuleAlwaysFailureNode returns [EObject current=null] : iv_ruleAlwaysFailureNode= ruleAlwaysFailureNode EOF ;
    public final EObject entryRuleAlwaysFailureNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysFailureNode = null;


        try {
            // InternalQualityBtCpp.g:834:58: (iv_ruleAlwaysFailureNode= ruleAlwaysFailureNode EOF )
            // InternalQualityBtCpp.g:835:2: iv_ruleAlwaysFailureNode= ruleAlwaysFailureNode EOF
            {
             newCompositeNode(grammarAccess.getAlwaysFailureNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlwaysFailureNode=ruleAlwaysFailureNode();

            state._fsp--;

             current =iv_ruleAlwaysFailureNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlwaysFailureNode"


    // $ANTLR start "ruleAlwaysFailureNode"
    // InternalQualityBtCpp.g:841:1: ruleAlwaysFailureNode returns [EObject current=null] : ( () otherlv_1= 'AlwaysFailureNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleAlwaysFailureNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:847:2: ( ( () otherlv_1= 'AlwaysFailureNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:848:2: ( () otherlv_1= 'AlwaysFailureNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:848:2: ( () otherlv_1= 'AlwaysFailureNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:849:3: () otherlv_1= 'AlwaysFailureNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:849:3: ()
            // InternalQualityBtCpp.g:850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlwaysFailureNodeAccess().getAlwaysFailureNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysFailureNodeAccess().getAlwaysFailureNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:860:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:861:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:861:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:862:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlwaysFailureNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlwaysFailureNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysFailureNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:883:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQualityBtCpp.g:884:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlwaysFailureNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:888:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:889:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:889:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:890:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlwaysFailureNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:908:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQualityBtCpp.g:909:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getAlwaysFailureNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlwaysFailureNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:917:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:918:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:918:5: ( ruleEString )
                    // InternalQualityBtCpp.g:919:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlwaysFailureNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlwaysFailureNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:933:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:934:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAlwaysFailureNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:938:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:939:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:939:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:940:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAlwaysFailureNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAlwaysFailureNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getAlwaysFailureNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:960:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQualityBtCpp.g:961:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getAlwaysFailureNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getAlwaysFailureNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:969:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:970:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:970:5: ( ruleEString )
                    // InternalQualityBtCpp.g:971:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlwaysFailureNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlwaysFailureNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:985:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:986:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAlwaysFailureNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:990:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:991:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:991:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:992:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAlwaysFailureNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAlwaysFailureNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getAlwaysFailureNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:1012:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQualityBtCpp.g:1013:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getAlwaysFailureNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getAlwaysFailureNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:1021:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:1022:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:1022:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:1023:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getAlwaysFailureNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysFailureNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1040:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1041:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getAlwaysFailureNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1045:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:1046:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:1046:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:1047:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlwaysFailureNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlwaysFailureNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getAlwaysFailureNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getAlwaysFailureNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlwaysFailureNode"


    // $ANTLR start "entryRuleAlwaysSuccessNode"
    // InternalQualityBtCpp.g:1078:1: entryRuleAlwaysSuccessNode returns [EObject current=null] : iv_ruleAlwaysSuccessNode= ruleAlwaysSuccessNode EOF ;
    public final EObject entryRuleAlwaysSuccessNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysSuccessNode = null;


        try {
            // InternalQualityBtCpp.g:1078:58: (iv_ruleAlwaysSuccessNode= ruleAlwaysSuccessNode EOF )
            // InternalQualityBtCpp.g:1079:2: iv_ruleAlwaysSuccessNode= ruleAlwaysSuccessNode EOF
            {
             newCompositeNode(grammarAccess.getAlwaysSuccessNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlwaysSuccessNode=ruleAlwaysSuccessNode();

            state._fsp--;

             current =iv_ruleAlwaysSuccessNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlwaysSuccessNode"


    // $ANTLR start "ruleAlwaysSuccessNode"
    // InternalQualityBtCpp.g:1085:1: ruleAlwaysSuccessNode returns [EObject current=null] : ( () otherlv_1= 'AlwaysSuccessNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleAlwaysSuccessNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:1091:2: ( ( () otherlv_1= 'AlwaysSuccessNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:1092:2: ( () otherlv_1= 'AlwaysSuccessNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:1092:2: ( () otherlv_1= 'AlwaysSuccessNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:1093:3: () otherlv_1= 'AlwaysSuccessNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:1093:3: ()
            // InternalQualityBtCpp.g:1094:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlwaysSuccessNodeAccess().getAlwaysSuccessNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysSuccessNodeAccess().getAlwaysSuccessNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:1104:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:1105:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:1105:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:1106:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysSuccessNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:1127:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQualityBtCpp.g:1128:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlwaysSuccessNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:1132:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:1133:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:1133:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:1134:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:1152:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQualityBtCpp.g:1153:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getAlwaysSuccessNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlwaysSuccessNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:1161:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:1162:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:1162:5: ( ruleEString )
                    // InternalQualityBtCpp.g:1163:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlwaysSuccessNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1177:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1178:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAlwaysSuccessNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1182:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:1183:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:1183:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:1184:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAlwaysSuccessNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getAlwaysSuccessNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:1204:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQualityBtCpp.g:1205:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getAlwaysSuccessNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getAlwaysSuccessNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:1213:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:1214:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:1214:5: ( ruleEString )
                    // InternalQualityBtCpp.g:1215:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlwaysSuccessNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1229:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1230:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAlwaysSuccessNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1234:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:1235:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:1235:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:1236:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAlwaysSuccessNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getAlwaysSuccessNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:1256:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQualityBtCpp.g:1257:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getAlwaysSuccessNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getAlwaysSuccessNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:1265:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:1266:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:1266:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:1267:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1284:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1285:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getAlwaysSuccessNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1289:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:1290:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:1290:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:1291:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getAlwaysSuccessNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getAlwaysSuccessNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlwaysSuccessNode"


    // $ANTLR start "entryRuleSetBlackboardNode"
    // InternalQualityBtCpp.g:1322:1: entryRuleSetBlackboardNode returns [EObject current=null] : iv_ruleSetBlackboardNode= ruleSetBlackboardNode EOF ;
    public final EObject entryRuleSetBlackboardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetBlackboardNode = null;


        try {
            // InternalQualityBtCpp.g:1322:58: (iv_ruleSetBlackboardNode= ruleSetBlackboardNode EOF )
            // InternalQualityBtCpp.g:1323:2: iv_ruleSetBlackboardNode= ruleSetBlackboardNode EOF
            {
             newCompositeNode(grammarAccess.getSetBlackboardNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetBlackboardNode=ruleSetBlackboardNode();

            state._fsp--;

             current =iv_ruleSetBlackboardNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetBlackboardNode"


    // $ANTLR start "ruleSetBlackboardNode"
    // InternalQualityBtCpp.g:1329:1: ruleSetBlackboardNode returns [EObject current=null] : (otherlv_0= 'SetBlackboardNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'output_key' ( (lv_output_key_8_0= ruleEString ) ) (otherlv_9= 'satisfices' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'satisfies' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'parameters' otherlv_22= '{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleSetBlackboardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_output_key_8_0 = null;

        EObject lv_parameters_23_0 = null;

        EObject lv_parameters_25_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:1335:2: ( (otherlv_0= 'SetBlackboardNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'output_key' ( (lv_output_key_8_0= ruleEString ) ) (otherlv_9= 'satisfices' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'satisfies' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'parameters' otherlv_22= '{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalQualityBtCpp.g:1336:2: (otherlv_0= 'SetBlackboardNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'output_key' ( (lv_output_key_8_0= ruleEString ) ) (otherlv_9= 'satisfices' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'satisfies' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'parameters' otherlv_22= '{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalQualityBtCpp.g:1336:2: (otherlv_0= 'SetBlackboardNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'output_key' ( (lv_output_key_8_0= ruleEString ) ) (otherlv_9= 'satisfices' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'satisfies' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'parameters' otherlv_22= '{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalQualityBtCpp.g:1337:3: otherlv_0= 'SetBlackboardNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'output_key' ( (lv_output_key_8_0= ruleEString ) ) (otherlv_9= 'satisfices' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'satisfies' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'parameters' otherlv_22= '{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSetBlackboardNodeAccess().getSetBlackboardNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:1341:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:1342:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:1342:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:1343:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSetBlackboardNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:1364:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQualityBtCpp.g:1365:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetBlackboardNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:1369:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:1370:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:1370:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:1371:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSetBlackboardNodeAccess().getValueKeyword_4());
            		
            // InternalQualityBtCpp.g:1393:3: ( (lv_value_6_0= ruleEString ) )
            // InternalQualityBtCpp.g:1394:4: (lv_value_6_0= ruleEString )
            {
            // InternalQualityBtCpp.g:1394:4: (lv_value_6_0= ruleEString )
            // InternalQualityBtCpp.g:1395:5: lv_value_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getValueEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_value_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSetBlackboardNodeAccess().getOutput_keyKeyword_6());
            		
            // InternalQualityBtCpp.g:1416:3: ( (lv_output_key_8_0= ruleEString ) )
            // InternalQualityBtCpp.g:1417:4: (lv_output_key_8_0= ruleEString )
            {
            // InternalQualityBtCpp.g:1417:4: (lv_output_key_8_0= ruleEString )
            // InternalQualityBtCpp.g:1418:5: lv_output_key_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getOutput_keyEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_output_key_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
            					}
            					set(
            						current,
            						"output_key",
            						lv_output_key_8_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:1435:3: (otherlv_9= 'satisfices' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQualityBtCpp.g:1436:4: otherlv_9= 'satisfices' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getSetBlackboardNodeAccess().getSatisficesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getSetBlackboardNodeAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalQualityBtCpp.g:1444:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:1445:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:1445:5: ( ruleEString )
                    // InternalQualityBtCpp.g:1446:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetBlackboardNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getSatisficesQualityCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1460:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1461:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSetBlackboardNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1465:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:1466:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:1466:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:1467:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSetBlackboardNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getSatisficesQualityCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getSetBlackboardNodeAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:1487:3: (otherlv_15= 'satisfies' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQualityBtCpp.g:1488:4: otherlv_15= 'satisfies' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getSetBlackboardNodeAccess().getSatisfiesKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getSetBlackboardNodeAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalQualityBtCpp.g:1496:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:1497:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:1497:5: ( ruleEString )
                    // InternalQualityBtCpp.g:1498:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetBlackboardNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getSatisfiesQualityRequirementCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1512:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1513:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSetBlackboardNodeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1517:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:1518:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:1518:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:1519:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSetBlackboardNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getSatisfiesQualityRequirementCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getSetBlackboardNodeAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:1539:3: (otherlv_21= 'parameters' otherlv_22= '{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQualityBtCpp.g:1540:4: otherlv_21= 'parameters' otherlv_22= '{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getSetBlackboardNodeAccess().getParametersKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_22, grammarAccess.getSetBlackboardNodeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalQualityBtCpp.g:1548:4: ( (lv_parameters_23_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:1549:5: (lv_parameters_23_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:1549:5: (lv_parameters_23_0= ruleParameter )
                    // InternalQualityBtCpp.g:1550:6: lv_parameters_23_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getParametersParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_23_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_23_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1567:4: (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1568:5: otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getSetBlackboardNodeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1572:5: ( (lv_parameters_25_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:1573:6: (lv_parameters_25_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:1573:6: (lv_parameters_25_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:1574:7: lv_parameters_25_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getParametersParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_25_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_25_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_26, grammarAccess.getSetBlackboardNodeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getSetBlackboardNodeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetBlackboardNode"


    // $ANTLR start "entryRuleFallbackNode"
    // InternalQualityBtCpp.g:1605:1: entryRuleFallbackNode returns [EObject current=null] : iv_ruleFallbackNode= ruleFallbackNode EOF ;
    public final EObject entryRuleFallbackNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFallbackNode = null;


        try {
            // InternalQualityBtCpp.g:1605:53: (iv_ruleFallbackNode= ruleFallbackNode EOF )
            // InternalQualityBtCpp.g:1606:2: iv_ruleFallbackNode= ruleFallbackNode EOF
            {
             newCompositeNode(grammarAccess.getFallbackNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFallbackNode=ruleFallbackNode();

            state._fsp--;

             current =iv_ruleFallbackNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFallbackNode"


    // $ANTLR start "ruleFallbackNode"
    // InternalQualityBtCpp.g:1612:1: ruleFallbackNode returns [EObject current=null] : (otherlv_0= 'FallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleFallbackNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:1618:2: ( (otherlv_0= 'FallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:1619:2: (otherlv_0= 'FallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:1619:2: (otherlv_0= 'FallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:1620:3: otherlv_0= 'FallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFallbackNodeAccess().getFallbackNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:1624:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:1625:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:1625:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:1626:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFallbackNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getFallbackNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:1647:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQualityBtCpp.g:1648:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getFallbackNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:1652:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:1653:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:1653:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:1654:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:1672:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQualityBtCpp.g:1673:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getFallbackNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getFallbackNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:1681:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:1682:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:1682:5: ( ruleEString )
                    // InternalQualityBtCpp.g:1683:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFallbackNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1697:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1698:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFallbackNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1702:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:1703:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:1703:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:1704:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFallbackNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFallbackNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getFallbackNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:1724:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQualityBtCpp.g:1725:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getFallbackNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getFallbackNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:1733:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:1734:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:1734:5: ( ruleEString )
                    // InternalQualityBtCpp.g:1735:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFallbackNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1749:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1750:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getFallbackNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1754:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:1755:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:1755:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:1756:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFallbackNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFallbackNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getFallbackNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:1776:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQualityBtCpp.g:1777:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getFallbackNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getFallbackNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:1785:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:1786:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:1786:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:1787:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1804:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==15) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1805:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getFallbackNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1809:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:1810:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:1810:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:1811:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFallbackNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getFallbackNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getFallbackNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getFallbackNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:1842:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:1843:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:1843:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:1844:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getFallbackNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:1861:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==15) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalQualityBtCpp.g:1862:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getFallbackNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:1866:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:1867:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:1867:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:1868:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getFallbackNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getFallbackNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFallbackNode"


    // $ANTLR start "entryRuleIfThenElseNode"
    // InternalQualityBtCpp.g:1898:1: entryRuleIfThenElseNode returns [EObject current=null] : iv_ruleIfThenElseNode= ruleIfThenElseNode EOF ;
    public final EObject entryRuleIfThenElseNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElseNode = null;


        try {
            // InternalQualityBtCpp.g:1898:55: (iv_ruleIfThenElseNode= ruleIfThenElseNode EOF )
            // InternalQualityBtCpp.g:1899:2: iv_ruleIfThenElseNode= ruleIfThenElseNode EOF
            {
             newCompositeNode(grammarAccess.getIfThenElseNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElseNode=ruleIfThenElseNode();

            state._fsp--;

             current =iv_ruleIfThenElseNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElseNode"


    // $ANTLR start "ruleIfThenElseNode"
    // InternalQualityBtCpp.g:1905:1: ruleIfThenElseNode returns [EObject current=null] : (otherlv_0= 'IfThenElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleIfThenElseNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:1911:2: ( (otherlv_0= 'IfThenElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:1912:2: (otherlv_0= 'IfThenElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:1912:2: (otherlv_0= 'IfThenElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:1913:3: otherlv_0= 'IfThenElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIfThenElseNodeAccess().getIfThenElseNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:1917:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:1918:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:1918:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:1919:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getIfThenElseNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:1940:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQualityBtCpp.g:1941:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getIfThenElseNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:1945:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:1946:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:1946:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:1947:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:1965:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQualityBtCpp.g:1966:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfThenElseNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfThenElseNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:1974:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:1975:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:1975:5: ( ruleEString )
                    // InternalQualityBtCpp.g:1976:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIfThenElseNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:1990:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:1991:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getIfThenElseNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:1995:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:1996:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:1996:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:1997:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIfThenElseNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfThenElseNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:2017:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQualityBtCpp.g:2018:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getIfThenElseNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getIfThenElseNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:2026:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:2027:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:2027:5: ( ruleEString )
                    // InternalQualityBtCpp.g:2028:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIfThenElseNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2042:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2043:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getIfThenElseNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2047:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:2048:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:2048:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:2049:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIfThenElseNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getIfThenElseNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:2069:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQualityBtCpp.g:2070:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getIfThenElseNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getIfThenElseNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:2078:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:2079:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:2079:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:2080:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2097:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2098:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getIfThenElseNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2102:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:2103:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:2103:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:2104:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getIfThenElseNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getIfThenElseNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getIfThenElseNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:2135:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:2136:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:2136:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:2137:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:2154:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==15) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalQualityBtCpp.g:2155:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getIfThenElseNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:2159:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:2160:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:2160:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:2161:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getIfThenElseNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getIfThenElseNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElseNode"


    // $ANTLR start "entryRuleManualSelectorNode"
    // InternalQualityBtCpp.g:2191:1: entryRuleManualSelectorNode returns [EObject current=null] : iv_ruleManualSelectorNode= ruleManualSelectorNode EOF ;
    public final EObject entryRuleManualSelectorNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualSelectorNode = null;


        try {
            // InternalQualityBtCpp.g:2191:59: (iv_ruleManualSelectorNode= ruleManualSelectorNode EOF )
            // InternalQualityBtCpp.g:2192:2: iv_ruleManualSelectorNode= ruleManualSelectorNode EOF
            {
             newCompositeNode(grammarAccess.getManualSelectorNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManualSelectorNode=ruleManualSelectorNode();

            state._fsp--;

             current =iv_ruleManualSelectorNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManualSelectorNode"


    // $ANTLR start "ruleManualSelectorNode"
    // InternalQualityBtCpp.g:2198:1: ruleManualSelectorNode returns [EObject current=null] : (otherlv_0= 'ManualSelectorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleManualSelectorNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:2204:2: ( (otherlv_0= 'ManualSelectorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:2205:2: (otherlv_0= 'ManualSelectorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:2205:2: (otherlv_0= 'ManualSelectorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:2206:3: otherlv_0= 'ManualSelectorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getManualSelectorNodeAccess().getManualSelectorNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:2210:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:2211:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:2211:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:2212:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManualSelectorNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getManualSelectorNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:2233:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQualityBtCpp.g:2234:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getManualSelectorNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:2238:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:2239:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:2239:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:2240:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getManualSelectorNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:2258:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQualityBtCpp.g:2259:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getManualSelectorNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getManualSelectorNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:2267:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:2268:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:2268:5: ( ruleEString )
                    // InternalQualityBtCpp.g:2269:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManualSelectorNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2283:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==15) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2284:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getManualSelectorNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2288:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:2289:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:2289:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:2290:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManualSelectorNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getManualSelectorNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:2310:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQualityBtCpp.g:2311:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getManualSelectorNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getManualSelectorNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:2319:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:2320:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:2320:5: ( ruleEString )
                    // InternalQualityBtCpp.g:2321:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManualSelectorNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2335:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==15) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2336:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getManualSelectorNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2340:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:2341:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:2341:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:2342:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManualSelectorNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getManualSelectorNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:2362:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQualityBtCpp.g:2363:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getManualSelectorNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getManualSelectorNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:2371:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:2372:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:2372:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:2373:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getManualSelectorNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2390:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==15) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2391:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getManualSelectorNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2395:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:2396:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:2396:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:2397:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getManualSelectorNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getManualSelectorNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getManualSelectorNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getManualSelectorNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:2428:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:2429:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:2429:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:2430:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManualSelectorNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:2447:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==15) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalQualityBtCpp.g:2448:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getManualSelectorNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:2452:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:2453:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:2453:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:2454:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getManualSelectorNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getManualSelectorNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getManualSelectorNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getManualSelectorNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManualSelectorNode"


    // $ANTLR start "entryRuleParallelNode"
    // InternalQualityBtCpp.g:2484:1: entryRuleParallelNode returns [EObject current=null] : iv_ruleParallelNode= ruleParallelNode EOF ;
    public final EObject entryRuleParallelNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelNode = null;


        try {
            // InternalQualityBtCpp.g:2484:53: (iv_ruleParallelNode= ruleParallelNode EOF )
            // InternalQualityBtCpp.g:2485:2: iv_ruleParallelNode= ruleParallelNode EOF
            {
             newCompositeNode(grammarAccess.getParallelNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelNode=ruleParallelNode();

            state._fsp--;

             current =iv_ruleParallelNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallelNode"


    // $ANTLR start "ruleParallelNode"
    // InternalQualityBtCpp.g:2491:1: ruleParallelNode returns [EObject current=null] : (otherlv_0= 'ParallelNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleParallelNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:2497:2: ( (otherlv_0= 'ParallelNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:2498:2: (otherlv_0= 'ParallelNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:2498:2: (otherlv_0= 'ParallelNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:2499:3: otherlv_0= 'ParallelNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelNodeAccess().getParallelNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:2503:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:2504:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:2504:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:2505:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParallelNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParallelNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getParallelNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:2526:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQualityBtCpp.g:2527:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallelNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:2531:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:2532:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:2532:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:2533:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParallelNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:2551:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==26) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQualityBtCpp.g:2552:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallelNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallelNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:2560:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:2561:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:2561:5: ( ruleEString )
                    // InternalQualityBtCpp.g:2562:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2576:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==15) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2577:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getParallelNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2581:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:2582:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:2582:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:2583:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallelNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:2603:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==29) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQualityBtCpp.g:2604:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallelNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getParallelNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:2612:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:2613:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:2613:5: ( ruleEString )
                    // InternalQualityBtCpp.g:2614:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2628:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==15) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2629:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getParallelNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2633:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:2634:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:2634:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:2635:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallelNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:2655:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==30) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQualityBtCpp.g:2656:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getParallelNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallelNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:2664:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:2665:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:2665:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:2666:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getParallelNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2683:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==15) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2684:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getParallelNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2688:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:2689:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:2689:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:2690:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getParallelNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParallelNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallelNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getParallelNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getParallelNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:2721:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:2722:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:2722:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:2723:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getParallelNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParallelNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:2740:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==15) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalQualityBtCpp.g:2741:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getParallelNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:2745:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:2746:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:2746:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:2747:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getParallelNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParallelNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getParallelNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getParallelNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallelNode"


    // $ANTLR start "entryRuleSequenceWithMemoryNode"
    // InternalQualityBtCpp.g:2777:1: entryRuleSequenceWithMemoryNode returns [EObject current=null] : iv_ruleSequenceWithMemoryNode= ruleSequenceWithMemoryNode EOF ;
    public final EObject entryRuleSequenceWithMemoryNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceWithMemoryNode = null;


        try {
            // InternalQualityBtCpp.g:2777:63: (iv_ruleSequenceWithMemoryNode= ruleSequenceWithMemoryNode EOF )
            // InternalQualityBtCpp.g:2778:2: iv_ruleSequenceWithMemoryNode= ruleSequenceWithMemoryNode EOF
            {
             newCompositeNode(grammarAccess.getSequenceWithMemoryNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceWithMemoryNode=ruleSequenceWithMemoryNode();

            state._fsp--;

             current =iv_ruleSequenceWithMemoryNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceWithMemoryNode"


    // $ANTLR start "ruleSequenceWithMemoryNode"
    // InternalQualityBtCpp.g:2784:1: ruleSequenceWithMemoryNode returns [EObject current=null] : (otherlv_0= 'SequenceWithMemoryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleSequenceWithMemoryNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:2790:2: ( (otherlv_0= 'SequenceWithMemoryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:2791:2: (otherlv_0= 'SequenceWithMemoryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:2791:2: (otherlv_0= 'SequenceWithMemoryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:2792:3: otherlv_0= 'SequenceWithMemoryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceWithMemoryNodeAccess().getSequenceWithMemoryNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:2796:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:2797:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:2797:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:2798:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceWithMemoryNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceWithMemoryNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:2819:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==18) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalQualityBtCpp.g:2820:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSequenceWithMemoryNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:2824:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:2825:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:2825:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:2826:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceWithMemoryNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:2844:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==26) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalQualityBtCpp.g:2845:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getSequenceWithMemoryNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getSequenceWithMemoryNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:2853:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:2854:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:2854:5: ( ruleEString )
                    // InternalQualityBtCpp.g:2855:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequenceWithMemoryNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2869:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==15) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2870:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSequenceWithMemoryNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2874:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:2875:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:2875:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:2876:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSequenceWithMemoryNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getSequenceWithMemoryNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:2896:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==29) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalQualityBtCpp.g:2897:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getSequenceWithMemoryNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getSequenceWithMemoryNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:2905:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:2906:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:2906:5: ( ruleEString )
                    // InternalQualityBtCpp.g:2907:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequenceWithMemoryNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2921:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==15) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2922:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getSequenceWithMemoryNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2926:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:2927:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:2927:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:2928:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSequenceWithMemoryNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getSequenceWithMemoryNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:2948:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==30) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalQualityBtCpp.g:2949:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSequenceWithMemoryNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getSequenceWithMemoryNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:2957:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:2958:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:2958:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:2959:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceWithMemoryNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:2976:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==15) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:2977:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getSequenceWithMemoryNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:2981:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:2982:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:2982:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:2983:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceWithMemoryNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getSequenceWithMemoryNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getSequenceWithMemoryNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getSequenceWithMemoryNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:3014:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:3015:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:3015:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:3016:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceWithMemoryNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:3033:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==15) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalQualityBtCpp.g:3034:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getSequenceWithMemoryNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:3038:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:3039:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:3039:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:3040:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceWithMemoryNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceWithMemoryNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getSequenceWithMemoryNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getSequenceWithMemoryNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceWithMemoryNode"


    // $ANTLR start "entryRuleSwitchNode"
    // InternalQualityBtCpp.g:3070:1: entryRuleSwitchNode returns [EObject current=null] : iv_ruleSwitchNode= ruleSwitchNode EOF ;
    public final EObject entryRuleSwitchNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchNode = null;


        try {
            // InternalQualityBtCpp.g:3070:51: (iv_ruleSwitchNode= ruleSwitchNode EOF )
            // InternalQualityBtCpp.g:3071:2: iv_ruleSwitchNode= ruleSwitchNode EOF
            {
             newCompositeNode(grammarAccess.getSwitchNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchNode=ruleSwitchNode();

            state._fsp--;

             current =iv_ruleSwitchNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchNode"


    // $ANTLR start "ruleSwitchNode"
    // InternalQualityBtCpp.g:3077:1: ruleSwitchNode returns [EObject current=null] : (otherlv_0= 'SwitchNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleSwitchNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:3083:2: ( (otherlv_0= 'SwitchNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:3084:2: (otherlv_0= 'SwitchNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:3084:2: (otherlv_0= 'SwitchNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:3085:3: otherlv_0= 'SwitchNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchNodeAccess().getSwitchNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:3089:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:3090:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:3090:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:3091:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSwitchNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getSwitchNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:3112:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==18) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalQualityBtCpp.g:3113:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSwitchNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:3117:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:3118:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:3118:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:3119:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:3137:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==26) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalQualityBtCpp.g:3138:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getSwitchNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getSwitchNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:3146:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:3147:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:3147:5: ( ruleEString )
                    // InternalQualityBtCpp.g:3148:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSwitchNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3162:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==15) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3163:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSwitchNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3167:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:3168:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:3168:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:3169:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSwitchNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSwitchNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getSwitchNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:3189:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==29) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalQualityBtCpp.g:3190:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getSwitchNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getSwitchNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:3198:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:3199:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:3199:5: ( ruleEString )
                    // InternalQualityBtCpp.g:3200:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSwitchNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3214:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==15) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3215:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getSwitchNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3219:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:3220:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:3220:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:3221:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSwitchNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSwitchNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getSwitchNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:3241:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==30) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalQualityBtCpp.g:3242:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSwitchNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getSwitchNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:3250:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:3251:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:3251:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:3252:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3269:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==15) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3270:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getSwitchNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3274:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:3275:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:3275:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:3276:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSwitchNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getSwitchNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getSwitchNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getSwitchNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:3307:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:3308:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:3308:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:3309:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getSwitchNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:3326:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==15) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalQualityBtCpp.g:3327:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getSwitchNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:3331:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:3332:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:3332:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:3333:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getSwitchNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getSwitchNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchNode"


    // $ANTLR start "entryRuleReactiveFallbackNode"
    // InternalQualityBtCpp.g:3363:1: entryRuleReactiveFallbackNode returns [EObject current=null] : iv_ruleReactiveFallbackNode= ruleReactiveFallbackNode EOF ;
    public final EObject entryRuleReactiveFallbackNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactiveFallbackNode = null;


        try {
            // InternalQualityBtCpp.g:3363:61: (iv_ruleReactiveFallbackNode= ruleReactiveFallbackNode EOF )
            // InternalQualityBtCpp.g:3364:2: iv_ruleReactiveFallbackNode= ruleReactiveFallbackNode EOF
            {
             newCompositeNode(grammarAccess.getReactiveFallbackNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactiveFallbackNode=ruleReactiveFallbackNode();

            state._fsp--;

             current =iv_ruleReactiveFallbackNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactiveFallbackNode"


    // $ANTLR start "ruleReactiveFallbackNode"
    // InternalQualityBtCpp.g:3370:1: ruleReactiveFallbackNode returns [EObject current=null] : (otherlv_0= 'ReactiveFallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleReactiveFallbackNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:3376:2: ( (otherlv_0= 'ReactiveFallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:3377:2: (otherlv_0= 'ReactiveFallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:3377:2: (otherlv_0= 'ReactiveFallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:3378:3: otherlv_0= 'ReactiveFallbackNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReactiveFallbackNodeAccess().getReactiveFallbackNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:3382:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:3383:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:3383:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:3384:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveFallbackNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getReactiveFallbackNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:3405:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==18) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalQualityBtCpp.g:3406:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getReactiveFallbackNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:3410:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:3411:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:3411:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:3412:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveFallbackNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:3430:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==26) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalQualityBtCpp.g:3431:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getReactiveFallbackNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getReactiveFallbackNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:3439:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:3440:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:3440:5: ( ruleEString )
                    // InternalQualityBtCpp.g:3441:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveFallbackNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3455:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==15) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3456:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getReactiveFallbackNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3460:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:3461:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:3461:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:3462:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReactiveFallbackNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getReactiveFallbackNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:3482:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==29) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalQualityBtCpp.g:3483:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getReactiveFallbackNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getReactiveFallbackNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:3491:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:3492:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:3492:5: ( ruleEString )
                    // InternalQualityBtCpp.g:3493:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveFallbackNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3507:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==15) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3508:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getReactiveFallbackNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3512:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:3513:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:3513:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:3514:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReactiveFallbackNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getReactiveFallbackNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:3534:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==30) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalQualityBtCpp.g:3535:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getReactiveFallbackNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getReactiveFallbackNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:3543:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:3544:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:3544:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:3545:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveFallbackNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3562:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==15) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3563:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getReactiveFallbackNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3567:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:3568:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:3568:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:3569:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReactiveFallbackNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getReactiveFallbackNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getReactiveFallbackNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getReactiveFallbackNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:3600:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:3601:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:3601:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:3602:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveFallbackNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:3619:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==15) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalQualityBtCpp.g:3620:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getReactiveFallbackNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:3624:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:3625:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:3625:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:3626:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getReactiveFallbackNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReactiveFallbackNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getReactiveFallbackNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getReactiveFallbackNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactiveFallbackNode"


    // $ANTLR start "entryRuleWhileDoElseNode"
    // InternalQualityBtCpp.g:3656:1: entryRuleWhileDoElseNode returns [EObject current=null] : iv_ruleWhileDoElseNode= ruleWhileDoElseNode EOF ;
    public final EObject entryRuleWhileDoElseNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileDoElseNode = null;


        try {
            // InternalQualityBtCpp.g:3656:56: (iv_ruleWhileDoElseNode= ruleWhileDoElseNode EOF )
            // InternalQualityBtCpp.g:3657:2: iv_ruleWhileDoElseNode= ruleWhileDoElseNode EOF
            {
             newCompositeNode(grammarAccess.getWhileDoElseNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileDoElseNode=ruleWhileDoElseNode();

            state._fsp--;

             current =iv_ruleWhileDoElseNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileDoElseNode"


    // $ANTLR start "ruleWhileDoElseNode"
    // InternalQualityBtCpp.g:3663:1: ruleWhileDoElseNode returns [EObject current=null] : (otherlv_0= 'WhileDoElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleWhileDoElseNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:3669:2: ( (otherlv_0= 'WhileDoElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:3670:2: (otherlv_0= 'WhileDoElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:3670:2: (otherlv_0= 'WhileDoElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:3671:3: otherlv_0= 'WhileDoElseNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileDoElseNodeAccess().getWhileDoElseNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:3675:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:3676:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:3676:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:3677:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileDoElseNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:3698:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==18) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalQualityBtCpp.g:3699:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhileDoElseNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:3703:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:3704:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:3704:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:3705:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:3723:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==26) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalQualityBtCpp.g:3724:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getWhileDoElseNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getWhileDoElseNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:3732:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:3733:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:3733:5: ( ruleEString )
                    // InternalQualityBtCpp.g:3734:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhileDoElseNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3748:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==15) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3749:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getWhileDoElseNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3753:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:3754:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:3754:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:3755:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWhileDoElseNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getWhileDoElseNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:3775:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==29) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalQualityBtCpp.g:3776:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getWhileDoElseNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getWhileDoElseNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:3784:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:3785:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:3785:5: ( ruleEString )
                    // InternalQualityBtCpp.g:3786:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhileDoElseNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3800:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==15) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3801:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getWhileDoElseNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3805:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:3806:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:3806:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:3807:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWhileDoElseNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getWhileDoElseNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:3827:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==30) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalQualityBtCpp.g:3828:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getWhileDoElseNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getWhileDoElseNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:3836:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:3837:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:3837:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:3838:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:3855:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==15) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:3856:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getWhileDoElseNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:3860:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:3861:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:3861:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:3862:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getWhileDoElseNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getWhileDoElseNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getWhileDoElseNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:3893:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:3894:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:3894:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:3895:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:3912:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==15) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalQualityBtCpp.g:3913:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getWhileDoElseNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:3917:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:3918:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:3918:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:3919:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getWhileDoElseNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getWhileDoElseNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileDoElseNode"


    // $ANTLR start "entryRuleReactiveSequenceNode"
    // InternalQualityBtCpp.g:3949:1: entryRuleReactiveSequenceNode returns [EObject current=null] : iv_ruleReactiveSequenceNode= ruleReactiveSequenceNode EOF ;
    public final EObject entryRuleReactiveSequenceNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactiveSequenceNode = null;


        try {
            // InternalQualityBtCpp.g:3949:61: (iv_ruleReactiveSequenceNode= ruleReactiveSequenceNode EOF )
            // InternalQualityBtCpp.g:3950:2: iv_ruleReactiveSequenceNode= ruleReactiveSequenceNode EOF
            {
             newCompositeNode(grammarAccess.getReactiveSequenceNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactiveSequenceNode=ruleReactiveSequenceNode();

            state._fsp--;

             current =iv_ruleReactiveSequenceNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactiveSequenceNode"


    // $ANTLR start "ruleReactiveSequenceNode"
    // InternalQualityBtCpp.g:3956:1: ruleReactiveSequenceNode returns [EObject current=null] : (otherlv_0= 'ReactiveSequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleReactiveSequenceNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:3962:2: ( (otherlv_0= 'ReactiveSequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:3963:2: (otherlv_0= 'ReactiveSequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:3963:2: (otherlv_0= 'ReactiveSequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:3964:3: otherlv_0= 'ReactiveSequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReactiveSequenceNodeAccess().getReactiveSequenceNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:3968:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:3969:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:3969:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:3970:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveSequenceNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getReactiveSequenceNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:3991:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==18) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalQualityBtCpp.g:3992:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getReactiveSequenceNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:3996:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:3997:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:3997:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:3998:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveSequenceNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:4016:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==26) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalQualityBtCpp.g:4017:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getReactiveSequenceNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getReactiveSequenceNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:4025:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:4026:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:4026:5: ( ruleEString )
                    // InternalQualityBtCpp.g:4027:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveSequenceNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4041:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==15) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4042:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getReactiveSequenceNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4046:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:4047:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:4047:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:4048:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReactiveSequenceNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getReactiveSequenceNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:4068:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==29) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalQualityBtCpp.g:4069:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getReactiveSequenceNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getReactiveSequenceNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:4077:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:4078:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:4078:5: ( ruleEString )
                    // InternalQualityBtCpp.g:4079:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveSequenceNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4093:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==15) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4094:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getReactiveSequenceNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4098:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:4099:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:4099:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:4100:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReactiveSequenceNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getReactiveSequenceNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:4120:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==30) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalQualityBtCpp.g:4121:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getReactiveSequenceNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getReactiveSequenceNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:4129:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:4130:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:4130:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:4131:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveSequenceNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4148:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==15) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4149:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getReactiveSequenceNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4153:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:4154:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:4154:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:4155:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReactiveSequenceNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getReactiveSequenceNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getReactiveSequenceNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getReactiveSequenceNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:4186:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:4187:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:4187:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:4188:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveSequenceNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:4205:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==15) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalQualityBtCpp.g:4206:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getReactiveSequenceNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:4210:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:4211:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:4211:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:4212:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getReactiveSequenceNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReactiveSequenceNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getReactiveSequenceNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getReactiveSequenceNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactiveSequenceNode"


    // $ANTLR start "entryRuleSequenceNode"
    // InternalQualityBtCpp.g:4242:1: entryRuleSequenceNode returns [EObject current=null] : iv_ruleSequenceNode= ruleSequenceNode EOF ;
    public final EObject entryRuleSequenceNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceNode = null;


        try {
            // InternalQualityBtCpp.g:4242:53: (iv_ruleSequenceNode= ruleSequenceNode EOF )
            // InternalQualityBtCpp.g:4243:2: iv_ruleSequenceNode= ruleSequenceNode EOF
            {
             newCompositeNode(grammarAccess.getSequenceNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceNode=ruleSequenceNode();

            state._fsp--;

             current =iv_ruleSequenceNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceNode"


    // $ANTLR start "ruleSequenceNode"
    // InternalQualityBtCpp.g:4249:1: ruleSequenceNode returns [EObject current=null] : (otherlv_0= 'SequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleSequenceNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:4255:2: ( (otherlv_0= 'SequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:4256:2: (otherlv_0= 'SequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:4256:2: (otherlv_0= 'SequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:4257:3: otherlv_0= 'SequenceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceNodeAccess().getSequenceNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:4261:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:4262:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:4262:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:4263:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSequenceNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:4284:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==18) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalQualityBtCpp.g:4285:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSequenceNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:4289:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:4290:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:4290:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:4291:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:4309:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==26) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalQualityBtCpp.g:4310:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getSequenceNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getSequenceNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:4318:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:4319:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:4319:5: ( ruleEString )
                    // InternalQualityBtCpp.g:4320:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequenceNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4334:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==15) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4335:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSequenceNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4339:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:4340:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:4340:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:4341:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSequenceNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSequenceNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getSequenceNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:4361:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==29) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalQualityBtCpp.g:4362:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getSequenceNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getSequenceNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:4370:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:4371:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:4371:5: ( ruleEString )
                    // InternalQualityBtCpp.g:4372:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequenceNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4386:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==15) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4387:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getSequenceNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4391:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:4392:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:4392:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:4393:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSequenceNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSequenceNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getSequenceNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:4413:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==30) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalQualityBtCpp.g:4414:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSequenceNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getSequenceNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:4422:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:4423:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:4423:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:4424:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4441:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==15) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4442:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getSequenceNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4446:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:4447:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:4447:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:4448:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getSequenceNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getSequenceNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getSequenceNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:4479:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:4480:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:4480:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:4481:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getSequenceNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:4498:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==15) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalQualityBtCpp.g:4499:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getSequenceNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:4503:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:4504:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:4504:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:4505:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getSequenceNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getSequenceNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceNode"


    // $ANTLR start "entryRuleTimeoutNode"
    // InternalQualityBtCpp.g:4535:1: entryRuleTimeoutNode returns [EObject current=null] : iv_ruleTimeoutNode= ruleTimeoutNode EOF ;
    public final EObject entryRuleTimeoutNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutNode = null;


        try {
            // InternalQualityBtCpp.g:4535:52: (iv_ruleTimeoutNode= ruleTimeoutNode EOF )
            // InternalQualityBtCpp.g:4536:2: iv_ruleTimeoutNode= ruleTimeoutNode EOF
            {
             newCompositeNode(grammarAccess.getTimeoutNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeoutNode=ruleTimeoutNode();

            state._fsp--;

             current =iv_ruleTimeoutNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeoutNode"


    // $ANTLR start "ruleTimeoutNode"
    // InternalQualityBtCpp.g:4542:1: ruleTimeoutNode returns [EObject current=null] : (otherlv_0= 'TimeoutNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'msec' ( (lv_msec_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' ) ;
    public final EObject ruleTimeoutNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        AntlrDatatypeRuleToken lv_msec_6_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_parameters_23_0 = null;

        EObject lv_child_26_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:4548:2: ( (otherlv_0= 'TimeoutNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'msec' ( (lv_msec_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' ) )
            // InternalQualityBtCpp.g:4549:2: (otherlv_0= 'TimeoutNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'msec' ( (lv_msec_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' )
            {
            // InternalQualityBtCpp.g:4549:2: (otherlv_0= 'TimeoutNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'msec' ( (lv_msec_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' )
            // InternalQualityBtCpp.g:4550:3: otherlv_0= 'TimeoutNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'msec' ( (lv_msec_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutNodeAccess().getTimeoutNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:4554:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:4555:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:4555:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:4556:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTimeoutNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeoutNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:4577:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==18) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalQualityBtCpp.g:4578:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeoutNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:4582:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:4583:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:4583:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:4584:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTimeoutNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeoutNodeAccess().getMsecKeyword_4());
            		
            // InternalQualityBtCpp.g:4606:3: ( (lv_msec_6_0= ruleEString ) )
            // InternalQualityBtCpp.g:4607:4: (lv_msec_6_0= ruleEString )
            {
            // InternalQualityBtCpp.g:4607:4: (lv_msec_6_0= ruleEString )
            // InternalQualityBtCpp.g:4608:5: lv_msec_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTimeoutNodeAccess().getMsecEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_msec_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
            					}
            					set(
            						current,
            						"msec",
            						lv_msec_6_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:4625:3: (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==26) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalQualityBtCpp.g:4626:4: otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getTimeoutNodeAccess().getSatisficesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getTimeoutNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:4634:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:4635:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:4635:5: ( ruleEString )
                    // InternalQualityBtCpp.g:4636:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeoutNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTimeoutNodeAccess().getSatisficesQualityCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4650:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==15) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4651:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getTimeoutNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4655:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:4656:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:4656:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:4657:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTimeoutNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTimeoutNodeAccess().getSatisficesQualityCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getTimeoutNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:4677:3: (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==29) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalQualityBtCpp.g:4678:4: otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getTimeoutNodeAccess().getSatisfiesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getTimeoutNodeAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:4686:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:4687:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:4687:5: ( ruleEString )
                    // InternalQualityBtCpp.g:4688:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeoutNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTimeoutNodeAccess().getSatisfiesQualityRequirementCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4702:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==15) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4703:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getTimeoutNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4707:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:4708:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:4708:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:4709:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTimeoutNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTimeoutNodeAccess().getSatisfiesQualityRequirementCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_18, grammarAccess.getTimeoutNodeAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:4729:3: (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==30) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalQualityBtCpp.g:4730:4: otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getTimeoutNodeAccess().getParametersKeyword_8_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getTimeoutNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalQualityBtCpp.g:4738:4: ( (lv_parameters_21_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:4739:5: (lv_parameters_21_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:4739:5: (lv_parameters_21_0= ruleParameter )
                    // InternalQualityBtCpp.g:4740:6: lv_parameters_21_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTimeoutNodeAccess().getParametersParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_21_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_21_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4757:4: (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==15) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4758:5: otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getTimeoutNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4762:5: ( (lv_parameters_23_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:4763:6: (lv_parameters_23_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:4763:6: (lv_parameters_23_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:4764:7: lv_parameters_23_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimeoutNodeAccess().getParametersParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_23_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_23_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_24, grammarAccess.getTimeoutNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_25, grammarAccess.getTimeoutNodeAccess().getChildKeyword_9());
            		
            // InternalQualityBtCpp.g:4791:3: ( (lv_child_26_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:4792:4: (lv_child_26_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:4792:4: (lv_child_26_0= ruleTreeNode )
            // InternalQualityBtCpp.g:4793:5: lv_child_26_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getTimeoutNodeAccess().getChildTreeNodeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_26_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_26_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getTimeoutNodeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeoutNode"


    // $ANTLR start "entryRuleKeepRunningUntilFailureNode"
    // InternalQualityBtCpp.g:4818:1: entryRuleKeepRunningUntilFailureNode returns [EObject current=null] : iv_ruleKeepRunningUntilFailureNode= ruleKeepRunningUntilFailureNode EOF ;
    public final EObject entryRuleKeepRunningUntilFailureNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeepRunningUntilFailureNode = null;


        try {
            // InternalQualityBtCpp.g:4818:68: (iv_ruleKeepRunningUntilFailureNode= ruleKeepRunningUntilFailureNode EOF )
            // InternalQualityBtCpp.g:4819:2: iv_ruleKeepRunningUntilFailureNode= ruleKeepRunningUntilFailureNode EOF
            {
             newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeepRunningUntilFailureNode=ruleKeepRunningUntilFailureNode();

            state._fsp--;

             current =iv_ruleKeepRunningUntilFailureNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeepRunningUntilFailureNode"


    // $ANTLR start "ruleKeepRunningUntilFailureNode"
    // InternalQualityBtCpp.g:4825:1: ruleKeepRunningUntilFailureNode returns [EObject current=null] : (otherlv_0= 'KeepRunningUntilFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject ruleKeepRunningUntilFailureNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:4831:2: ( (otherlv_0= 'KeepRunningUntilFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:4832:2: (otherlv_0= 'KeepRunningUntilFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:4832:2: (otherlv_0= 'KeepRunningUntilFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:4833:3: otherlv_0= 'KeepRunningUntilFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getKeepRunningUntilFailureNodeAccess().getKeepRunningUntilFailureNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:4837:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:4838:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:4838:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:4839:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getKeepRunningUntilFailureNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:4860:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==18) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalQualityBtCpp.g:4861:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getKeepRunningUntilFailureNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:4865:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:4866:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:4866:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:4867:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:4885:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==26) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalQualityBtCpp.g:4886:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getKeepRunningUntilFailureNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getKeepRunningUntilFailureNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:4894:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:4895:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:4895:5: ( ruleEString )
                    // InternalQualityBtCpp.g:4896:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4910:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==15) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4911:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getKeepRunningUntilFailureNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4915:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:4916:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:4916:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:4917:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getKeepRunningUntilFailureNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:4937:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==29) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalQualityBtCpp.g:4938:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getKeepRunningUntilFailureNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getKeepRunningUntilFailureNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:4946:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:4947:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:4947:5: ( ruleEString )
                    // InternalQualityBtCpp.g:4948:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:4962:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==15) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:4963:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getKeepRunningUntilFailureNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:4967:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:4968:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:4968:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:4969:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getKeepRunningUntilFailureNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:4989:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==30) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalQualityBtCpp.g:4990:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getKeepRunningUntilFailureNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getKeepRunningUntilFailureNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:4998:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:4999:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:4999:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:5000:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5017:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==15) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5018:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getKeepRunningUntilFailureNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5022:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:5023:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:5023:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:5024:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getKeepRunningUntilFailureNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getKeepRunningUntilFailureNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:5051:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:5052:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:5052:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:5053:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getKeepRunningUntilFailureNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeepRunningUntilFailureNode"


    // $ANTLR start "entryRuleInverterNode"
    // InternalQualityBtCpp.g:5078:1: entryRuleInverterNode returns [EObject current=null] : iv_ruleInverterNode= ruleInverterNode EOF ;
    public final EObject entryRuleInverterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInverterNode = null;


        try {
            // InternalQualityBtCpp.g:5078:53: (iv_ruleInverterNode= ruleInverterNode EOF )
            // InternalQualityBtCpp.g:5079:2: iv_ruleInverterNode= ruleInverterNode EOF
            {
             newCompositeNode(grammarAccess.getInverterNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInverterNode=ruleInverterNode();

            state._fsp--;

             current =iv_ruleInverterNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInverterNode"


    // $ANTLR start "ruleInverterNode"
    // InternalQualityBtCpp.g:5085:1: ruleInverterNode returns [EObject current=null] : (otherlv_0= 'InverterNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject ruleInverterNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:5091:2: ( (otherlv_0= 'InverterNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:5092:2: (otherlv_0= 'InverterNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:5092:2: (otherlv_0= 'InverterNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:5093:3: otherlv_0= 'InverterNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInverterNodeAccess().getInverterNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:5097:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:5098:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:5098:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:5099:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInverterNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInverterNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getInverterNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:5120:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==18) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalQualityBtCpp.g:5121:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getInverterNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:5125:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:5126:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:5126:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:5127:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInverterNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInverterNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:5145:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==26) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalQualityBtCpp.g:5146:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getInverterNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getInverterNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:5154:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:5155:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:5155:5: ( ruleEString )
                    // InternalQualityBtCpp.g:5156:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInverterNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInverterNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5170:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==15) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5171:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getInverterNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5175:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:5176:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:5176:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:5177:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInverterNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInverterNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getInverterNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:5197:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==29) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalQualityBtCpp.g:5198:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getInverterNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getInverterNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:5206:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:5207:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:5207:5: ( ruleEString )
                    // InternalQualityBtCpp.g:5208:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInverterNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInverterNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5222:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==15) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5223:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getInverterNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5227:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:5228:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:5228:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:5229:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInverterNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInverterNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getInverterNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:5249:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==30) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalQualityBtCpp.g:5250:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getInverterNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getInverterNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:5258:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:5259:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:5259:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:5260:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getInverterNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInverterNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5277:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==15) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5278:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getInverterNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5282:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:5283:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:5283:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:5284:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getInverterNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInverterNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop127;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getInverterNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getInverterNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:5311:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:5312:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:5312:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:5313:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getInverterNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInverterNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getInverterNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInverterNode"


    // $ANTLR start "entryRuleForceSuccessNode"
    // InternalQualityBtCpp.g:5338:1: entryRuleForceSuccessNode returns [EObject current=null] : iv_ruleForceSuccessNode= ruleForceSuccessNode EOF ;
    public final EObject entryRuleForceSuccessNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForceSuccessNode = null;


        try {
            // InternalQualityBtCpp.g:5338:57: (iv_ruleForceSuccessNode= ruleForceSuccessNode EOF )
            // InternalQualityBtCpp.g:5339:2: iv_ruleForceSuccessNode= ruleForceSuccessNode EOF
            {
             newCompositeNode(grammarAccess.getForceSuccessNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForceSuccessNode=ruleForceSuccessNode();

            state._fsp--;

             current =iv_ruleForceSuccessNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForceSuccessNode"


    // $ANTLR start "ruleForceSuccessNode"
    // InternalQualityBtCpp.g:5345:1: ruleForceSuccessNode returns [EObject current=null] : (otherlv_0= 'ForceSuccessNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject ruleForceSuccessNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:5351:2: ( (otherlv_0= 'ForceSuccessNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:5352:2: (otherlv_0= 'ForceSuccessNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:5352:2: (otherlv_0= 'ForceSuccessNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:5353:3: otherlv_0= 'ForceSuccessNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getForceSuccessNodeAccess().getForceSuccessNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:5357:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:5358:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:5358:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:5359:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getForceSuccessNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:5380:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==18) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalQualityBtCpp.g:5381:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getForceSuccessNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:5385:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:5386:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:5386:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:5387:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:5405:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==26) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalQualityBtCpp.g:5406:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getForceSuccessNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getForceSuccessNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:5414:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:5415:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:5415:5: ( ruleEString )
                    // InternalQualityBtCpp.g:5416:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForceSuccessNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5430:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==15) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5431:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getForceSuccessNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5435:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:5436:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:5436:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:5437:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForceSuccessNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getForceSuccessNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:5457:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==29) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalQualityBtCpp.g:5458:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getForceSuccessNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getForceSuccessNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:5466:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:5467:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:5467:5: ( ruleEString )
                    // InternalQualityBtCpp.g:5468:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForceSuccessNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5482:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==15) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5483:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getForceSuccessNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5487:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:5488:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:5488:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:5489:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForceSuccessNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getForceSuccessNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:5509:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==30) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalQualityBtCpp.g:5510:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getForceSuccessNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getForceSuccessNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:5518:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:5519:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:5519:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:5520:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5537:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==15) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5538:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getForceSuccessNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5542:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:5543:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:5543:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:5544:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getForceSuccessNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getForceSuccessNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:5571:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:5572:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:5572:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:5573:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getForceSuccessNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForceSuccessNode"


    // $ANTLR start "entryRuleForceFailureNode"
    // InternalQualityBtCpp.g:5598:1: entryRuleForceFailureNode returns [EObject current=null] : iv_ruleForceFailureNode= ruleForceFailureNode EOF ;
    public final EObject entryRuleForceFailureNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForceFailureNode = null;


        try {
            // InternalQualityBtCpp.g:5598:57: (iv_ruleForceFailureNode= ruleForceFailureNode EOF )
            // InternalQualityBtCpp.g:5599:2: iv_ruleForceFailureNode= ruleForceFailureNode EOF
            {
             newCompositeNode(grammarAccess.getForceFailureNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForceFailureNode=ruleForceFailureNode();

            state._fsp--;

             current =iv_ruleForceFailureNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForceFailureNode"


    // $ANTLR start "ruleForceFailureNode"
    // InternalQualityBtCpp.g:5605:1: ruleForceFailureNode returns [EObject current=null] : (otherlv_0= 'ForceFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject ruleForceFailureNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:5611:2: ( (otherlv_0= 'ForceFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:5612:2: (otherlv_0= 'ForceFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:5612:2: (otherlv_0= 'ForceFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:5613:3: otherlv_0= 'ForceFailureNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getForceFailureNodeAccess().getForceFailureNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:5617:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:5618:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:5618:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:5619:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForceFailureNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getForceFailureNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:5640:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==18) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalQualityBtCpp.g:5641:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getForceFailureNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:5645:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:5646:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:5646:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:5647:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getForceFailureNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:5665:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==26) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalQualityBtCpp.g:5666:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getForceFailureNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getForceFailureNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:5674:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:5675:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:5675:5: ( ruleEString )
                    // InternalQualityBtCpp.g:5676:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForceFailureNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getForceFailureNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5690:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==15) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5691:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getForceFailureNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5695:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:5696:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:5696:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:5697:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForceFailureNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getForceFailureNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getForceFailureNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:5717:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==29) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalQualityBtCpp.g:5718:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getForceFailureNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getForceFailureNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:5726:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:5727:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:5727:5: ( ruleEString )
                    // InternalQualityBtCpp.g:5728:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForceFailureNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getForceFailureNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5742:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==15) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5743:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getForceFailureNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5747:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:5748:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:5748:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:5749:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForceFailureNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getForceFailureNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getForceFailureNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:5769:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==30) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalQualityBtCpp.g:5770:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getForceFailureNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getForceFailureNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:5778:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:5779:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:5779:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:5780:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getForceFailureNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5797:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==15) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5798:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getForceFailureNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5802:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:5803:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:5803:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:5804:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getForceFailureNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getForceFailureNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getForceFailureNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:5831:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:5832:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:5832:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:5833:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getForceFailureNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getForceFailureNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForceFailureNode"


    // $ANTLR start "entryRuleRepeatNode"
    // InternalQualityBtCpp.g:5858:1: entryRuleRepeatNode returns [EObject current=null] : iv_ruleRepeatNode= ruleRepeatNode EOF ;
    public final EObject entryRuleRepeatNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatNode = null;


        try {
            // InternalQualityBtCpp.g:5858:51: (iv_ruleRepeatNode= ruleRepeatNode EOF )
            // InternalQualityBtCpp.g:5859:2: iv_ruleRepeatNode= ruleRepeatNode EOF
            {
             newCompositeNode(grammarAccess.getRepeatNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeatNode=ruleRepeatNode();

            state._fsp--;

             current =iv_ruleRepeatNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeatNode"


    // $ANTLR start "ruleRepeatNode"
    // InternalQualityBtCpp.g:5865:1: ruleRepeatNode returns [EObject current=null] : (otherlv_0= 'RepeatNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_cycles' ( (lv_num_cycles_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' ) ;
    public final EObject ruleRepeatNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        AntlrDatatypeRuleToken lv_num_cycles_6_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_parameters_23_0 = null;

        EObject lv_child_26_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:5871:2: ( (otherlv_0= 'RepeatNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_cycles' ( (lv_num_cycles_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' ) )
            // InternalQualityBtCpp.g:5872:2: (otherlv_0= 'RepeatNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_cycles' ( (lv_num_cycles_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' )
            {
            // InternalQualityBtCpp.g:5872:2: (otherlv_0= 'RepeatNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_cycles' ( (lv_num_cycles_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' )
            // InternalQualityBtCpp.g:5873:3: otherlv_0= 'RepeatNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_cycles' ( (lv_num_cycles_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatNodeAccess().getRepeatNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:5877:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:5878:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:5878:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:5879:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepeatNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:5900:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==18) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalQualityBtCpp.g:5901:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepeatNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:5905:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:5906:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:5906:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:5907:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRepeatNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getRepeatNodeAccess().getNum_cyclesKeyword_4());
            		
            // InternalQualityBtCpp.g:5929:3: ( (lv_num_cycles_6_0= ruleEString ) )
            // InternalQualityBtCpp.g:5930:4: (lv_num_cycles_6_0= ruleEString )
            {
            // InternalQualityBtCpp.g:5930:4: (lv_num_cycles_6_0= ruleEString )
            // InternalQualityBtCpp.g:5931:5: lv_num_cycles_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepeatNodeAccess().getNum_cyclesEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_num_cycles_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
            					}
            					set(
            						current,
            						"num_cycles",
            						lv_num_cycles_6_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:5948:3: (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==26) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalQualityBtCpp.g:5949:4: otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getRepeatNodeAccess().getSatisficesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepeatNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:5957:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:5958:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:5958:5: ( ruleEString )
                    // InternalQualityBtCpp.g:5959:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRepeatNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRepeatNodeAccess().getSatisficesQualityCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:5973:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==15) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:5974:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRepeatNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:5978:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:5979:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:5979:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:5980:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRepeatNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRepeatNodeAccess().getSatisficesQualityCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getRepeatNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6000:3: (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==29) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalQualityBtCpp.g:6001:4: otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getRepeatNodeAccess().getSatisfiesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepeatNodeAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:6009:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:6010:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:6010:5: ( ruleEString )
                    // InternalQualityBtCpp.g:6011:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRepeatNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRepeatNodeAccess().getSatisfiesQualityRequirementCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6025:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==15) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6026:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRepeatNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6030:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:6031:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:6031:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:6032:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRepeatNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRepeatNodeAccess().getSatisfiesQualityRequirementCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop146;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_18, grammarAccess.getRepeatNodeAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6052:3: (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==30) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalQualityBtCpp.g:6053:4: otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getRepeatNodeAccess().getParametersKeyword_8_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getRepeatNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalQualityBtCpp.g:6061:4: ( (lv_parameters_21_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:6062:5: (lv_parameters_21_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:6062:5: (lv_parameters_21_0= ruleParameter )
                    // InternalQualityBtCpp.g:6063:6: lv_parameters_21_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getRepeatNodeAccess().getParametersParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_21_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_21_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6080:4: (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==15) ) {
                            alt148=1;
                        }


                        switch (alt148) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6081:5: otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getRepeatNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6085:5: ( (lv_parameters_23_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:6086:6: (lv_parameters_23_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:6086:6: (lv_parameters_23_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:6087:7: lv_parameters_23_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepeatNodeAccess().getParametersParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_23_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_23_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_24, grammarAccess.getRepeatNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_25, grammarAccess.getRepeatNodeAccess().getChildKeyword_9());
            		
            // InternalQualityBtCpp.g:6114:3: ( (lv_child_26_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:6115:4: (lv_child_26_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:6115:4: (lv_child_26_0= ruleTreeNode )
            // InternalQualityBtCpp.g:6116:5: lv_child_26_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getRepeatNodeAccess().getChildTreeNodeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_26_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_26_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getRepeatNodeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeatNode"


    // $ANTLR start "entryRuleSubTree"
    // InternalQualityBtCpp.g:6141:1: entryRuleSubTree returns [EObject current=null] : iv_ruleSubTree= ruleSubTree EOF ;
    public final EObject entryRuleSubTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTree = null;


        try {
            // InternalQualityBtCpp.g:6141:48: (iv_ruleSubTree= ruleSubTree EOF )
            // InternalQualityBtCpp.g:6142:2: iv_ruleSubTree= ruleSubTree EOF
            {
             newCompositeNode(grammarAccess.getSubTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubTree=ruleSubTree();

            state._fsp--;

             current =iv_ruleSubTree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubTree"


    // $ANTLR start "ruleSubTree"
    // InternalQualityBtCpp.g:6148:1: ruleSubTree returns [EObject current=null] : ( () otherlv_1= 'SubTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'child' otherlv_25= '{' ( (lv_child_26_0= ruleTreeNode ) ) (otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleSubTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;

        EObject lv_child_26_0 = null;

        EObject lv_child_28_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:6154:2: ( ( () otherlv_1= 'SubTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'child' otherlv_25= '{' ( (lv_child_26_0= ruleTreeNode ) ) (otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalQualityBtCpp.g:6155:2: ( () otherlv_1= 'SubTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'child' otherlv_25= '{' ( (lv_child_26_0= ruleTreeNode ) ) (otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalQualityBtCpp.g:6155:2: ( () otherlv_1= 'SubTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'child' otherlv_25= '{' ( (lv_child_26_0= ruleTreeNode ) ) (otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalQualityBtCpp.g:6156:3: () otherlv_1= 'SubTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'child' otherlv_25= '{' ( (lv_child_26_0= ruleTreeNode ) ) (otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalQualityBtCpp.g:6156:3: ()
            // InternalQualityBtCpp.g:6157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubTreeAccess().getSubTreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubTreeAccess().getSubTreeKeyword_1());
            		
            // InternalQualityBtCpp.g:6167:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:6168:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:6168:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:6169:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubTreeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubTreeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getSubTreeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:6190:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==18) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalQualityBtCpp.g:6191:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubTreeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:6195:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:6196:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:6196:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:6197:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:6215:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==26) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalQualityBtCpp.g:6216:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubTreeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubTreeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:6224:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:6225:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:6225:5: ( ruleEString )
                    // InternalQualityBtCpp.g:6226:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubTreeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6240:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==15) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6241:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSubTreeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6245:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:6246:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:6246:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:6247:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSubTreeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSubTreeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop151;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getSubTreeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6267:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==29) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalQualityBtCpp.g:6268:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getSubTreeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getSubTreeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:6276:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:6277:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:6277:5: ( ruleEString )
                    // InternalQualityBtCpp.g:6278:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubTreeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6292:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==15) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6293:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSubTreeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6297:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:6298:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:6298:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:6299:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSubTreeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSubTreeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop153;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_38); 

                    				newLeafNode(otherlv_17, grammarAccess.getSubTreeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6319:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==30) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalQualityBtCpp.g:6320:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getSubTreeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getSubTreeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:6328:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:6329:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:6329:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:6330:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6347:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==15) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6348:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getSubTreeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6352:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:6353:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:6353:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:6354:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubTreeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_39); 

                    				newLeafNode(otherlv_23, grammarAccess.getSubTreeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6377:3: (otherlv_24= 'child' otherlv_25= '{' ( (lv_child_26_0= ruleTreeNode ) ) (otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) ) )* otherlv_29= '}' )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==35) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalQualityBtCpp.g:6378:4: otherlv_24= 'child' otherlv_25= '{' ( (lv_child_26_0= ruleTreeNode ) ) (otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getSubTreeAccess().getChildKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_25, grammarAccess.getSubTreeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalQualityBtCpp.g:6386:4: ( (lv_child_26_0= ruleTreeNode ) )
                    // InternalQualityBtCpp.g:6387:5: (lv_child_26_0= ruleTreeNode )
                    {
                    // InternalQualityBtCpp.g:6387:5: (lv_child_26_0= ruleTreeNode )
                    // InternalQualityBtCpp.g:6388:6: lv_child_26_0= ruleTreeNode
                    {

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getChildTreeNodeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_child_26_0=ruleTreeNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_26_0,
                    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6405:4: (otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) ) )*
                    loop157:
                    do {
                        int alt157=2;
                        int LA157_0 = input.LA(1);

                        if ( (LA157_0==15) ) {
                            alt157=1;
                        }


                        switch (alt157) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6406:5: otherlv_27= ',' ( (lv_child_28_0= ruleTreeNode ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getSubTreeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6410:5: ( (lv_child_28_0= ruleTreeNode ) )
                    	    // InternalQualityBtCpp.g:6411:6: (lv_child_28_0= ruleTreeNode )
                    	    {
                    	    // InternalQualityBtCpp.g:6411:6: (lv_child_28_0= ruleTreeNode )
                    	    // InternalQualityBtCpp.g:6412:7: lv_child_28_0= ruleTreeNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubTreeAccess().getChildTreeNodeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_child_28_0=ruleTreeNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"child",
                    	    								lv_child_28_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.TreeNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop157;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_29, grammarAccess.getSubTreeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getSubTreeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubTree"


    // $ANTLR start "entryRuleScriptNode"
    // InternalQualityBtCpp.g:6443:1: entryRuleScriptNode returns [EObject current=null] : iv_ruleScriptNode= ruleScriptNode EOF ;
    public final EObject entryRuleScriptNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptNode = null;


        try {
            // InternalQualityBtCpp.g:6443:51: (iv_ruleScriptNode= ruleScriptNode EOF )
            // InternalQualityBtCpp.g:6444:2: iv_ruleScriptNode= ruleScriptNode EOF
            {
             newCompositeNode(grammarAccess.getScriptNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScriptNode=ruleScriptNode();

            state._fsp--;

             current =iv_ruleScriptNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScriptNode"


    // $ANTLR start "ruleScriptNode"
    // InternalQualityBtCpp.g:6450:1: ruleScriptNode returns [EObject current=null] : ( () otherlv_1= 'ScriptNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleScriptNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:6456:2: ( ( () otherlv_1= 'ScriptNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:6457:2: ( () otherlv_1= 'ScriptNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:6457:2: ( () otherlv_1= 'ScriptNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:6458:3: () otherlv_1= 'ScriptNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:6458:3: ()
            // InternalQualityBtCpp.g:6459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScriptNodeAccess().getScriptNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScriptNodeAccess().getScriptNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:6469:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:6470:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:6470:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:6471:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScriptNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScriptNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getScriptNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:6492:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==18) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalQualityBtCpp.g:6493:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getScriptNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:6497:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:6498:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:6498:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:6499:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScriptNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScriptNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:6517:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==26) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalQualityBtCpp.g:6518:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getScriptNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getScriptNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:6526:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:6527:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:6527:5: ( ruleEString )
                    // InternalQualityBtCpp.g:6528:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScriptNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getScriptNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6542:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==15) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6543:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getScriptNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6547:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:6548:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:6548:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:6549:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getScriptNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getScriptNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getScriptNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6569:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==29) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalQualityBtCpp.g:6570:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getScriptNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getScriptNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:6578:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:6579:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:6579:5: ( ruleEString )
                    // InternalQualityBtCpp.g:6580:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScriptNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getScriptNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6594:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==15) ) {
                            alt162=1;
                        }


                        switch (alt162) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6595:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getScriptNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6599:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:6600:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:6600:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:6601:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getScriptNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getScriptNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop162;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getScriptNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6621:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==30) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalQualityBtCpp.g:6622:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getScriptNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getScriptNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:6630:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:6631:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:6631:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:6632:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getScriptNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScriptNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6649:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop164:
                    do {
                        int alt164=2;
                        int LA164_0 = input.LA(1);

                        if ( (LA164_0==15) ) {
                            alt164=1;
                        }


                        switch (alt164) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6650:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getScriptNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6654:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:6655:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:6655:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:6656:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getScriptNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getScriptNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop164;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getScriptNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getScriptNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScriptNode"


    // $ANTLR start "entryRuleScriptConditionNode"
    // InternalQualityBtCpp.g:6687:1: entryRuleScriptConditionNode returns [EObject current=null] : iv_ruleScriptConditionNode= ruleScriptConditionNode EOF ;
    public final EObject entryRuleScriptConditionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptConditionNode = null;


        try {
            // InternalQualityBtCpp.g:6687:60: (iv_ruleScriptConditionNode= ruleScriptConditionNode EOF )
            // InternalQualityBtCpp.g:6688:2: iv_ruleScriptConditionNode= ruleScriptConditionNode EOF
            {
             newCompositeNode(grammarAccess.getScriptConditionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScriptConditionNode=ruleScriptConditionNode();

            state._fsp--;

             current =iv_ruleScriptConditionNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScriptConditionNode"


    // $ANTLR start "ruleScriptConditionNode"
    // InternalQualityBtCpp.g:6694:1: ruleScriptConditionNode returns [EObject current=null] : ( () otherlv_1= 'ScriptConditionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleScriptConditionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:6700:2: ( ( () otherlv_1= 'ScriptConditionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:6701:2: ( () otherlv_1= 'ScriptConditionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:6701:2: ( () otherlv_1= 'ScriptConditionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:6702:3: () otherlv_1= 'ScriptConditionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:6702:3: ()
            // InternalQualityBtCpp.g:6703:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScriptConditionNodeAccess().getScriptConditionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScriptConditionNodeAccess().getScriptConditionNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:6713:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:6714:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:6714:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:6715:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScriptConditionNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScriptConditionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getScriptConditionNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:6736:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==18) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalQualityBtCpp.g:6737:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getScriptConditionNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:6741:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:6742:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:6742:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:6743:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScriptConditionNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScriptConditionNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:6761:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==26) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalQualityBtCpp.g:6762:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getScriptConditionNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getScriptConditionNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:6770:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:6771:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:6771:5: ( ruleEString )
                    // InternalQualityBtCpp.g:6772:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScriptConditionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getScriptConditionNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6786:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop167:
                    do {
                        int alt167=2;
                        int LA167_0 = input.LA(1);

                        if ( (LA167_0==15) ) {
                            alt167=1;
                        }


                        switch (alt167) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6787:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getScriptConditionNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6791:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:6792:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:6792:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:6793:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getScriptConditionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getScriptConditionNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop167;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getScriptConditionNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6813:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==29) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalQualityBtCpp.g:6814:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getScriptConditionNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getScriptConditionNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:6822:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:6823:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:6823:5: ( ruleEString )
                    // InternalQualityBtCpp.g:6824:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScriptConditionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getScriptConditionNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6838:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop169:
                    do {
                        int alt169=2;
                        int LA169_0 = input.LA(1);

                        if ( (LA169_0==15) ) {
                            alt169=1;
                        }


                        switch (alt169) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6839:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getScriptConditionNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6843:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:6844:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:6844:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:6845:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getScriptConditionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getScriptConditionNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop169;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getScriptConditionNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:6865:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==30) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalQualityBtCpp.g:6866:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getScriptConditionNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getScriptConditionNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:6874:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:6875:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:6875:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:6876:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getScriptConditionNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScriptConditionNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:6893:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop171:
                    do {
                        int alt171=2;
                        int LA171_0 = input.LA(1);

                        if ( (LA171_0==15) ) {
                            alt171=1;
                        }


                        switch (alt171) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:6894:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getScriptConditionNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:6898:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:6899:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:6899:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:6900:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getScriptConditionNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getScriptConditionNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop171;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getScriptConditionNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getScriptConditionNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScriptConditionNode"


    // $ANTLR start "entryRuleRetryNode"
    // InternalQualityBtCpp.g:6931:1: entryRuleRetryNode returns [EObject current=null] : iv_ruleRetryNode= ruleRetryNode EOF ;
    public final EObject entryRuleRetryNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetryNode = null;


        try {
            // InternalQualityBtCpp.g:6931:50: (iv_ruleRetryNode= ruleRetryNode EOF )
            // InternalQualityBtCpp.g:6932:2: iv_ruleRetryNode= ruleRetryNode EOF
            {
             newCompositeNode(grammarAccess.getRetryNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetryNode=ruleRetryNode();

            state._fsp--;

             current =iv_ruleRetryNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetryNode"


    // $ANTLR start "ruleRetryNode"
    // InternalQualityBtCpp.g:6938:1: ruleRetryNode returns [EObject current=null] : (otherlv_0= 'RetryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_attempts' ( (lv_num_attempts_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' ) ;
    public final EObject ruleRetryNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        AntlrDatatypeRuleToken lv_num_attempts_6_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_parameters_23_0 = null;

        EObject lv_child_26_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:6944:2: ( (otherlv_0= 'RetryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_attempts' ( (lv_num_attempts_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' ) )
            // InternalQualityBtCpp.g:6945:2: (otherlv_0= 'RetryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_attempts' ( (lv_num_attempts_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' )
            {
            // InternalQualityBtCpp.g:6945:2: (otherlv_0= 'RetryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_attempts' ( (lv_num_attempts_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' )
            // InternalQualityBtCpp.g:6946:3: otherlv_0= 'RetryNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? otherlv_5= 'num_attempts' ( (lv_num_attempts_6_0= ruleEString ) ) (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRetryNodeAccess().getRetryNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:6950:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:6951:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:6951:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:6952:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRetryNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetryNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getRetryNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:6973:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==18) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalQualityBtCpp.g:6974:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRetryNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:6978:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:6979:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:6979:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:6980:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRetryNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRetryNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getRetryNodeAccess().getNum_attemptsKeyword_4());
            		
            // InternalQualityBtCpp.g:7002:3: ( (lv_num_attempts_6_0= ruleEString ) )
            // InternalQualityBtCpp.g:7003:4: (lv_num_attempts_6_0= ruleEString )
            {
            // InternalQualityBtCpp.g:7003:4: (lv_num_attempts_6_0= ruleEString )
            // InternalQualityBtCpp.g:7004:5: lv_num_attempts_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRetryNodeAccess().getNum_attemptsEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_num_attempts_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetryNodeRule());
            					}
            					set(
            						current,
            						"num_attempts",
            						lv_num_attempts_6_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:7021:3: (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==26) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalQualityBtCpp.g:7022:4: otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getRetryNodeAccess().getSatisficesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getRetryNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:7030:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:7031:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:7031:5: ( ruleEString )
                    // InternalQualityBtCpp.g:7032:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRetryNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRetryNodeAccess().getSatisficesQualityCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7046:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop174:
                    do {
                        int alt174=2;
                        int LA174_0 = input.LA(1);

                        if ( (LA174_0==15) ) {
                            alt174=1;
                        }


                        switch (alt174) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7047:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRetryNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7051:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:7052:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:7052:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:7053:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRetryNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRetryNodeAccess().getSatisficesQualityCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop174;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getRetryNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:7073:3: (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==29) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // InternalQualityBtCpp.g:7074:4: otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getRetryNodeAccess().getSatisfiesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getRetryNodeAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:7082:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:7083:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:7083:5: ( ruleEString )
                    // InternalQualityBtCpp.g:7084:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRetryNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRetryNodeAccess().getSatisfiesQualityRequirementCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7098:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop176:
                    do {
                        int alt176=2;
                        int LA176_0 = input.LA(1);

                        if ( (LA176_0==15) ) {
                            alt176=1;
                        }


                        switch (alt176) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7099:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRetryNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7103:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:7104:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:7104:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:7105:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRetryNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRetryNodeAccess().getSatisfiesQualityRequirementCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop176;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_18, grammarAccess.getRetryNodeAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:7125:3: (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==30) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalQualityBtCpp.g:7126:4: otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getRetryNodeAccess().getParametersKeyword_8_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getRetryNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalQualityBtCpp.g:7134:4: ( (lv_parameters_21_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:7135:5: (lv_parameters_21_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:7135:5: (lv_parameters_21_0= ruleParameter )
                    // InternalQualityBtCpp.g:7136:6: lv_parameters_21_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getRetryNodeAccess().getParametersParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_21_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRetryNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_21_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7153:4: (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )*
                    loop178:
                    do {
                        int alt178=2;
                        int LA178_0 = input.LA(1);

                        if ( (LA178_0==15) ) {
                            alt178=1;
                        }


                        switch (alt178) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7154:5: otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getRetryNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7158:5: ( (lv_parameters_23_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:7159:6: (lv_parameters_23_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:7159:6: (lv_parameters_23_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:7160:7: lv_parameters_23_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRetryNodeAccess().getParametersParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_23_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRetryNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_23_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop178;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_24, grammarAccess.getRetryNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_25, grammarAccess.getRetryNodeAccess().getChildKeyword_9());
            		
            // InternalQualityBtCpp.g:7187:3: ( (lv_child_26_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:7188:4: (lv_child_26_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:7188:4: (lv_child_26_0= ruleTreeNode )
            // InternalQualityBtCpp.g:7189:5: lv_child_26_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getRetryNodeAccess().getChildTreeNodeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_26_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetryNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_26_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getRetryNodeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetryNode"


    // $ANTLR start "entryRuleParallelAllNode"
    // InternalQualityBtCpp.g:7214:1: entryRuleParallelAllNode returns [EObject current=null] : iv_ruleParallelAllNode= ruleParallelAllNode EOF ;
    public final EObject entryRuleParallelAllNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelAllNode = null;


        try {
            // InternalQualityBtCpp.g:7214:56: (iv_ruleParallelAllNode= ruleParallelAllNode EOF )
            // InternalQualityBtCpp.g:7215:2: iv_ruleParallelAllNode= ruleParallelAllNode EOF
            {
             newCompositeNode(grammarAccess.getParallelAllNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelAllNode=ruleParallelAllNode();

            state._fsp--;

             current =iv_ruleParallelAllNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallelAllNode"


    // $ANTLR start "ruleParallelAllNode"
    // InternalQualityBtCpp.g:7221:1: ruleParallelAllNode returns [EObject current=null] : (otherlv_0= 'ParallelAllNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleParallelAllNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_25_0 = null;

        EObject lv_child_27_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:7227:2: ( (otherlv_0= 'ParallelAllNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalQualityBtCpp.g:7228:2: (otherlv_0= 'ParallelAllNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalQualityBtCpp.g:7228:2: (otherlv_0= 'ParallelAllNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalQualityBtCpp.g:7229:3: otherlv_0= 'ParallelAllNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' otherlv_24= '{' ( (lv_child_25_0= ruleTreeNode ) ) (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelAllNodeAccess().getParallelAllNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:7233:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:7234:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:7234:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:7235:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParallelAllNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParallelAllNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getParallelAllNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:7256:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==18) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalQualityBtCpp.g:7257:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallelAllNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:7261:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:7262:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:7262:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:7263:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParallelAllNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelAllNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:7281:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==26) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalQualityBtCpp.g:7282:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallelAllNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallelAllNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:7290:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:7291:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:7291:5: ( ruleEString )
                    // InternalQualityBtCpp.g:7292:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelAllNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelAllNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7306:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop181:
                    do {
                        int alt181=2;
                        int LA181_0 = input.LA(1);

                        if ( (LA181_0==15) ) {
                            alt181=1;
                        }


                        switch (alt181) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7307:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getParallelAllNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7311:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:7312:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:7312:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:7313:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelAllNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelAllNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop181;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallelAllNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:7333:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==29) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalQualityBtCpp.g:7334:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallelAllNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getParallelAllNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:7342:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:7343:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:7343:5: ( ruleEString )
                    // InternalQualityBtCpp.g:7344:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelAllNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParallelAllNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7358:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop183:
                    do {
                        int alt183=2;
                        int LA183_0 = input.LA(1);

                        if ( (LA183_0==15) ) {
                            alt183=1;
                        }


                        switch (alt183) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7359:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getParallelAllNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7363:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:7364:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:7364:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:7365:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParallelAllNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParallelAllNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop183;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallelAllNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:7385:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==30) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // InternalQualityBtCpp.g:7386:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getParallelAllNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallelAllNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:7394:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:7395:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:7395:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:7396:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getParallelAllNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelAllNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7413:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop185:
                    do {
                        int alt185=2;
                        int LA185_0 = input.LA(1);

                        if ( (LA185_0==15) ) {
                            alt185=1;
                        }


                        switch (alt185) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7414:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getParallelAllNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7418:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:7419:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:7419:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:7420:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getParallelAllNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParallelAllNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop185;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallelAllNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getParallelAllNodeAccess().getChildKeyword_7());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getParallelAllNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtCpp.g:7451:3: ( (lv_child_25_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:7452:4: (lv_child_25_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:7452:4: (lv_child_25_0= ruleTreeNode )
            // InternalQualityBtCpp.g:7453:5: lv_child_25_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getParallelAllNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_child_25_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParallelAllNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_25_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtCpp.g:7470:3: (otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) ) )*
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==15) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // InternalQualityBtCpp.g:7471:4: otherlv_26= ',' ( (lv_child_27_0= ruleTreeNode ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_26, grammarAccess.getParallelAllNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtCpp.g:7475:4: ( (lv_child_27_0= ruleTreeNode ) )
            	    // InternalQualityBtCpp.g:7476:5: (lv_child_27_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtCpp.g:7476:5: (lv_child_27_0= ruleTreeNode )
            	    // InternalQualityBtCpp.g:7477:6: lv_child_27_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getParallelAllNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_child_27_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParallelAllNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_27_0,
            	    							"org.xtext.chalmers.QualityBtCpp.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop187;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getParallelAllNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getParallelAllNodeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallelAllNode"


    // $ANTLR start "entryRuleDelayNode"
    // InternalQualityBtCpp.g:7507:1: entryRuleDelayNode returns [EObject current=null] : iv_ruleDelayNode= ruleDelayNode EOF ;
    public final EObject entryRuleDelayNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayNode = null;


        try {
            // InternalQualityBtCpp.g:7507:50: (iv_ruleDelayNode= ruleDelayNode EOF )
            // InternalQualityBtCpp.g:7508:2: iv_ruleDelayNode= ruleDelayNode EOF
            {
             newCompositeNode(grammarAccess.getDelayNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelayNode=ruleDelayNode();

            state._fsp--;

             current =iv_ruleDelayNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelayNode"


    // $ANTLR start "ruleDelayNode"
    // InternalQualityBtCpp.g:7514:1: ruleDelayNode returns [EObject current=null] : (otherlv_0= 'DelayNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'delay_msec' ( (lv_delay_msec_6_0= ruleEString ) ) )? (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' ) ;
    public final EObject ruleDelayNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        AntlrDatatypeRuleToken lv_delay_msec_6_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_parameters_23_0 = null;

        EObject lv_child_26_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:7520:2: ( (otherlv_0= 'DelayNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'delay_msec' ( (lv_delay_msec_6_0= ruleEString ) ) )? (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' ) )
            // InternalQualityBtCpp.g:7521:2: (otherlv_0= 'DelayNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'delay_msec' ( (lv_delay_msec_6_0= ruleEString ) ) )? (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' )
            {
            // InternalQualityBtCpp.g:7521:2: (otherlv_0= 'DelayNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'delay_msec' ( (lv_delay_msec_6_0= ruleEString ) ) )? (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}' )
            // InternalQualityBtCpp.g:7522:3: otherlv_0= 'DelayNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'delay_msec' ( (lv_delay_msec_6_0= ruleEString ) ) )? (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )? otherlv_25= 'child' ( (lv_child_26_0= ruleTreeNode ) ) otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayNodeAccess().getDelayNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:7526:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:7527:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:7527:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:7528:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDelayNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelayNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getDelayNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:7549:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==18) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // InternalQualityBtCpp.g:7550:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getDelayNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:7554:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:7555:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:7555:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:7556:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDelayNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelayNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:7574:3: (otherlv_5= 'delay_msec' ( (lv_delay_msec_6_0= ruleEString ) ) )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==60) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // InternalQualityBtCpp.g:7575:4: otherlv_5= 'delay_msec' ( (lv_delay_msec_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getDelayNodeAccess().getDelay_msecKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:7579:4: ( (lv_delay_msec_6_0= ruleEString ) )
                    // InternalQualityBtCpp.g:7580:5: (lv_delay_msec_6_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:7580:5: (lv_delay_msec_6_0= ruleEString )
                    // InternalQualityBtCpp.g:7581:6: lv_delay_msec_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDelayNodeAccess().getDelay_msecEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_delay_msec_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelayNodeRule());
                    						}
                    						set(
                    							current,
                    							"delay_msec",
                    							lv_delay_msec_6_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:7599:3: (otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==26) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // InternalQualityBtCpp.g:7600:4: otherlv_7= 'satisfices' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getDelayNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getDelayNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:7608:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:7609:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:7609:5: ( ruleEString )
                    // InternalQualityBtCpp.g:7610:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelayNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelayNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7624:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop190:
                    do {
                        int alt190=2;
                        int LA190_0 = input.LA(1);

                        if ( (LA190_0==15) ) {
                            alt190=1;
                        }


                        switch (alt190) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7625:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDelayNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7629:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:7630:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:7630:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:7631:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelayNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelayNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop190;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getDelayNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:7651:3: (otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==29) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalQualityBtCpp.g:7652:4: otherlv_13= 'satisfies' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getDelayNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getDelayNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:7660:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:7661:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:7661:5: ( ruleEString )
                    // InternalQualityBtCpp.g:7662:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelayNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelayNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7676:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop192:
                    do {
                        int alt192=2;
                        int LA192_0 = input.LA(1);

                        if ( (LA192_0==15) ) {
                            alt192=1;
                        }


                        switch (alt192) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7677:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getDelayNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7681:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:7682:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:7682:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:7683:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDelayNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDelayNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop192;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_18, grammarAccess.getDelayNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:7703:3: (otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}' )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( (LA195_0==30) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // InternalQualityBtCpp.g:7704:4: otherlv_19= 'parameters' otherlv_20= '{' ( (lv_parameters_21_0= ruleParameter ) ) (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getDelayNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getDelayNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:7712:4: ( (lv_parameters_21_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:7713:5: (lv_parameters_21_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:7713:5: (lv_parameters_21_0= ruleParameter )
                    // InternalQualityBtCpp.g:7714:6: lv_parameters_21_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getDelayNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_21_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelayNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_21_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7731:4: (otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) ) )*
                    loop194:
                    do {
                        int alt194=2;
                        int LA194_0 = input.LA(1);

                        if ( (LA194_0==15) ) {
                            alt194=1;
                        }


                        switch (alt194) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7732:5: otherlv_22= ',' ( (lv_parameters_23_0= ruleParameter ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getDelayNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7736:5: ( (lv_parameters_23_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:7737:6: (lv_parameters_23_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:7737:6: (lv_parameters_23_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:7738:7: lv_parameters_23_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDelayNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_23_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDelayNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_23_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop194;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_24, grammarAccess.getDelayNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_25, grammarAccess.getDelayNodeAccess().getChildKeyword_8());
            		
            // InternalQualityBtCpp.g:7765:3: ( (lv_child_26_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:7766:4: (lv_child_26_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:7766:4: (lv_child_26_0= ruleTreeNode )
            // InternalQualityBtCpp.g:7767:5: lv_child_26_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getDelayNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_26_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelayNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_26_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getDelayNodeAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelayNode"


    // $ANTLR start "entryRulePreconditionNode"
    // InternalQualityBtCpp.g:7792:1: entryRulePreconditionNode returns [EObject current=null] : iv_rulePreconditionNode= rulePreconditionNode EOF ;
    public final EObject entryRulePreconditionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreconditionNode = null;


        try {
            // InternalQualityBtCpp.g:7792:57: (iv_rulePreconditionNode= rulePreconditionNode EOF )
            // InternalQualityBtCpp.g:7793:2: iv_rulePreconditionNode= rulePreconditionNode EOF
            {
             newCompositeNode(grammarAccess.getPreconditionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreconditionNode=rulePreconditionNode();

            state._fsp--;

             current =iv_rulePreconditionNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreconditionNode"


    // $ANTLR start "rulePreconditionNode"
    // InternalQualityBtCpp.g:7799:1: rulePreconditionNode returns [EObject current=null] : (otherlv_0= 'PreconditionNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject rulePreconditionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:7805:2: ( (otherlv_0= 'PreconditionNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:7806:2: (otherlv_0= 'PreconditionNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:7806:2: (otherlv_0= 'PreconditionNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:7807:3: otherlv_0= 'PreconditionNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionNodeAccess().getPreconditionNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:7811:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:7812:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:7812:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:7813:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreconditionNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPreconditionNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:7834:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==18) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // InternalQualityBtCpp.g:7835:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPreconditionNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:7839:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:7840:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:7840:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:7841:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPreconditionNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPreconditionNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:7859:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==26) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // InternalQualityBtCpp.g:7860:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getPreconditionNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getPreconditionNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:7868:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:7869:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:7869:5: ( ruleEString )
                    // InternalQualityBtCpp.g:7870:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreconditionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPreconditionNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7884:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop197:
                    do {
                        int alt197=2;
                        int LA197_0 = input.LA(1);

                        if ( (LA197_0==15) ) {
                            alt197=1;
                        }


                        switch (alt197) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7885:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getPreconditionNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7889:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:7890:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:7890:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:7891:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPreconditionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPreconditionNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop197;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getPreconditionNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:7911:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==29) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // InternalQualityBtCpp.g:7912:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getPreconditionNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getPreconditionNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:7920:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:7921:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:7921:5: ( ruleEString )
                    // InternalQualityBtCpp.g:7922:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreconditionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPreconditionNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7936:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop199:
                    do {
                        int alt199=2;
                        int LA199_0 = input.LA(1);

                        if ( (LA199_0==15) ) {
                            alt199=1;
                        }


                        switch (alt199) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7937:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getPreconditionNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7941:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:7942:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:7942:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:7943:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPreconditionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPreconditionNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop199;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getPreconditionNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:7963:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==30) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // InternalQualityBtCpp.g:7964:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getPreconditionNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getPreconditionNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:7972:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:7973:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:7973:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:7974:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getPreconditionNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPreconditionNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:7991:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop201:
                    do {
                        int alt201=2;
                        int LA201_0 = input.LA(1);

                        if ( (LA201_0==15) ) {
                            alt201=1;
                        }


                        switch (alt201) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:7992:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getPreconditionNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:7996:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:7997:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:7997:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:7998:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPreconditionNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPreconditionNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop201;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getPreconditionNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getPreconditionNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:8025:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:8026:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:8026:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:8027:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getPreconditionNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getPreconditionNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreconditionNode"


    // $ANTLR start "entryRuleEntryUpdatedDecoratorNode"
    // InternalQualityBtCpp.g:8052:1: entryRuleEntryUpdatedDecoratorNode returns [EObject current=null] : iv_ruleEntryUpdatedDecoratorNode= ruleEntryUpdatedDecoratorNode EOF ;
    public final EObject entryRuleEntryUpdatedDecoratorNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryUpdatedDecoratorNode = null;


        try {
            // InternalQualityBtCpp.g:8052:66: (iv_ruleEntryUpdatedDecoratorNode= ruleEntryUpdatedDecoratorNode EOF )
            // InternalQualityBtCpp.g:8053:2: iv_ruleEntryUpdatedDecoratorNode= ruleEntryUpdatedDecoratorNode EOF
            {
             newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntryUpdatedDecoratorNode=ruleEntryUpdatedDecoratorNode();

            state._fsp--;

             current =iv_ruleEntryUpdatedDecoratorNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntryUpdatedDecoratorNode"


    // $ANTLR start "ruleEntryUpdatedDecoratorNode"
    // InternalQualityBtCpp.g:8059:1: ruleEntryUpdatedDecoratorNode returns [EObject current=null] : (otherlv_0= 'EntryUpdatedDecoratorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject ruleEntryUpdatedDecoratorNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:8065:2: ( (otherlv_0= 'EntryUpdatedDecoratorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:8066:2: (otherlv_0= 'EntryUpdatedDecoratorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:8066:2: (otherlv_0= 'EntryUpdatedDecoratorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:8067:3: otherlv_0= 'EntryUpdatedDecoratorNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getEntryUpdatedDecoratorNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:8071:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:8072:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:8072:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:8073:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntryUpdatedDecoratorNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:8094:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==18) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // InternalQualityBtCpp.g:8095:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:8099:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:8100:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:8100:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:8101:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntryUpdatedDecoratorNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:8119:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==26) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalQualityBtCpp.g:8120:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:8128:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:8129:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:8129:5: ( ruleEString )
                    // InternalQualityBtCpp.g:8130:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntryUpdatedDecoratorNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8144:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop204:
                    do {
                        int alt204=2;
                        int LA204_0 = input.LA(1);

                        if ( (LA204_0==15) ) {
                            alt204=1;
                        }


                        switch (alt204) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8145:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8149:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:8150:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:8150:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:8151:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntryUpdatedDecoratorNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop204;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:8171:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==29) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // InternalQualityBtCpp.g:8172:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:8180:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:8181:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:8181:5: ( ruleEString )
                    // InternalQualityBtCpp.g:8182:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntryUpdatedDecoratorNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8196:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop206:
                    do {
                        int alt206=2;
                        int LA206_0 = input.LA(1);

                        if ( (LA206_0==15) ) {
                            alt206=1;
                        }


                        switch (alt206) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8197:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8201:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:8202:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:8202:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:8203:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntryUpdatedDecoratorNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop206;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:8223:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==30) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // InternalQualityBtCpp.g:8224:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:8232:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:8233:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:8233:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:8234:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntryUpdatedDecoratorNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8251:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop208:
                    do {
                        int alt208=2;
                        int LA208_0 = input.LA(1);

                        if ( (LA208_0==15) ) {
                            alt208=1;
                        }


                        switch (alt208) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8252:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8256:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:8257:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:8257:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:8258:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntryUpdatedDecoratorNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop208;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:8285:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:8286:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:8286:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:8287:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getEntryUpdatedDecoratorNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntryUpdatedDecoratorNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getEntryUpdatedDecoratorNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntryUpdatedDecoratorNode"


    // $ANTLR start "entryRuleRunOnceNode"
    // InternalQualityBtCpp.g:8312:1: entryRuleRunOnceNode returns [EObject current=null] : iv_ruleRunOnceNode= ruleRunOnceNode EOF ;
    public final EObject entryRuleRunOnceNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunOnceNode = null;


        try {
            // InternalQualityBtCpp.g:8312:52: (iv_ruleRunOnceNode= ruleRunOnceNode EOF )
            // InternalQualityBtCpp.g:8313:2: iv_ruleRunOnceNode= ruleRunOnceNode EOF
            {
             newCompositeNode(grammarAccess.getRunOnceNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunOnceNode=ruleRunOnceNode();

            state._fsp--;

             current =iv_ruleRunOnceNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRunOnceNode"


    // $ANTLR start "ruleRunOnceNode"
    // InternalQualityBtCpp.g:8319:1: ruleRunOnceNode returns [EObject current=null] : (otherlv_0= 'RunOnceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject ruleRunOnceNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:8325:2: ( (otherlv_0= 'RunOnceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:8326:2: (otherlv_0= 'RunOnceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:8326:2: (otherlv_0= 'RunOnceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:8327:3: otherlv_0= 'RunOnceNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRunOnceNodeAccess().getRunOnceNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:8331:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:8332:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:8332:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:8333:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRunOnceNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunOnceNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getRunOnceNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:8354:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==18) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // InternalQualityBtCpp.g:8355:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRunOnceNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:8359:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:8360:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:8360:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:8361:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRunOnceNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRunOnceNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:8379:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( (LA212_0==26) ) {
                alt212=1;
            }
            switch (alt212) {
                case 1 :
                    // InternalQualityBtCpp.g:8380:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getRunOnceNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRunOnceNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:8388:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:8389:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:8389:5: ( ruleEString )
                    // InternalQualityBtCpp.g:8390:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOnceNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRunOnceNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8404:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop211:
                    do {
                        int alt211=2;
                        int LA211_0 = input.LA(1);

                        if ( (LA211_0==15) ) {
                            alt211=1;
                        }


                        switch (alt211) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8405:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRunOnceNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8409:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:8410:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:8410:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:8411:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRunOnceNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRunOnceNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop211;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getRunOnceNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:8431:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==29) ) {
                alt214=1;
            }
            switch (alt214) {
                case 1 :
                    // InternalQualityBtCpp.g:8432:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getRunOnceNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getRunOnceNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:8440:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:8441:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:8441:5: ( ruleEString )
                    // InternalQualityBtCpp.g:8442:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOnceNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRunOnceNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8456:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop213:
                    do {
                        int alt213=2;
                        int LA213_0 = input.LA(1);

                        if ( (LA213_0==15) ) {
                            alt213=1;
                        }


                        switch (alt213) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8457:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRunOnceNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8461:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:8462:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:8462:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:8463:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRunOnceNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRunOnceNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop213;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getRunOnceNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:8483:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==30) ) {
                alt216=1;
            }
            switch (alt216) {
                case 1 :
                    // InternalQualityBtCpp.g:8484:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getRunOnceNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getRunOnceNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:8492:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:8493:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:8493:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:8494:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getRunOnceNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRunOnceNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8511:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop215:
                    do {
                        int alt215=2;
                        int LA215_0 = input.LA(1);

                        if ( (LA215_0==15) ) {
                            alt215=1;
                        }


                        switch (alt215) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8512:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getRunOnceNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8516:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:8517:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:8517:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:8518:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRunOnceNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRunOnceNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop215;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getRunOnceNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getRunOnceNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:8545:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:8546:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:8546:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:8547:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getRunOnceNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunOnceNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getRunOnceNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunOnceNode"


    // $ANTLR start "entryRuleLoopNode"
    // InternalQualityBtCpp.g:8572:1: entryRuleLoopNode returns [EObject current=null] : iv_ruleLoopNode= ruleLoopNode EOF ;
    public final EObject entryRuleLoopNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopNode = null;


        try {
            // InternalQualityBtCpp.g:8572:49: (iv_ruleLoopNode= ruleLoopNode EOF )
            // InternalQualityBtCpp.g:8573:2: iv_ruleLoopNode= ruleLoopNode EOF
            {
             newCompositeNode(grammarAccess.getLoopNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopNode=ruleLoopNode();

            state._fsp--;

             current =iv_ruleLoopNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopNode"


    // $ANTLR start "ruleLoopNode"
    // InternalQualityBtCpp.g:8579:1: ruleLoopNode returns [EObject current=null] : (otherlv_0= 'LoopNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject ruleLoopNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:8585:2: ( (otherlv_0= 'LoopNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:8586:2: (otherlv_0= 'LoopNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:8586:2: (otherlv_0= 'LoopNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:8587:3: otherlv_0= 'LoopNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopNodeAccess().getLoopNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:8591:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:8592:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:8592:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:8593:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoopNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:8614:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==18) ) {
                alt217=1;
            }
            switch (alt217) {
                case 1 :
                    // InternalQualityBtCpp.g:8615:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:8619:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:8620:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:8620:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:8621:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoopNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:8639:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==26) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // InternalQualityBtCpp.g:8640:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getLoopNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:8648:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:8649:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:8649:5: ( ruleEString )
                    // InternalQualityBtCpp.g:8650:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8664:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop218:
                    do {
                        int alt218=2;
                        int LA218_0 = input.LA(1);

                        if ( (LA218_0==15) ) {
                            alt218=1;
                        }


                        switch (alt218) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8665:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getLoopNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8669:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:8670:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:8670:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:8671:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoopNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getLoopNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop218;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getLoopNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:8691:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==29) ) {
                alt221=1;
            }
            switch (alt221) {
                case 1 :
                    // InternalQualityBtCpp.g:8692:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getLoopNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getLoopNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:8700:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:8701:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:8701:5: ( ruleEString )
                    // InternalQualityBtCpp.g:8702:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8716:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop220:
                    do {
                        int alt220=2;
                        int LA220_0 = input.LA(1);

                        if ( (LA220_0==15) ) {
                            alt220=1;
                        }


                        switch (alt220) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8717:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getLoopNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8721:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:8722:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:8722:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:8723:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoopNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getLoopNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop220;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getLoopNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:8743:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==30) ) {
                alt223=1;
            }
            switch (alt223) {
                case 1 :
                    // InternalQualityBtCpp.g:8744:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getLoopNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getLoopNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:8752:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:8753:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:8753:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:8754:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getLoopNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8771:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop222:
                    do {
                        int alt222=2;
                        int LA222_0 = input.LA(1);

                        if ( (LA222_0==15) ) {
                            alt222=1;
                        }


                        switch (alt222) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8772:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getLoopNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8776:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:8777:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:8777:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:8778:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop222;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getLoopNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getLoopNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:8805:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:8806:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:8806:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:8807:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getLoopNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getLoopNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopNode"


    // $ANTLR start "entryRuleConsumeQueueNode"
    // InternalQualityBtCpp.g:8832:1: entryRuleConsumeQueueNode returns [EObject current=null] : iv_ruleConsumeQueueNode= ruleConsumeQueueNode EOF ;
    public final EObject entryRuleConsumeQueueNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsumeQueueNode = null;


        try {
            // InternalQualityBtCpp.g:8832:57: (iv_ruleConsumeQueueNode= ruleConsumeQueueNode EOF )
            // InternalQualityBtCpp.g:8833:2: iv_ruleConsumeQueueNode= ruleConsumeQueueNode EOF
            {
             newCompositeNode(grammarAccess.getConsumeQueueNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsumeQueueNode=ruleConsumeQueueNode();

            state._fsp--;

             current =iv_ruleConsumeQueueNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConsumeQueueNode"


    // $ANTLR start "ruleConsumeQueueNode"
    // InternalQualityBtCpp.g:8839:1: ruleConsumeQueueNode returns [EObject current=null] : (otherlv_0= 'ConsumeQueueNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) ;
    public final EObject ruleConsumeQueueNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ID_4_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_child_24_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:8845:2: ( (otherlv_0= 'ConsumeQueueNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' ) )
            // InternalQualityBtCpp.g:8846:2: (otherlv_0= 'ConsumeQueueNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            {
            // InternalQualityBtCpp.g:8846:2: (otherlv_0= 'ConsumeQueueNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}' )
            // InternalQualityBtCpp.g:8847:3: otherlv_0= 'ConsumeQueueNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )? (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )? otherlv_23= 'child' ( (lv_child_24_0= ruleTreeNode ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConsumeQueueNodeAccess().getConsumeQueueNodeKeyword_0());
            		
            // InternalQualityBtCpp.g:8851:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtCpp.g:8852:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtCpp.g:8852:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtCpp.g:8853:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConsumeQueueNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getConsumeQueueNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtCpp.g:8874:3: (otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) ) )?
            int alt224=2;
            int LA224_0 = input.LA(1);

            if ( (LA224_0==18) ) {
                alt224=1;
            }
            switch (alt224) {
                case 1 :
                    // InternalQualityBtCpp.g:8875:4: otherlv_3= 'ID' ( (lv_ID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getConsumeQueueNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtCpp.g:8879:4: ( (lv_ID_4_0= ruleEString ) )
                    // InternalQualityBtCpp.g:8880:5: (lv_ID_4_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:8880:5: (lv_ID_4_0= ruleEString )
                    // InternalQualityBtCpp.g:8881:6: lv_ID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConsumeQueueNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_4_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:8899:3: (otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==26) ) {
                alt226=1;
            }
            switch (alt226) {
                case 1 :
                    // InternalQualityBtCpp.g:8900:4: otherlv_5= 'satisfices' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getConsumeQueueNodeAccess().getSatisficesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getConsumeQueueNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalQualityBtCpp.g:8908:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:8909:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:8909:5: ( ruleEString )
                    // InternalQualityBtCpp.g:8910:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConsumeQueueNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getSatisficesQualityCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8924:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop225:
                    do {
                        int alt225=2;
                        int LA225_0 = input.LA(1);

                        if ( (LA225_0==15) ) {
                            alt225=1;
                        }


                        switch (alt225) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8925:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getConsumeQueueNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8929:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:8930:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:8930:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:8931:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConsumeQueueNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getSatisficesQualityCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop225;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getConsumeQueueNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:8951:3: (otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt228=2;
            int LA228_0 = input.LA(1);

            if ( (LA228_0==29) ) {
                alt228=1;
            }
            switch (alt228) {
                case 1 :
                    // InternalQualityBtCpp.g:8952:4: otherlv_11= 'satisfies' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getConsumeQueueNodeAccess().getSatisfiesKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getConsumeQueueNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:8960:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:8961:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:8961:5: ( ruleEString )
                    // InternalQualityBtCpp.g:8962:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConsumeQueueNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getSatisfiesQualityRequirementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:8976:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop227:
                    do {
                        int alt227=2;
                        int LA227_0 = input.LA(1);

                        if ( (LA227_0==15) ) {
                            alt227=1;
                        }


                        switch (alt227) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:8977:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getConsumeQueueNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:8981:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:8982:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:8982:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:8983:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConsumeQueueNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getSatisfiesQualityRequirementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop227;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getConsumeQueueNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:9003:3: (otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}' )?
            int alt230=2;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==30) ) {
                alt230=1;
            }
            switch (alt230) {
                case 1 :
                    // InternalQualityBtCpp.g:9004:4: otherlv_17= 'parameters' otherlv_18= '{' ( (lv_parameters_19_0= ruleParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getConsumeQueueNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getConsumeQueueNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:9012:4: ( (lv_parameters_19_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:9013:5: (lv_parameters_19_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:9013:5: (lv_parameters_19_0= ruleParameter )
                    // InternalQualityBtCpp.g:9014:6: lv_parameters_19_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_19_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConsumeQueueNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_19_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9031:4: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) ) )*
                    loop229:
                    do {
                        int alt229=2;
                        int LA229_0 = input.LA(1);

                        if ( (LA229_0==15) ) {
                            alt229=1;
                        }


                        switch (alt229) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9032:5: otherlv_20= ',' ( (lv_parameters_21_0= ruleParameter ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getConsumeQueueNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9036:5: ( (lv_parameters_21_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:9037:6: (lv_parameters_21_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:9037:6: (lv_parameters_21_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:9038:7: lv_parameters_21_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_21_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConsumeQueueNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop229;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getConsumeQueueNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getConsumeQueueNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtCpp.g:9065:3: ( (lv_child_24_0= ruleTreeNode ) )
            // InternalQualityBtCpp.g:9066:4: (lv_child_24_0= ruleTreeNode )
            {
            // InternalQualityBtCpp.g:9066:4: (lv_child_24_0= ruleTreeNode )
            // InternalQualityBtCpp.g:9067:5: lv_child_24_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getConsumeQueueNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_24_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConsumeQueueNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_24_0,
            						"org.xtext.chalmers.QualityBtCpp.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getConsumeQueueNodeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConsumeQueueNode"


    // $ANTLR start "entryRuleTestNode"
    // InternalQualityBtCpp.g:9092:1: entryRuleTestNode returns [EObject current=null] : iv_ruleTestNode= ruleTestNode EOF ;
    public final EObject entryRuleTestNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestNode = null;


        try {
            // InternalQualityBtCpp.g:9092:49: (iv_ruleTestNode= ruleTestNode EOF )
            // InternalQualityBtCpp.g:9093:2: iv_ruleTestNode= ruleTestNode EOF
            {
             newCompositeNode(grammarAccess.getTestNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestNode=ruleTestNode();

            state._fsp--;

             current =iv_ruleTestNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestNode"


    // $ANTLR start "ruleTestNode"
    // InternalQualityBtCpp.g:9099:1: ruleTestNode returns [EObject current=null] : ( () otherlv_1= 'TestNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleTestNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:9105:2: ( ( () otherlv_1= 'TestNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:9106:2: ( () otherlv_1= 'TestNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:9106:2: ( () otherlv_1= 'TestNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:9107:3: () otherlv_1= 'TestNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:9107:3: ()
            // InternalQualityBtCpp.g:9108:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestNodeAccess().getTestNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTestNodeAccess().getTestNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:9118:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:9119:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:9119:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:9120:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getTestNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:9141:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( (LA231_0==18) ) {
                alt231=1;
            }
            switch (alt231) {
                case 1 :
                    // InternalQualityBtCpp.g:9142:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getTestNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:9146:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:9147:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:9147:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:9148:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:9166:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt233=2;
            int LA233_0 = input.LA(1);

            if ( (LA233_0==26) ) {
                alt233=1;
            }
            switch (alt233) {
                case 1 :
                    // InternalQualityBtCpp.g:9167:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getTestNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getTestNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:9175:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:9176:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:9176:5: ( ruleEString )
                    // InternalQualityBtCpp.g:9177:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTestNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9191:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop232:
                    do {
                        int alt232=2;
                        int LA232_0 = input.LA(1);

                        if ( (LA232_0==15) ) {
                            alt232=1;
                        }


                        switch (alt232) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9192:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTestNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9196:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:9197:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:9197:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:9198:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTestNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTestNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop232;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getTestNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:9218:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt235=2;
            int LA235_0 = input.LA(1);

            if ( (LA235_0==29) ) {
                alt235=1;
            }
            switch (alt235) {
                case 1 :
                    // InternalQualityBtCpp.g:9219:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getTestNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getTestNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:9227:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:9228:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:9228:5: ( ruleEString )
                    // InternalQualityBtCpp.g:9229:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTestNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9243:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop234:
                    do {
                        int alt234=2;
                        int LA234_0 = input.LA(1);

                        if ( (LA234_0==15) ) {
                            alt234=1;
                        }


                        switch (alt234) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9244:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTestNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9248:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:9249:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:9249:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:9250:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTestNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTestNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop234;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getTestNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:9270:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt237=2;
            int LA237_0 = input.LA(1);

            if ( (LA237_0==30) ) {
                alt237=1;
            }
            switch (alt237) {
                case 1 :
                    // InternalQualityBtCpp.g:9271:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getTestNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getTestNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:9279:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:9280:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:9280:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:9281:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTestNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9298:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop236:
                    do {
                        int alt236=2;
                        int LA236_0 = input.LA(1);

                        if ( (LA236_0==15) ) {
                            alt236=1;
                        }


                        switch (alt236) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9299:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getTestNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9303:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:9304:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:9304:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:9305:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTestNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTestNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop236;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getTestNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getTestNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestNode"


    // $ANTLR start "entryRuleEntryUpdatedActionNode"
    // InternalQualityBtCpp.g:9336:1: entryRuleEntryUpdatedActionNode returns [EObject current=null] : iv_ruleEntryUpdatedActionNode= ruleEntryUpdatedActionNode EOF ;
    public final EObject entryRuleEntryUpdatedActionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryUpdatedActionNode = null;


        try {
            // InternalQualityBtCpp.g:9336:63: (iv_ruleEntryUpdatedActionNode= ruleEntryUpdatedActionNode EOF )
            // InternalQualityBtCpp.g:9337:2: iv_ruleEntryUpdatedActionNode= ruleEntryUpdatedActionNode EOF
            {
             newCompositeNode(grammarAccess.getEntryUpdatedActionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntryUpdatedActionNode=ruleEntryUpdatedActionNode();

            state._fsp--;

             current =iv_ruleEntryUpdatedActionNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntryUpdatedActionNode"


    // $ANTLR start "ruleEntryUpdatedActionNode"
    // InternalQualityBtCpp.g:9343:1: ruleEntryUpdatedActionNode returns [EObject current=null] : ( () otherlv_1= 'EntryUpdatedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleEntryUpdatedActionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:9349:2: ( ( () otherlv_1= 'EntryUpdatedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:9350:2: ( () otherlv_1= 'EntryUpdatedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:9350:2: ( () otherlv_1= 'EntryUpdatedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:9351:3: () otherlv_1= 'EntryUpdatedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:9351:3: ()
            // InternalQualityBtCpp.g:9352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntryUpdatedActionNodeAccess().getEntryUpdatedActionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEntryUpdatedActionNodeAccess().getEntryUpdatedActionNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:9362:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:9363:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:9363:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:9364:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntryUpdatedActionNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntryUpdatedActionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getEntryUpdatedActionNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:9385:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt238=2;
            int LA238_0 = input.LA(1);

            if ( (LA238_0==18) ) {
                alt238=1;
            }
            switch (alt238) {
                case 1 :
                    // InternalQualityBtCpp.g:9386:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntryUpdatedActionNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:9390:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:9391:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:9391:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:9392:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntryUpdatedActionNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntryUpdatedActionNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:9410:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt240=2;
            int LA240_0 = input.LA(1);

            if ( (LA240_0==26) ) {
                alt240=1;
            }
            switch (alt240) {
                case 1 :
                    // InternalQualityBtCpp.g:9411:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntryUpdatedActionNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntryUpdatedActionNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:9419:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:9420:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:9420:5: ( ruleEString )
                    // InternalQualityBtCpp.g:9421:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntryUpdatedActionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntryUpdatedActionNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9435:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop239:
                    do {
                        int alt239=2;
                        int LA239_0 = input.LA(1);

                        if ( (LA239_0==15) ) {
                            alt239=1;
                        }


                        switch (alt239) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9436:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEntryUpdatedActionNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9440:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:9441:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:9441:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:9442:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntryUpdatedActionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEntryUpdatedActionNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop239;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntryUpdatedActionNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:9462:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt242=2;
            int LA242_0 = input.LA(1);

            if ( (LA242_0==29) ) {
                alt242=1;
            }
            switch (alt242) {
                case 1 :
                    // InternalQualityBtCpp.g:9463:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntryUpdatedActionNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntryUpdatedActionNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:9471:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:9472:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:9472:5: ( ruleEString )
                    // InternalQualityBtCpp.g:9473:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntryUpdatedActionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntryUpdatedActionNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9487:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop241:
                    do {
                        int alt241=2;
                        int LA241_0 = input.LA(1);

                        if ( (LA241_0==15) ) {
                            alt241=1;
                        }


                        switch (alt241) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9488:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getEntryUpdatedActionNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9492:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:9493:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:9493:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:9494:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntryUpdatedActionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEntryUpdatedActionNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop241;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getEntryUpdatedActionNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:9514:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt244=2;
            int LA244_0 = input.LA(1);

            if ( (LA244_0==30) ) {
                alt244=1;
            }
            switch (alt244) {
                case 1 :
                    // InternalQualityBtCpp.g:9515:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getEntryUpdatedActionNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getEntryUpdatedActionNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:9523:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:9524:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:9524:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:9525:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getEntryUpdatedActionNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntryUpdatedActionNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9542:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop243:
                    do {
                        int alt243=2;
                        int LA243_0 = input.LA(1);

                        if ( (LA243_0==15) ) {
                            alt243=1;
                        }


                        switch (alt243) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9543:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getEntryUpdatedActionNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9547:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:9548:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:9548:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:9549:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntryUpdatedActionNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntryUpdatedActionNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop243;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getEntryUpdatedActionNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getEntryUpdatedActionNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntryUpdatedActionNode"


    // $ANTLR start "entryRuleUnsetBlackboardNode"
    // InternalQualityBtCpp.g:9580:1: entryRuleUnsetBlackboardNode returns [EObject current=null] : iv_ruleUnsetBlackboardNode= ruleUnsetBlackboardNode EOF ;
    public final EObject entryRuleUnsetBlackboardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsetBlackboardNode = null;


        try {
            // InternalQualityBtCpp.g:9580:60: (iv_ruleUnsetBlackboardNode= ruleUnsetBlackboardNode EOF )
            // InternalQualityBtCpp.g:9581:2: iv_ruleUnsetBlackboardNode= ruleUnsetBlackboardNode EOF
            {
             newCompositeNode(grammarAccess.getUnsetBlackboardNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnsetBlackboardNode=ruleUnsetBlackboardNode();

            state._fsp--;

             current =iv_ruleUnsetBlackboardNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsetBlackboardNode"


    // $ANTLR start "ruleUnsetBlackboardNode"
    // InternalQualityBtCpp.g:9587:1: ruleUnsetBlackboardNode returns [EObject current=null] : ( () otherlv_1= 'UnsetBlackboardNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleUnsetBlackboardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:9593:2: ( ( () otherlv_1= 'UnsetBlackboardNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:9594:2: ( () otherlv_1= 'UnsetBlackboardNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:9594:2: ( () otherlv_1= 'UnsetBlackboardNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:9595:3: () otherlv_1= 'UnsetBlackboardNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:9595:3: ()
            // InternalQualityBtCpp.g:9596:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnsetBlackboardNodeAccess().getUnsetBlackboardNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUnsetBlackboardNodeAccess().getUnsetBlackboardNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:9606:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:9607:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:9607:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:9608:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnsetBlackboardNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnsetBlackboardNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getUnsetBlackboardNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:9629:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt245=2;
            int LA245_0 = input.LA(1);

            if ( (LA245_0==18) ) {
                alt245=1;
            }
            switch (alt245) {
                case 1 :
                    // InternalQualityBtCpp.g:9630:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnsetBlackboardNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:9634:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:9635:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:9635:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:9636:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUnsetBlackboardNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnsetBlackboardNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:9654:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt247=2;
            int LA247_0 = input.LA(1);

            if ( (LA247_0==26) ) {
                alt247=1;
            }
            switch (alt247) {
                case 1 :
                    // InternalQualityBtCpp.g:9655:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnsetBlackboardNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getUnsetBlackboardNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:9663:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:9664:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:9664:5: ( ruleEString )
                    // InternalQualityBtCpp.g:9665:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnsetBlackboardNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnsetBlackboardNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9679:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop246:
                    do {
                        int alt246=2;
                        int LA246_0 = input.LA(1);

                        if ( (LA246_0==15) ) {
                            alt246=1;
                        }


                        switch (alt246) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9680:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getUnsetBlackboardNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9684:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:9685:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:9685:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:9686:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUnsetBlackboardNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUnsetBlackboardNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop246;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnsetBlackboardNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:9706:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt249=2;
            int LA249_0 = input.LA(1);

            if ( (LA249_0==29) ) {
                alt249=1;
            }
            switch (alt249) {
                case 1 :
                    // InternalQualityBtCpp.g:9707:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getUnsetBlackboardNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getUnsetBlackboardNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:9715:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:9716:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:9716:5: ( ruleEString )
                    // InternalQualityBtCpp.g:9717:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnsetBlackboardNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnsetBlackboardNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9731:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop248:
                    do {
                        int alt248=2;
                        int LA248_0 = input.LA(1);

                        if ( (LA248_0==15) ) {
                            alt248=1;
                        }


                        switch (alt248) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9732:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getUnsetBlackboardNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9736:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:9737:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:9737:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:9738:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUnsetBlackboardNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUnsetBlackboardNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop248;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getUnsetBlackboardNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:9758:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt251=2;
            int LA251_0 = input.LA(1);

            if ( (LA251_0==30) ) {
                alt251=1;
            }
            switch (alt251) {
                case 1 :
                    // InternalQualityBtCpp.g:9759:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getUnsetBlackboardNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getUnsetBlackboardNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:9767:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:9768:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:9768:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:9769:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getUnsetBlackboardNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnsetBlackboardNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9786:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop250:
                    do {
                        int alt250=2;
                        int LA250_0 = input.LA(1);

                        if ( (LA250_0==15) ) {
                            alt250=1;
                        }


                        switch (alt250) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9787:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getUnsetBlackboardNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9791:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:9792:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:9792:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:9793:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnsetBlackboardNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnsetBlackboardNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop250;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getUnsetBlackboardNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getUnsetBlackboardNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsetBlackboardNode"


    // $ANTLR start "entryRuleThreadedActionNode"
    // InternalQualityBtCpp.g:9824:1: entryRuleThreadedActionNode returns [EObject current=null] : iv_ruleThreadedActionNode= ruleThreadedActionNode EOF ;
    public final EObject entryRuleThreadedActionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreadedActionNode = null;


        try {
            // InternalQualityBtCpp.g:9824:59: (iv_ruleThreadedActionNode= ruleThreadedActionNode EOF )
            // InternalQualityBtCpp.g:9825:2: iv_ruleThreadedActionNode= ruleThreadedActionNode EOF
            {
             newCompositeNode(grammarAccess.getThreadedActionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreadedActionNode=ruleThreadedActionNode();

            state._fsp--;

             current =iv_ruleThreadedActionNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThreadedActionNode"


    // $ANTLR start "ruleThreadedActionNode"
    // InternalQualityBtCpp.g:9831:1: ruleThreadedActionNode returns [EObject current=null] : ( () otherlv_1= 'ThreadedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleThreadedActionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:9837:2: ( ( () otherlv_1= 'ThreadedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:9838:2: ( () otherlv_1= 'ThreadedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:9838:2: ( () otherlv_1= 'ThreadedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:9839:3: () otherlv_1= 'ThreadedActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:9839:3: ()
            // InternalQualityBtCpp.g:9840:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThreadedActionNodeAccess().getThreadedActionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getThreadedActionNodeAccess().getThreadedActionNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:9850:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:9851:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:9851:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:9852:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getThreadedActionNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThreadedActionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getThreadedActionNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:9873:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt252=2;
            int LA252_0 = input.LA(1);

            if ( (LA252_0==18) ) {
                alt252=1;
            }
            switch (alt252) {
                case 1 :
                    // InternalQualityBtCpp.g:9874:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getThreadedActionNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:9878:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:9879:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:9879:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:9880:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getThreadedActionNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThreadedActionNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:9898:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt254=2;
            int LA254_0 = input.LA(1);

            if ( (LA254_0==26) ) {
                alt254=1;
            }
            switch (alt254) {
                case 1 :
                    // InternalQualityBtCpp.g:9899:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getThreadedActionNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getThreadedActionNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:9907:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:9908:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:9908:5: ( ruleEString )
                    // InternalQualityBtCpp.g:9909:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThreadedActionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getThreadedActionNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9923:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop253:
                    do {
                        int alt253=2;
                        int LA253_0 = input.LA(1);

                        if ( (LA253_0==15) ) {
                            alt253=1;
                        }


                        switch (alt253) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9924:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getThreadedActionNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9928:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:9929:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:9929:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:9930:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getThreadedActionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getThreadedActionNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop253;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getThreadedActionNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:9950:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt256=2;
            int LA256_0 = input.LA(1);

            if ( (LA256_0==29) ) {
                alt256=1;
            }
            switch (alt256) {
                case 1 :
                    // InternalQualityBtCpp.g:9951:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getThreadedActionNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getThreadedActionNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:9959:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:9960:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:9960:5: ( ruleEString )
                    // InternalQualityBtCpp.g:9961:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThreadedActionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getThreadedActionNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:9975:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop255:
                    do {
                        int alt255=2;
                        int LA255_0 = input.LA(1);

                        if ( (LA255_0==15) ) {
                            alt255=1;
                        }


                        switch (alt255) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:9976:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getThreadedActionNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:9980:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:9981:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:9981:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:9982:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getThreadedActionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getThreadedActionNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop255;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getThreadedActionNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:10002:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt258=2;
            int LA258_0 = input.LA(1);

            if ( (LA258_0==30) ) {
                alt258=1;
            }
            switch (alt258) {
                case 1 :
                    // InternalQualityBtCpp.g:10003:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getThreadedActionNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getThreadedActionNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:10011:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:10012:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:10012:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:10013:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getThreadedActionNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThreadedActionNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10030:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop257:
                    do {
                        int alt257=2;
                        int LA257_0 = input.LA(1);

                        if ( (LA257_0==15) ) {
                            alt257=1;
                        }


                        switch (alt257) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10031:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getThreadedActionNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10035:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:10036:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:10036:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:10037:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getThreadedActionNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getThreadedActionNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop257;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getThreadedActionNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getThreadedActionNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThreadedActionNode"


    // $ANTLR start "entryRuleCoroActionNode"
    // InternalQualityBtCpp.g:10068:1: entryRuleCoroActionNode returns [EObject current=null] : iv_ruleCoroActionNode= ruleCoroActionNode EOF ;
    public final EObject entryRuleCoroActionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoroActionNode = null;


        try {
            // InternalQualityBtCpp.g:10068:55: (iv_ruleCoroActionNode= ruleCoroActionNode EOF )
            // InternalQualityBtCpp.g:10069:2: iv_ruleCoroActionNode= ruleCoroActionNode EOF
            {
             newCompositeNode(grammarAccess.getCoroActionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoroActionNode=ruleCoroActionNode();

            state._fsp--;

             current =iv_ruleCoroActionNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoroActionNode"


    // $ANTLR start "ruleCoroActionNode"
    // InternalQualityBtCpp.g:10075:1: ruleCoroActionNode returns [EObject current=null] : ( () otherlv_1= 'CoroActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleCoroActionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:10081:2: ( ( () otherlv_1= 'CoroActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:10082:2: ( () otherlv_1= 'CoroActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:10082:2: ( () otherlv_1= 'CoroActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:10083:3: () otherlv_1= 'CoroActionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:10083:3: ()
            // InternalQualityBtCpp.g:10084:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoroActionNodeAccess().getCoroActionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCoroActionNodeAccess().getCoroActionNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:10094:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:10095:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:10095:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:10096:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCoroActionNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoroActionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getCoroActionNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:10117:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt259=2;
            int LA259_0 = input.LA(1);

            if ( (LA259_0==18) ) {
                alt259=1;
            }
            switch (alt259) {
                case 1 :
                    // InternalQualityBtCpp.g:10118:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getCoroActionNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:10122:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:10123:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:10123:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:10124:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCoroActionNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoroActionNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:10142:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt261=2;
            int LA261_0 = input.LA(1);

            if ( (LA261_0==26) ) {
                alt261=1;
            }
            switch (alt261) {
                case 1 :
                    // InternalQualityBtCpp.g:10143:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getCoroActionNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getCoroActionNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:10151:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:10152:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:10152:5: ( ruleEString )
                    // InternalQualityBtCpp.g:10153:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCoroActionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCoroActionNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10167:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop260:
                    do {
                        int alt260=2;
                        int LA260_0 = input.LA(1);

                        if ( (LA260_0==15) ) {
                            alt260=1;
                        }


                        switch (alt260) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10168:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCoroActionNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10172:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:10173:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:10173:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:10174:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCoroActionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCoroActionNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop260;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getCoroActionNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:10194:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt263=2;
            int LA263_0 = input.LA(1);

            if ( (LA263_0==29) ) {
                alt263=1;
            }
            switch (alt263) {
                case 1 :
                    // InternalQualityBtCpp.g:10195:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getCoroActionNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getCoroActionNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:10203:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:10204:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:10204:5: ( ruleEString )
                    // InternalQualityBtCpp.g:10205:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCoroActionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCoroActionNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10219:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop262:
                    do {
                        int alt262=2;
                        int LA262_0 = input.LA(1);

                        if ( (LA262_0==15) ) {
                            alt262=1;
                        }


                        switch (alt262) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10220:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCoroActionNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10224:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:10225:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:10225:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:10226:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCoroActionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCoroActionNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop262;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getCoroActionNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:10246:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt265=2;
            int LA265_0 = input.LA(1);

            if ( (LA265_0==30) ) {
                alt265=1;
            }
            switch (alt265) {
                case 1 :
                    // InternalQualityBtCpp.g:10247:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getCoroActionNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getCoroActionNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:10255:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:10256:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:10256:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:10257:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getCoroActionNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoroActionNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10274:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop264:
                    do {
                        int alt264=2;
                        int LA264_0 = input.LA(1);

                        if ( (LA264_0==15) ) {
                            alt264=1;
                        }


                        switch (alt264) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10275:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getCoroActionNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10279:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:10280:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:10280:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:10281:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getCoroActionNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCoroActionNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop264;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getCoroActionNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getCoroActionNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoroActionNode"


    // $ANTLR start "entryRuleSleepNode"
    // InternalQualityBtCpp.g:10312:1: entryRuleSleepNode returns [EObject current=null] : iv_ruleSleepNode= ruleSleepNode EOF ;
    public final EObject entryRuleSleepNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleepNode = null;


        try {
            // InternalQualityBtCpp.g:10312:50: (iv_ruleSleepNode= ruleSleepNode EOF )
            // InternalQualityBtCpp.g:10313:2: iv_ruleSleepNode= ruleSleepNode EOF
            {
             newCompositeNode(grammarAccess.getSleepNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSleepNode=ruleSleepNode();

            state._fsp--;

             current =iv_ruleSleepNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSleepNode"


    // $ANTLR start "ruleSleepNode"
    // InternalQualityBtCpp.g:10319:1: ruleSleepNode returns [EObject current=null] : ( () otherlv_1= 'SleepNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleSleepNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:10325:2: ( ( () otherlv_1= 'SleepNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:10326:2: ( () otherlv_1= 'SleepNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:10326:2: ( () otherlv_1= 'SleepNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:10327:3: () otherlv_1= 'SleepNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:10327:3: ()
            // InternalQualityBtCpp.g:10328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSleepNodeAccess().getSleepNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepNodeAccess().getSleepNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:10338:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:10339:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:10339:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:10340:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSleepNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSleepNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSleepNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:10361:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt266=2;
            int LA266_0 = input.LA(1);

            if ( (LA266_0==18) ) {
                alt266=1;
            }
            switch (alt266) {
                case 1 :
                    // InternalQualityBtCpp.g:10362:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSleepNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:10366:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:10367:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:10367:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:10368:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSleepNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSleepNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:10386:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt268=2;
            int LA268_0 = input.LA(1);

            if ( (LA268_0==26) ) {
                alt268=1;
            }
            switch (alt268) {
                case 1 :
                    // InternalQualityBtCpp.g:10387:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getSleepNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSleepNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:10395:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:10396:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:10396:5: ( ruleEString )
                    // InternalQualityBtCpp.g:10397:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSleepNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSleepNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10411:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop267:
                    do {
                        int alt267=2;
                        int LA267_0 = input.LA(1);

                        if ( (LA267_0==15) ) {
                            alt267=1;
                        }


                        switch (alt267) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10412:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSleepNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10416:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:10417:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:10417:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:10418:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSleepNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSleepNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop267;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getSleepNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:10438:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt270=2;
            int LA270_0 = input.LA(1);

            if ( (LA270_0==29) ) {
                alt270=1;
            }
            switch (alt270) {
                case 1 :
                    // InternalQualityBtCpp.g:10439:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getSleepNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getSleepNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:10447:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:10448:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:10448:5: ( ruleEString )
                    // InternalQualityBtCpp.g:10449:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSleepNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSleepNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10463:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop269:
                    do {
                        int alt269=2;
                        int LA269_0 = input.LA(1);

                        if ( (LA269_0==15) ) {
                            alt269=1;
                        }


                        switch (alt269) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10464:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSleepNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10468:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:10469:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:10469:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:10470:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSleepNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSleepNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop269;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getSleepNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:10490:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt272=2;
            int LA272_0 = input.LA(1);

            if ( (LA272_0==30) ) {
                alt272=1;
            }
            switch (alt272) {
                case 1 :
                    // InternalQualityBtCpp.g:10491:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getSleepNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getSleepNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:10499:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:10500:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:10500:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:10501:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSleepNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSleepNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10518:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop271:
                    do {
                        int alt271=2;
                        int LA271_0 = input.LA(1);

                        if ( (LA271_0==15) ) {
                            alt271=1;
                        }


                        switch (alt271) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10519:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getSleepNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10523:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:10524:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:10524:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:10525:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSleepNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSleepNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop271;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getSleepNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getSleepNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSleepNode"


    // $ANTLR start "entryRulePopFromQueueNode"
    // InternalQualityBtCpp.g:10556:1: entryRulePopFromQueueNode returns [EObject current=null] : iv_rulePopFromQueueNode= rulePopFromQueueNode EOF ;
    public final EObject entryRulePopFromQueueNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopFromQueueNode = null;


        try {
            // InternalQualityBtCpp.g:10556:57: (iv_rulePopFromQueueNode= rulePopFromQueueNode EOF )
            // InternalQualityBtCpp.g:10557:2: iv_rulePopFromQueueNode= rulePopFromQueueNode EOF
            {
             newCompositeNode(grammarAccess.getPopFromQueueNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePopFromQueueNode=rulePopFromQueueNode();

            state._fsp--;

             current =iv_rulePopFromQueueNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePopFromQueueNode"


    // $ANTLR start "rulePopFromQueueNode"
    // InternalQualityBtCpp.g:10563:1: rulePopFromQueueNode returns [EObject current=null] : ( () otherlv_1= 'PopFromQueueNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject rulePopFromQueueNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ID_5_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtCpp.g:10569:2: ( ( () otherlv_1= 'PopFromQueueNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalQualityBtCpp.g:10570:2: ( () otherlv_1= 'PopFromQueueNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalQualityBtCpp.g:10570:2: ( () otherlv_1= 'PopFromQueueNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalQualityBtCpp.g:10571:3: () otherlv_1= 'PopFromQueueNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )? (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalQualityBtCpp.g:10571:3: ()
            // InternalQualityBtCpp.g:10572:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPopFromQueueNodeAccess().getPopFromQueueNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPopFromQueueNodeAccess().getPopFromQueueNodeKeyword_1());
            		
            // InternalQualityBtCpp.g:10582:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtCpp.g:10583:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtCpp.g:10583:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtCpp.g:10584:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPopFromQueueNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPopFromQueueNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.QualityBtCpp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getPopFromQueueNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtCpp.g:10605:3: (otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) ) )?
            int alt273=2;
            int LA273_0 = input.LA(1);

            if ( (LA273_0==18) ) {
                alt273=1;
            }
            switch (alt273) {
                case 1 :
                    // InternalQualityBtCpp.g:10606:4: otherlv_4= 'ID' ( (lv_ID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPopFromQueueNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtCpp.g:10610:4: ( (lv_ID_5_0= ruleEString ) )
                    // InternalQualityBtCpp.g:10611:5: (lv_ID_5_0= ruleEString )
                    {
                    // InternalQualityBtCpp.g:10611:5: (lv_ID_5_0= ruleEString )
                    // InternalQualityBtCpp.g:10612:6: lv_ID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPopFromQueueNodeAccess().getIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPopFromQueueNodeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_5_0,
                    							"org.xtext.chalmers.QualityBtCpp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtCpp.g:10630:3: (otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt275=2;
            int LA275_0 = input.LA(1);

            if ( (LA275_0==26) ) {
                alt275=1;
            }
            switch (alt275) {
                case 1 :
                    // InternalQualityBtCpp.g:10631:4: otherlv_6= 'satisfices' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getPopFromQueueNodeAccess().getSatisficesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPopFromQueueNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalQualityBtCpp.g:10639:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:10640:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:10640:5: ( ruleEString )
                    // InternalQualityBtCpp.g:10641:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPopFromQueueNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPopFromQueueNodeAccess().getSatisficesQualityCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10655:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop274:
                    do {
                        int alt274=2;
                        int LA274_0 = input.LA(1);

                        if ( (LA274_0==15) ) {
                            alt274=1;
                        }


                        switch (alt274) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10656:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPopFromQueueNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10660:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:10661:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:10661:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:10662:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPopFromQueueNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPopFromQueueNodeAccess().getSatisficesQualityCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop274;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getPopFromQueueNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:10682:3: (otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt277=2;
            int LA277_0 = input.LA(1);

            if ( (LA277_0==29) ) {
                alt277=1;
            }
            switch (alt277) {
                case 1 :
                    // InternalQualityBtCpp.g:10683:4: otherlv_12= 'satisfies' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getPopFromQueueNodeAccess().getSatisfiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getPopFromQueueNodeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalQualityBtCpp.g:10691:4: ( ( ruleEString ) )
                    // InternalQualityBtCpp.g:10692:5: ( ruleEString )
                    {
                    // InternalQualityBtCpp.g:10692:5: ( ruleEString )
                    // InternalQualityBtCpp.g:10693:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPopFromQueueNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPopFromQueueNodeAccess().getSatisfiesQualityRequirementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10707:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop276:
                    do {
                        int alt276=2;
                        int LA276_0 = input.LA(1);

                        if ( (LA276_0==15) ) {
                            alt276=1;
                        }


                        switch (alt276) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10708:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPopFromQueueNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10712:5: ( ( ruleEString ) )
                    	    // InternalQualityBtCpp.g:10713:6: ( ruleEString )
                    	    {
                    	    // InternalQualityBtCpp.g:10713:6: ( ruleEString )
                    	    // InternalQualityBtCpp.g:10714:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPopFromQueueNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPopFromQueueNodeAccess().getSatisfiesQualityRequirementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop276;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getPopFromQueueNodeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtCpp.g:10734:3: (otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}' )?
            int alt279=2;
            int LA279_0 = input.LA(1);

            if ( (LA279_0==30) ) {
                alt279=1;
            }
            switch (alt279) {
                case 1 :
                    // InternalQualityBtCpp.g:10735:4: otherlv_18= 'parameters' otherlv_19= '{' ( (lv_parameters_20_0= ruleParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getPopFromQueueNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getPopFromQueueNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtCpp.g:10743:4: ( (lv_parameters_20_0= ruleParameter ) )
                    // InternalQualityBtCpp.g:10744:5: (lv_parameters_20_0= ruleParameter )
                    {
                    // InternalQualityBtCpp.g:10744:5: (lv_parameters_20_0= ruleParameter )
                    // InternalQualityBtCpp.g:10745:6: lv_parameters_20_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getPopFromQueueNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_20_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPopFromQueueNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_20_0,
                    							"org.xtext.chalmers.QualityBtCpp.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtCpp.g:10762:4: (otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) ) )*
                    loop278:
                    do {
                        int alt278=2;
                        int LA278_0 = input.LA(1);

                        if ( (LA278_0==15) ) {
                            alt278=1;
                        }


                        switch (alt278) {
                    	case 1 :
                    	    // InternalQualityBtCpp.g:10763:5: otherlv_21= ',' ( (lv_parameters_22_0= ruleParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getPopFromQueueNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtCpp.g:10767:5: ( (lv_parameters_22_0= ruleParameter ) )
                    	    // InternalQualityBtCpp.g:10768:6: (lv_parameters_22_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtCpp.g:10768:6: (lv_parameters_22_0= ruleParameter )
                    	    // InternalQualityBtCpp.g:10769:7: lv_parameters_22_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPopFromQueueNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_22_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPopFromQueueNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_22_0,
                    	    								"org.xtext.chalmers.QualityBtCpp.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop278;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getPopFromQueueNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getPopFromQueueNodeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePopFromQueueNode"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xEDEFBFF582000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000064050000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000064010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000864040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000864000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000860000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000864050000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000864010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000860010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000840010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000864040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000864000000L});

}