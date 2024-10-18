package org.xtext.chalmers.qualitybt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.chalmers.qualitybt.services.QualityBtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQualityBtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KeepRunningUntilFailureNode", "BlackboardCheckDouble", "BlackboardCheckString", "SimpleConditionNode", "BlackboardCheckInt", "Return_on_mismatch", "AlwaysSuccessNode", "SetBlackboardNode", "ForceFailureNode", "ForceSuccessNode", "ReactiveFallback", "ReactiveSequence", "SequenceStarNode", "SimpleActionNode", "WhileDoElseNode", "IfThenElseNode", "TimerQueueNode", "AlwaysFailure", "BehaviorTree", "FallbackNode", "InverterNode", "ParallelNode", "SequenceNode", "Num_attempts", "SubtreeNode", "TimeoutNode", "NodeStatus", "RepeatNode", "SwitchNode", "Num_cycles", "Output_key", "Parameters", "CONDITION", "DECORATOR", "MnualNode", "RetryNode", "UNDEFINED", "NodeType", "CONTROL", "FAILURE", "RUNNING", "SUBTREE", "SUCCESS", "SubTree", "Value_A", "Value_B", "ACTION", "Child", "Value", "IDLE", "Msec", "Root", "ID", "Comma", "EqualsSign", "LeftCurlyBracket", "RightCurlyBracket", "RULE_NL", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int ForceSuccessNode=13;
    public static final int RULE_BEGIN=62;
    public static final int UNDEFINED=40;
    public static final int SubTree=47;
    public static final int DECORATOR=37;
    public static final int MnualNode=38;
    public static final int ForceFailureNode=12;
    public static final int ReactiveSequence=15;
    public static final int AlwaysFailure=21;
    public static final int ParallelNode=25;
    public static final int BlackboardCheckInt=8;
    public static final int ID=56;
    public static final int Child=51;
    public static final int Parameters=35;
    public static final int Root=55;
    public static final int RULE_ID=64;
    public static final int RUNNING=44;
    public static final int Output_key=34;
    public static final int SimpleActionNode=17;
    public static final int RepeatNode=31;
    public static final int RULE_INT=65;
    public static final int NodeType=41;
    public static final int Value=52;
    public static final int RULE_ML_COMMENT=67;
    public static final int CONDITION=36;
    public static final int SimpleConditionNode=7;
    public static final int IfThenElseNode=19;
    public static final int NodeStatus=30;
    public static final int CONTROL=42;
    public static final int Msec=54;
    public static final int RetryNode=39;
    public static final int RULE_END=63;
    public static final int ReactiveFallback=14;
    public static final int SUBTREE=45;
    public static final int TimeoutNode=29;
    public static final int AlwaysSuccessNode=10;
    public static final int RULE_STRING=66;
    public static final int Return_on_mismatch=9;
    public static final int RULE_SL_COMMENT=68;
    public static final int Comma=57;
    public static final int EqualsSign=58;
    public static final int Value_B=49;
    public static final int Value_A=48;
    public static final int Num_attempts=27;
    public static final int KeepRunningUntilFailureNode=4;
    public static final int BlackboardCheckDouble=5;
    public static final int TimerQueueNode=20;
    public static final int FallbackNode=23;
    public static final int RightCurlyBracket=60;
    public static final int EOF=-1;
    public static final int SequenceStarNode=16;
    public static final int InverterNode=24;
    public static final int SUCCESS=46;
    public static final int SubtreeNode=28;
    public static final int RULE_WS=69;
    public static final int LeftCurlyBracket=59;
    public static final int RULE_ANY_OTHER=70;
    public static final int BehaviorTree=22;
    public static final int SwitchNode=32;
    public static final int FAILURE=43;
    public static final int SequenceNode=26;
    public static final int WhileDoElseNode=18;
    public static final int ACTION=50;
    public static final int IDLE=53;
    public static final int SetBlackboardNode=11;
    public static final int Num_cycles=33;
    public static final int BlackboardCheckString=6;
    public static final int RULE_NL=61;

    // delegates
    // delegators


        public InternalQualityBtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQualityBtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQualityBtParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQualityBtParser.g"; }



     	private QualityBtGrammarAccess grammarAccess;

        public InternalQualityBtParser(TokenStream input, QualityBtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected QualityBtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalQualityBtParser.g:58:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalQualityBtParser.g:58:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalQualityBtParser.g:59:2: iv_ruleRoot= ruleRoot EOF
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
    // InternalQualityBtParser.g:65:1: ruleRoot returns [EObject current=null] : (otherlv_0= Root ( (lv_main_tree_to_execute_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN ( (lv_behaviortrees_3_0= ruleBehaviorTree ) ) ( (lv_behaviortrees_4_0= ruleBehaviorTree ) )* this_END_5= RULE_END ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_main_tree_to_execute_1_0 = null;

        EObject lv_behaviortrees_3_0 = null;

        EObject lv_behaviortrees_4_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:71:2: ( (otherlv_0= Root ( (lv_main_tree_to_execute_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN ( (lv_behaviortrees_3_0= ruleBehaviorTree ) ) ( (lv_behaviortrees_4_0= ruleBehaviorTree ) )* this_END_5= RULE_END ) )
            // InternalQualityBtParser.g:72:2: (otherlv_0= Root ( (lv_main_tree_to_execute_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN ( (lv_behaviortrees_3_0= ruleBehaviorTree ) ) ( (lv_behaviortrees_4_0= ruleBehaviorTree ) )* this_END_5= RULE_END )
            {
            // InternalQualityBtParser.g:72:2: (otherlv_0= Root ( (lv_main_tree_to_execute_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN ( (lv_behaviortrees_3_0= ruleBehaviorTree ) ) ( (lv_behaviortrees_4_0= ruleBehaviorTree ) )* this_END_5= RULE_END )
            // InternalQualityBtParser.g:73:3: otherlv_0= Root ( (lv_main_tree_to_execute_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN ( (lv_behaviortrees_3_0= ruleBehaviorTree ) ) ( (lv_behaviortrees_4_0= ruleBehaviorTree ) )* this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Root,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getRootKeyword_0());
            		
            // InternalQualityBtParser.g:77:3: ( (lv_main_tree_to_execute_1_0= ruleEString ) )
            // InternalQualityBtParser.g:78:4: (lv_main_tree_to_execute_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:78:4: (lv_main_tree_to_execute_1_0= ruleEString )
            // InternalQualityBtParser.g:79:5: lv_main_tree_to_execute_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRootAccess().getMain_tree_to_executeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_main_tree_to_execute_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"main_tree_to_execute",
            						lv_main_tree_to_execute_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getRootAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalQualityBtParser.g:100:3: ( (lv_behaviortrees_3_0= ruleBehaviorTree ) )
            // InternalQualityBtParser.g:101:4: (lv_behaviortrees_3_0= ruleBehaviorTree )
            {
            // InternalQualityBtParser.g:101:4: (lv_behaviortrees_3_0= ruleBehaviorTree )
            // InternalQualityBtParser.g:102:5: lv_behaviortrees_3_0= ruleBehaviorTree
            {

            					newCompositeNode(grammarAccess.getRootAccess().getBehaviortreesBehaviorTreeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_behaviortrees_3_0=ruleBehaviorTree();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					add(
            						current,
            						"behaviortrees",
            						lv_behaviortrees_3_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.BehaviorTree");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:119:3: ( (lv_behaviortrees_4_0= ruleBehaviorTree ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BehaviorTree) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQualityBtParser.g:120:4: (lv_behaviortrees_4_0= ruleBehaviorTree )
            	    {
            	    // InternalQualityBtParser.g:120:4: (lv_behaviortrees_4_0= ruleBehaviorTree )
            	    // InternalQualityBtParser.g:121:5: lv_behaviortrees_4_0= ruleBehaviorTree
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getBehaviortreesBehaviorTreeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_behaviortrees_4_0=ruleBehaviorTree();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviortrees",
            	    						lv_behaviortrees_4_0,
            	    						"org.xtext.chalmers.qualitybt.QualityBt.BehaviorTree");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getRootAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalQualityBtParser.g:146:1: entryRuleTreeNode returns [EObject current=null] : iv_ruleTreeNode= ruleTreeNode EOF ;
    public final EObject entryRuleTreeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreeNode = null;


        try {
            // InternalQualityBtParser.g:146:49: (iv_ruleTreeNode= ruleTreeNode EOF )
            // InternalQualityBtParser.g:147:2: iv_ruleTreeNode= ruleTreeNode EOF
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
    // InternalQualityBtParser.g:153:1: ruleTreeNode returns [EObject current=null] : (this_LeafNode_0= ruleLeafNode | this_ControlNode_1= ruleControlNode | this_DecoratorNode_2= ruleDecoratorNode | this_SubTree_3= ruleSubTree ) ;
    public final EObject ruleTreeNode() throws RecognitionException {
        EObject current = null;

        EObject this_LeafNode_0 = null;

        EObject this_ControlNode_1 = null;

        EObject this_DecoratorNode_2 = null;

        EObject this_SubTree_3 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:159:2: ( (this_LeafNode_0= ruleLeafNode | this_ControlNode_1= ruleControlNode | this_DecoratorNode_2= ruleDecoratorNode | this_SubTree_3= ruleSubTree ) )
            // InternalQualityBtParser.g:160:2: (this_LeafNode_0= ruleLeafNode | this_ControlNode_1= ruleControlNode | this_DecoratorNode_2= ruleDecoratorNode | this_SubTree_3= ruleSubTree )
            {
            // InternalQualityBtParser.g:160:2: (this_LeafNode_0= ruleLeafNode | this_ControlNode_1= ruleControlNode | this_DecoratorNode_2= ruleDecoratorNode | this_SubTree_3= ruleSubTree )
            int alt2=4;
            switch ( input.LA(1) ) {
            case SimpleConditionNode:
            case AlwaysSuccessNode:
            case SetBlackboardNode:
            case SimpleActionNode:
            case AlwaysFailure:
                {
                alt2=1;
                }
                break;
            case ReactiveFallback:
            case ReactiveSequence:
            case SequenceStarNode:
            case WhileDoElseNode:
            case IfThenElseNode:
            case FallbackNode:
            case ParallelNode:
            case SequenceNode:
            case SwitchNode:
            case MnualNode:
                {
                alt2=2;
                }
                break;
            case KeepRunningUntilFailureNode:
            case BlackboardCheckDouble:
            case BlackboardCheckString:
            case BlackboardCheckInt:
            case ForceFailureNode:
            case ForceSuccessNode:
            case TimerQueueNode:
            case InverterNode:
            case TimeoutNode:
            case RepeatNode:
            case RetryNode:
                {
                alt2=3;
                }
                break;
            case SubTree:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQualityBtParser.g:161:3: this_LeafNode_0= ruleLeafNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getLeafNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeafNode_0=ruleLeafNode();

                    state._fsp--;


                    			current = this_LeafNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityBtParser.g:170:3: this_ControlNode_1= ruleControlNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getControlNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlNode_1=ruleControlNode();

                    state._fsp--;


                    			current = this_ControlNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityBtParser.g:179:3: this_DecoratorNode_2= ruleDecoratorNode
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getDecoratorNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecoratorNode_2=ruleDecoratorNode();

                    state._fsp--;


                    			current = this_DecoratorNode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQualityBtParser.g:188:3: this_SubTree_3= ruleSubTree
                    {

                    			newCompositeNode(grammarAccess.getTreeNodeAccess().getSubTreeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubTree_3=ruleSubTree();

                    state._fsp--;


                    			current = this_SubTree_3;
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


    // $ANTLR start "entryRuleLeafNode"
    // InternalQualityBtParser.g:200:1: entryRuleLeafNode returns [EObject current=null] : iv_ruleLeafNode= ruleLeafNode EOF ;
    public final EObject entryRuleLeafNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeafNode = null;


        try {
            // InternalQualityBtParser.g:200:49: (iv_ruleLeafNode= ruleLeafNode EOF )
            // InternalQualityBtParser.g:201:2: iv_ruleLeafNode= ruleLeafNode EOF
            {
             newCompositeNode(grammarAccess.getLeafNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeafNode=ruleLeafNode();

            state._fsp--;

             current =iv_ruleLeafNode; 
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
    // $ANTLR end "entryRuleLeafNode"


    // $ANTLR start "ruleLeafNode"
    // InternalQualityBtParser.g:207:1: ruleLeafNode returns [EObject current=null] : (this_ActionNodeBase_0= ruleActionNodeBase | this_SimpleConditionNode_1= ruleSimpleConditionNode ) ;
    public final EObject ruleLeafNode() throws RecognitionException {
        EObject current = null;

        EObject this_ActionNodeBase_0 = null;

        EObject this_SimpleConditionNode_1 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:213:2: ( (this_ActionNodeBase_0= ruleActionNodeBase | this_SimpleConditionNode_1= ruleSimpleConditionNode ) )
            // InternalQualityBtParser.g:214:2: (this_ActionNodeBase_0= ruleActionNodeBase | this_SimpleConditionNode_1= ruleSimpleConditionNode )
            {
            // InternalQualityBtParser.g:214:2: (this_ActionNodeBase_0= ruleActionNodeBase | this_SimpleConditionNode_1= ruleSimpleConditionNode )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=AlwaysSuccessNode && LA3_0<=SetBlackboardNode)||LA3_0==SimpleActionNode||LA3_0==AlwaysFailure) ) {
                alt3=1;
            }
            else if ( (LA3_0==SimpleConditionNode) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQualityBtParser.g:215:3: this_ActionNodeBase_0= ruleActionNodeBase
                    {

                    			newCompositeNode(grammarAccess.getLeafNodeAccess().getActionNodeBaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionNodeBase_0=ruleActionNodeBase();

                    state._fsp--;


                    			current = this_ActionNodeBase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityBtParser.g:224:3: this_SimpleConditionNode_1= ruleSimpleConditionNode
                    {

                    			newCompositeNode(grammarAccess.getLeafNodeAccess().getSimpleConditionNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleConditionNode_1=ruleSimpleConditionNode();

                    state._fsp--;


                    			current = this_SimpleConditionNode_1;
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
    // $ANTLR end "ruleLeafNode"


    // $ANTLR start "entryRuleActionNodeBase"
    // InternalQualityBtParser.g:236:1: entryRuleActionNodeBase returns [EObject current=null] : iv_ruleActionNodeBase= ruleActionNodeBase EOF ;
    public final EObject entryRuleActionNodeBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionNodeBase = null;


        try {
            // InternalQualityBtParser.g:236:55: (iv_ruleActionNodeBase= ruleActionNodeBase EOF )
            // InternalQualityBtParser.g:237:2: iv_ruleActionNodeBase= ruleActionNodeBase EOF
            {
             newCompositeNode(grammarAccess.getActionNodeBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionNodeBase=ruleActionNodeBase();

            state._fsp--;

             current =iv_ruleActionNodeBase; 
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
    // $ANTLR end "entryRuleActionNodeBase"


    // $ANTLR start "ruleActionNodeBase"
    // InternalQualityBtParser.g:243:1: ruleActionNodeBase returns [EObject current=null] : (this_SimpleActionNode_0= ruleSimpleActionNode | this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode | this_AlwaysFailureNode_2= ruleAlwaysFailureNode | this_SetBlackboardNode_3= ruleSetBlackboardNode ) ;
    public final EObject ruleActionNodeBase() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleActionNode_0 = null;

        EObject this_AlwaysSuccessNode_1 = null;

        EObject this_AlwaysFailureNode_2 = null;

        EObject this_SetBlackboardNode_3 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:249:2: ( (this_SimpleActionNode_0= ruleSimpleActionNode | this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode | this_AlwaysFailureNode_2= ruleAlwaysFailureNode | this_SetBlackboardNode_3= ruleSetBlackboardNode ) )
            // InternalQualityBtParser.g:250:2: (this_SimpleActionNode_0= ruleSimpleActionNode | this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode | this_AlwaysFailureNode_2= ruleAlwaysFailureNode | this_SetBlackboardNode_3= ruleSetBlackboardNode )
            {
            // InternalQualityBtParser.g:250:2: (this_SimpleActionNode_0= ruleSimpleActionNode | this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode | this_AlwaysFailureNode_2= ruleAlwaysFailureNode | this_SetBlackboardNode_3= ruleSetBlackboardNode )
            int alt4=4;
            switch ( input.LA(1) ) {
            case SimpleActionNode:
                {
                alt4=1;
                }
                break;
            case AlwaysSuccessNode:
                {
                alt4=2;
                }
                break;
            case AlwaysFailure:
                {
                alt4=3;
                }
                break;
            case SetBlackboardNode:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQualityBtParser.g:251:3: this_SimpleActionNode_0= ruleSimpleActionNode
                    {

                    			newCompositeNode(grammarAccess.getActionNodeBaseAccess().getSimpleActionNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleActionNode_0=ruleSimpleActionNode();

                    state._fsp--;


                    			current = this_SimpleActionNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityBtParser.g:260:3: this_AlwaysSuccessNode_1= ruleAlwaysSuccessNode
                    {

                    			newCompositeNode(grammarAccess.getActionNodeBaseAccess().getAlwaysSuccessNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlwaysSuccessNode_1=ruleAlwaysSuccessNode();

                    state._fsp--;


                    			current = this_AlwaysSuccessNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityBtParser.g:269:3: this_AlwaysFailureNode_2= ruleAlwaysFailureNode
                    {

                    			newCompositeNode(grammarAccess.getActionNodeBaseAccess().getAlwaysFailureNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlwaysFailureNode_2=ruleAlwaysFailureNode();

                    state._fsp--;


                    			current = this_AlwaysFailureNode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQualityBtParser.g:278:3: this_SetBlackboardNode_3= ruleSetBlackboardNode
                    {

                    			newCompositeNode(grammarAccess.getActionNodeBaseAccess().getSetBlackboardNodeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetBlackboardNode_3=ruleSetBlackboardNode();

                    state._fsp--;


                    			current = this_SetBlackboardNode_3;
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
    // $ANTLR end "ruleActionNodeBase"


    // $ANTLR start "entryRuleControlNode"
    // InternalQualityBtParser.g:290:1: entryRuleControlNode returns [EObject current=null] : iv_ruleControlNode= ruleControlNode EOF ;
    public final EObject entryRuleControlNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlNode = null;


        try {
            // InternalQualityBtParser.g:290:52: (iv_ruleControlNode= ruleControlNode EOF )
            // InternalQualityBtParser.g:291:2: iv_ruleControlNode= ruleControlNode EOF
            {
             newCompositeNode(grammarAccess.getControlNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlNode=ruleControlNode();

            state._fsp--;

             current =iv_ruleControlNode; 
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
    // $ANTLR end "entryRuleControlNode"


    // $ANTLR start "ruleControlNode"
    // InternalQualityBtParser.g:297:1: ruleControlNode returns [EObject current=null] : (this_ReactiveSequence_0= ruleReactiveSequence | this_SequenceNode_1= ruleSequenceNode | this_FallbackNode_2= ruleFallbackNode | this_ReactiveFallback_3= ruleReactiveFallback | this_SequenceStarNode_4= ruleSequenceStarNode | this_ParallelNode_5= ruleParallelNode | this_IfThenElseNode_6= ruleIfThenElseNode | this_SwitchNode_7= ruleSwitchNode | this_WhileDoElseNode_8= ruleWhileDoElseNode | this_MnualNode_9= ruleMnualNode ) ;
    public final EObject ruleControlNode() throws RecognitionException {
        EObject current = null;

        EObject this_ReactiveSequence_0 = null;

        EObject this_SequenceNode_1 = null;

        EObject this_FallbackNode_2 = null;

        EObject this_ReactiveFallback_3 = null;

        EObject this_SequenceStarNode_4 = null;

        EObject this_ParallelNode_5 = null;

        EObject this_IfThenElseNode_6 = null;

        EObject this_SwitchNode_7 = null;

        EObject this_WhileDoElseNode_8 = null;

        EObject this_MnualNode_9 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:303:2: ( (this_ReactiveSequence_0= ruleReactiveSequence | this_SequenceNode_1= ruleSequenceNode | this_FallbackNode_2= ruleFallbackNode | this_ReactiveFallback_3= ruleReactiveFallback | this_SequenceStarNode_4= ruleSequenceStarNode | this_ParallelNode_5= ruleParallelNode | this_IfThenElseNode_6= ruleIfThenElseNode | this_SwitchNode_7= ruleSwitchNode | this_WhileDoElseNode_8= ruleWhileDoElseNode | this_MnualNode_9= ruleMnualNode ) )
            // InternalQualityBtParser.g:304:2: (this_ReactiveSequence_0= ruleReactiveSequence | this_SequenceNode_1= ruleSequenceNode | this_FallbackNode_2= ruleFallbackNode | this_ReactiveFallback_3= ruleReactiveFallback | this_SequenceStarNode_4= ruleSequenceStarNode | this_ParallelNode_5= ruleParallelNode | this_IfThenElseNode_6= ruleIfThenElseNode | this_SwitchNode_7= ruleSwitchNode | this_WhileDoElseNode_8= ruleWhileDoElseNode | this_MnualNode_9= ruleMnualNode )
            {
            // InternalQualityBtParser.g:304:2: (this_ReactiveSequence_0= ruleReactiveSequence | this_SequenceNode_1= ruleSequenceNode | this_FallbackNode_2= ruleFallbackNode | this_ReactiveFallback_3= ruleReactiveFallback | this_SequenceStarNode_4= ruleSequenceStarNode | this_ParallelNode_5= ruleParallelNode | this_IfThenElseNode_6= ruleIfThenElseNode | this_SwitchNode_7= ruleSwitchNode | this_WhileDoElseNode_8= ruleWhileDoElseNode | this_MnualNode_9= ruleMnualNode )
            int alt5=10;
            switch ( input.LA(1) ) {
            case ReactiveSequence:
                {
                alt5=1;
                }
                break;
            case SequenceNode:
                {
                alt5=2;
                }
                break;
            case FallbackNode:
                {
                alt5=3;
                }
                break;
            case ReactiveFallback:
                {
                alt5=4;
                }
                break;
            case SequenceStarNode:
                {
                alt5=5;
                }
                break;
            case ParallelNode:
                {
                alt5=6;
                }
                break;
            case IfThenElseNode:
                {
                alt5=7;
                }
                break;
            case SwitchNode:
                {
                alt5=8;
                }
                break;
            case WhileDoElseNode:
                {
                alt5=9;
                }
                break;
            case MnualNode:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQualityBtParser.g:305:3: this_ReactiveSequence_0= ruleReactiveSequence
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getReactiveSequenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReactiveSequence_0=ruleReactiveSequence();

                    state._fsp--;


                    			current = this_ReactiveSequence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityBtParser.g:314:3: this_SequenceNode_1= ruleSequenceNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getSequenceNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceNode_1=ruleSequenceNode();

                    state._fsp--;


                    			current = this_SequenceNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityBtParser.g:323:3: this_FallbackNode_2= ruleFallbackNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getFallbackNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FallbackNode_2=ruleFallbackNode();

                    state._fsp--;


                    			current = this_FallbackNode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQualityBtParser.g:332:3: this_ReactiveFallback_3= ruleReactiveFallback
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getReactiveFallbackParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReactiveFallback_3=ruleReactiveFallback();

                    state._fsp--;


                    			current = this_ReactiveFallback_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQualityBtParser.g:341:3: this_SequenceStarNode_4= ruleSequenceStarNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getSequenceStarNodeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceStarNode_4=ruleSequenceStarNode();

                    state._fsp--;


                    			current = this_SequenceStarNode_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQualityBtParser.g:350:3: this_ParallelNode_5= ruleParallelNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getParallelNodeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelNode_5=ruleParallelNode();

                    state._fsp--;


                    			current = this_ParallelNode_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalQualityBtParser.g:359:3: this_IfThenElseNode_6= ruleIfThenElseNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getIfThenElseNodeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfThenElseNode_6=ruleIfThenElseNode();

                    state._fsp--;


                    			current = this_IfThenElseNode_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalQualityBtParser.g:368:3: this_SwitchNode_7= ruleSwitchNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getSwitchNodeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SwitchNode_7=ruleSwitchNode();

                    state._fsp--;


                    			current = this_SwitchNode_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalQualityBtParser.g:377:3: this_WhileDoElseNode_8= ruleWhileDoElseNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getWhileDoElseNodeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileDoElseNode_8=ruleWhileDoElseNode();

                    state._fsp--;


                    			current = this_WhileDoElseNode_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalQualityBtParser.g:386:3: this_MnualNode_9= ruleMnualNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getMnualNodeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_MnualNode_9=ruleMnualNode();

                    state._fsp--;


                    			current = this_MnualNode_9;
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
    // $ANTLR end "ruleControlNode"


    // $ANTLR start "entryRuleDecoratorNode"
    // InternalQualityBtParser.g:398:1: entryRuleDecoratorNode returns [EObject current=null] : iv_ruleDecoratorNode= ruleDecoratorNode EOF ;
    public final EObject entryRuleDecoratorNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoratorNode = null;


        try {
            // InternalQualityBtParser.g:398:54: (iv_ruleDecoratorNode= ruleDecoratorNode EOF )
            // InternalQualityBtParser.g:399:2: iv_ruleDecoratorNode= ruleDecoratorNode EOF
            {
             newCompositeNode(grammarAccess.getDecoratorNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecoratorNode=ruleDecoratorNode();

            state._fsp--;

             current =iv_ruleDecoratorNode; 
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
    // $ANTLR end "entryRuleDecoratorNode"


    // $ANTLR start "ruleDecoratorNode"
    // InternalQualityBtParser.g:405:1: ruleDecoratorNode returns [EObject current=null] : (this_RepeatNode_0= ruleRepeatNode | this_ForceFailureNode_1= ruleForceFailureNode | this_ForceSuccessNode_2= ruleForceSuccessNode | this_RetryNode_3= ruleRetryNode | this_InverterNode_4= ruleInverterNode | this_TimeoutNode_5= ruleTimeoutNode | this_KeepRunningUntilFailureNode_6= ruleKeepRunningUntilFailureNode | this_TimerQueueNode_7= ruleTimerQueueNode | this_BlackboardCheckInt_8= ruleBlackboardCheckInt | this_BlackboardCheckDouble_9= ruleBlackboardCheckDouble | this_BlackboardCheckString_10= ruleBlackboardCheckString ) ;
    public final EObject ruleDecoratorNode() throws RecognitionException {
        EObject current = null;

        EObject this_RepeatNode_0 = null;

        EObject this_ForceFailureNode_1 = null;

        EObject this_ForceSuccessNode_2 = null;

        EObject this_RetryNode_3 = null;

        EObject this_InverterNode_4 = null;

        EObject this_TimeoutNode_5 = null;

        EObject this_KeepRunningUntilFailureNode_6 = null;

        EObject this_TimerQueueNode_7 = null;

        EObject this_BlackboardCheckInt_8 = null;

        EObject this_BlackboardCheckDouble_9 = null;

        EObject this_BlackboardCheckString_10 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:411:2: ( (this_RepeatNode_0= ruleRepeatNode | this_ForceFailureNode_1= ruleForceFailureNode | this_ForceSuccessNode_2= ruleForceSuccessNode | this_RetryNode_3= ruleRetryNode | this_InverterNode_4= ruleInverterNode | this_TimeoutNode_5= ruleTimeoutNode | this_KeepRunningUntilFailureNode_6= ruleKeepRunningUntilFailureNode | this_TimerQueueNode_7= ruleTimerQueueNode | this_BlackboardCheckInt_8= ruleBlackboardCheckInt | this_BlackboardCheckDouble_9= ruleBlackboardCheckDouble | this_BlackboardCheckString_10= ruleBlackboardCheckString ) )
            // InternalQualityBtParser.g:412:2: (this_RepeatNode_0= ruleRepeatNode | this_ForceFailureNode_1= ruleForceFailureNode | this_ForceSuccessNode_2= ruleForceSuccessNode | this_RetryNode_3= ruleRetryNode | this_InverterNode_4= ruleInverterNode | this_TimeoutNode_5= ruleTimeoutNode | this_KeepRunningUntilFailureNode_6= ruleKeepRunningUntilFailureNode | this_TimerQueueNode_7= ruleTimerQueueNode | this_BlackboardCheckInt_8= ruleBlackboardCheckInt | this_BlackboardCheckDouble_9= ruleBlackboardCheckDouble | this_BlackboardCheckString_10= ruleBlackboardCheckString )
            {
            // InternalQualityBtParser.g:412:2: (this_RepeatNode_0= ruleRepeatNode | this_ForceFailureNode_1= ruleForceFailureNode | this_ForceSuccessNode_2= ruleForceSuccessNode | this_RetryNode_3= ruleRetryNode | this_InverterNode_4= ruleInverterNode | this_TimeoutNode_5= ruleTimeoutNode | this_KeepRunningUntilFailureNode_6= ruleKeepRunningUntilFailureNode | this_TimerQueueNode_7= ruleTimerQueueNode | this_BlackboardCheckInt_8= ruleBlackboardCheckInt | this_BlackboardCheckDouble_9= ruleBlackboardCheckDouble | this_BlackboardCheckString_10= ruleBlackboardCheckString )
            int alt6=11;
            switch ( input.LA(1) ) {
            case RepeatNode:
                {
                alt6=1;
                }
                break;
            case ForceFailureNode:
                {
                alt6=2;
                }
                break;
            case ForceSuccessNode:
                {
                alt6=3;
                }
                break;
            case RetryNode:
                {
                alt6=4;
                }
                break;
            case InverterNode:
                {
                alt6=5;
                }
                break;
            case TimeoutNode:
                {
                alt6=6;
                }
                break;
            case KeepRunningUntilFailureNode:
                {
                alt6=7;
                }
                break;
            case TimerQueueNode:
                {
                alt6=8;
                }
                break;
            case BlackboardCheckInt:
                {
                alt6=9;
                }
                break;
            case BlackboardCheckDouble:
                {
                alt6=10;
                }
                break;
            case BlackboardCheckString:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQualityBtParser.g:413:3: this_RepeatNode_0= ruleRepeatNode
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getRepeatNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeatNode_0=ruleRepeatNode();

                    state._fsp--;


                    			current = this_RepeatNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityBtParser.g:422:3: this_ForceFailureNode_1= ruleForceFailureNode
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getForceFailureNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForceFailureNode_1=ruleForceFailureNode();

                    state._fsp--;


                    			current = this_ForceFailureNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityBtParser.g:431:3: this_ForceSuccessNode_2= ruleForceSuccessNode
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getForceSuccessNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForceSuccessNode_2=ruleForceSuccessNode();

                    state._fsp--;


                    			current = this_ForceSuccessNode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQualityBtParser.g:440:3: this_RetryNode_3= ruleRetryNode
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getRetryNodeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetryNode_3=ruleRetryNode();

                    state._fsp--;


                    			current = this_RetryNode_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQualityBtParser.g:449:3: this_InverterNode_4= ruleInverterNode
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getInverterNodeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_InverterNode_4=ruleInverterNode();

                    state._fsp--;


                    			current = this_InverterNode_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQualityBtParser.g:458:3: this_TimeoutNode_5= ruleTimeoutNode
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getTimeoutNodeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeoutNode_5=ruleTimeoutNode();

                    state._fsp--;


                    			current = this_TimeoutNode_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalQualityBtParser.g:467:3: this_KeepRunningUntilFailureNode_6= ruleKeepRunningUntilFailureNode
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getKeepRunningUntilFailureNodeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeepRunningUntilFailureNode_6=ruleKeepRunningUntilFailureNode();

                    state._fsp--;


                    			current = this_KeepRunningUntilFailureNode_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalQualityBtParser.g:476:3: this_TimerQueueNode_7= ruleTimerQueueNode
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getTimerQueueNodeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimerQueueNode_7=ruleTimerQueueNode();

                    state._fsp--;


                    			current = this_TimerQueueNode_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalQualityBtParser.g:485:3: this_BlackboardCheckInt_8= ruleBlackboardCheckInt
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getBlackboardCheckIntParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlackboardCheckInt_8=ruleBlackboardCheckInt();

                    state._fsp--;


                    			current = this_BlackboardCheckInt_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalQualityBtParser.g:494:3: this_BlackboardCheckDouble_9= ruleBlackboardCheckDouble
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getBlackboardCheckDoubleParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlackboardCheckDouble_9=ruleBlackboardCheckDouble();

                    state._fsp--;


                    			current = this_BlackboardCheckDouble_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalQualityBtParser.g:503:3: this_BlackboardCheckString_10= ruleBlackboardCheckString
                    {

                    			newCompositeNode(grammarAccess.getDecoratorNodeAccess().getBlackboardCheckStringParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlackboardCheckString_10=ruleBlackboardCheckString();

                    state._fsp--;


                    			current = this_BlackboardCheckString_10;
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
    // $ANTLR end "ruleDecoratorNode"


    // $ANTLR start "entryRuleBehaviorTree"
    // InternalQualityBtParser.g:515:1: entryRuleBehaviorTree returns [EObject current=null] : iv_ruleBehaviorTree= ruleBehaviorTree EOF ;
    public final EObject entryRuleBehaviorTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorTree = null;


        try {
            // InternalQualityBtParser.g:515:53: (iv_ruleBehaviorTree= ruleBehaviorTree EOF )
            // InternalQualityBtParser.g:516:2: iv_ruleBehaviorTree= ruleBehaviorTree EOF
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
    // InternalQualityBtParser.g:522:1: ruleBehaviorTree returns [EObject current=null] : (otherlv_0= BehaviorTree otherlv_1= ID otherlv_2= EqualsSign ( (lv_ID_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN ( (lv_node_5_0= ruleTreeNode ) ) ( (lv_node_6_0= ruleTreeNode ) )* this_END_7= RULE_END ) ;
    public final EObject ruleBehaviorTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_4=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_ID_3_0 = null;

        EObject lv_node_5_0 = null;

        EObject lv_node_6_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:528:2: ( (otherlv_0= BehaviorTree otherlv_1= ID otherlv_2= EqualsSign ( (lv_ID_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN ( (lv_node_5_0= ruleTreeNode ) ) ( (lv_node_6_0= ruleTreeNode ) )* this_END_7= RULE_END ) )
            // InternalQualityBtParser.g:529:2: (otherlv_0= BehaviorTree otherlv_1= ID otherlv_2= EqualsSign ( (lv_ID_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN ( (lv_node_5_0= ruleTreeNode ) ) ( (lv_node_6_0= ruleTreeNode ) )* this_END_7= RULE_END )
            {
            // InternalQualityBtParser.g:529:2: (otherlv_0= BehaviorTree otherlv_1= ID otherlv_2= EqualsSign ( (lv_ID_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN ( (lv_node_5_0= ruleTreeNode ) ) ( (lv_node_6_0= ruleTreeNode ) )* this_END_7= RULE_END )
            // InternalQualityBtParser.g:530:3: otherlv_0= BehaviorTree otherlv_1= ID otherlv_2= EqualsSign ( (lv_ID_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN ( (lv_node_5_0= ruleTreeNode ) ) ( (lv_node_6_0= ruleTreeNode ) )* this_END_7= RULE_END
            {
            otherlv_0=(Token)match(input,BehaviorTree,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorTreeAccess().getBehaviorTreeKeyword_0());
            		
            otherlv_1=(Token)match(input,ID,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorTreeAccess().getIDKeyword_1());
            		
            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorTreeAccess().getEqualsSignKeyword_2());
            		
            // InternalQualityBtParser.g:542:3: ( (lv_ID_3_0= ruleEString ) )
            // InternalQualityBtParser.g:543:4: (lv_ID_3_0= ruleEString )
            {
            // InternalQualityBtParser.g:543:4: (lv_ID_3_0= ruleEString )
            // InternalQualityBtParser.g:544:5: lv_ID_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviorTreeAccess().getIDEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_ID_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorTreeRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_3_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getBehaviorTreeAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalQualityBtParser.g:565:3: ( (lv_node_5_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:566:4: (lv_node_5_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:566:4: (lv_node_5_0= ruleTreeNode )
            // InternalQualityBtParser.g:567:5: lv_node_5_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getBehaviorTreeAccess().getNodeTreeNodeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_node_5_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorTreeRule());
            					}
            					add(
            						current,
            						"node",
            						lv_node_5_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:584:3: ( (lv_node_6_0= ruleTreeNode ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=KeepRunningUntilFailureNode && LA7_0<=BlackboardCheckInt)||(LA7_0>=AlwaysSuccessNode && LA7_0<=AlwaysFailure)||(LA7_0>=FallbackNode && LA7_0<=SequenceNode)||LA7_0==TimeoutNode||(LA7_0>=RepeatNode && LA7_0<=SwitchNode)||(LA7_0>=MnualNode && LA7_0<=RetryNode)||LA7_0==SubTree) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQualityBtParser.g:585:4: (lv_node_6_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:585:4: (lv_node_6_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:586:5: lv_node_6_0= ruleTreeNode
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorTreeAccess().getNodeTreeNodeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_node_6_0=ruleTreeNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorTreeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"node",
            	    						lv_node_6_0,
            	    						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getBehaviorTreeAccess().getENDTerminalRuleCall_7());
            		

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
    // InternalQualityBtParser.g:611:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQualityBtParser.g:611:47: (iv_ruleEString= ruleEString EOF )
            // InternalQualityBtParser.g:612:2: iv_ruleEString= ruleEString EOF
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
    // InternalQualityBtParser.g:618:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQualityBtParser.g:624:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQualityBtParser.g:625:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQualityBtParser.g:625:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQualityBtParser.g:626:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityBtParser.g:634:3: this_ID_1= RULE_ID
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
    // InternalQualityBtParser.g:645:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalQualityBtParser.g:645:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalQualityBtParser.g:646:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalQualityBtParser.g:652:1: ruleParameter returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:658:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalQualityBtParser.g:659:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalQualityBtParser.g:659:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleEString ) ) )
            // InternalQualityBtParser.g:660:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleEString ) )
            {
            // InternalQualityBtParser.g:660:3: ( (lv_key_0_0= ruleEString ) )
            // InternalQualityBtParser.g:661:4: (lv_key_0_0= ruleEString )
            {
            // InternalQualityBtParser.g:661:4: (lv_key_0_0= ruleEString )
            // InternalQualityBtParser.g:662:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
            		
            // InternalQualityBtParser.g:683:3: ( (lv_value_2_0= ruleEString ) )
            // InternalQualityBtParser.g:684:4: (lv_value_2_0= ruleEString )
            {
            // InternalQualityBtParser.g:684:4: (lv_value_2_0= ruleEString )
            // InternalQualityBtParser.g:685:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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


    // $ANTLR start "entryRuleAlwaysFailureNode"
    // InternalQualityBtParser.g:706:1: entryRuleAlwaysFailureNode returns [EObject current=null] : iv_ruleAlwaysFailureNode= ruleAlwaysFailureNode EOF ;
    public final EObject entryRuleAlwaysFailureNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysFailureNode = null;


        try {
            // InternalQualityBtParser.g:706:58: (iv_ruleAlwaysFailureNode= ruleAlwaysFailureNode EOF )
            // InternalQualityBtParser.g:707:2: iv_ruleAlwaysFailureNode= ruleAlwaysFailureNode EOF
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
    // InternalQualityBtParser.g:713:1: ruleAlwaysFailureNode returns [EObject current=null] : ( () otherlv_1= AlwaysFailure ) ;
    public final EObject ruleAlwaysFailureNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQualityBtParser.g:719:2: ( ( () otherlv_1= AlwaysFailure ) )
            // InternalQualityBtParser.g:720:2: ( () otherlv_1= AlwaysFailure )
            {
            // InternalQualityBtParser.g:720:2: ( () otherlv_1= AlwaysFailure )
            // InternalQualityBtParser.g:721:3: () otherlv_1= AlwaysFailure
            {
            // InternalQualityBtParser.g:721:3: ()
            // InternalQualityBtParser.g:722:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlwaysFailureNodeAccess().getAlwaysFailureNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,AlwaysFailure,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysFailureNodeAccess().getAlwaysFailureKeyword_1());
            		

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
    // InternalQualityBtParser.g:736:1: entryRuleAlwaysSuccessNode returns [EObject current=null] : iv_ruleAlwaysSuccessNode= ruleAlwaysSuccessNode EOF ;
    public final EObject entryRuleAlwaysSuccessNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysSuccessNode = null;


        try {
            // InternalQualityBtParser.g:736:58: (iv_ruleAlwaysSuccessNode= ruleAlwaysSuccessNode EOF )
            // InternalQualityBtParser.g:737:2: iv_ruleAlwaysSuccessNode= ruleAlwaysSuccessNode EOF
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
    // InternalQualityBtParser.g:743:1: ruleAlwaysSuccessNode returns [EObject current=null] : ( () otherlv_1= AlwaysSuccessNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket ) ;
    public final EObject ruleAlwaysSuccessNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_uID_5_0 = null;

        Enumerator lv_NodeType_7_0 = null;

        Enumerator lv_NodeStatus_9_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:749:2: ( ( () otherlv_1= AlwaysSuccessNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket ) )
            // InternalQualityBtParser.g:750:2: ( () otherlv_1= AlwaysSuccessNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:750:2: ( () otherlv_1= AlwaysSuccessNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket )
            // InternalQualityBtParser.g:751:3: () otherlv_1= AlwaysSuccessNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket
            {
            // InternalQualityBtParser.g:751:3: ()
            // InternalQualityBtParser.g:752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlwaysSuccessNodeAccess().getAlwaysSuccessNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,AlwaysSuccessNode,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysSuccessNodeAccess().getAlwaysSuccessNodeKeyword_1());
            		
            // InternalQualityBtParser.g:762:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtParser.g:763:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtParser.g:763:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtParser.g:764:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysSuccessNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtParser.g:785:3: (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQualityBtParser.g:786:4: otherlv_4= ID ( (lv_uID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlwaysSuccessNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:790:4: ( (lv_uID_5_0= ruleEString ) )
                    // InternalQualityBtParser.g:791:5: (lv_uID_5_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:791:5: (lv_uID_5_0= ruleEString )
                    // InternalQualityBtParser.g:792:6: lv_uID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getUIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_uID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_5_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:810:3: (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NodeType) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQualityBtParser.g:811:4: otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) )
                    {
                    otherlv_6=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getAlwaysSuccessNodeAccess().getNodeTypeKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:815:4: ( (lv_NodeType_7_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:816:5: (lv_NodeType_7_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:816:5: (lv_NodeType_7_0= ruleNodeType )
                    // InternalQualityBtParser.g:817:6: lv_NodeType_7_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getNodeTypeNodeTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_NodeType_7_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_7_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:835:3: (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NodeStatus) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQualityBtParser.g:836:4: otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) )
                    {
                    otherlv_8=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlwaysSuccessNodeAccess().getNodeStatusKeyword_6_0());
                    			
                    // InternalQualityBtParser.g:840:4: ( (lv_NodeStatus_9_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:841:5: (lv_NodeStatus_9_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:841:5: (lv_NodeStatus_9_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:842:6: lv_NodeStatus_9_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getNodeStatusNodeStatusEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_NodeStatus_9_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_9_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:860:3: (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Parameters) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQualityBtParser.g:861:4: otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket
                    {
                    otherlv_10=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getAlwaysSuccessNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAlwaysSuccessNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtParser.g:869:4: ( (lv_parameters_12_0= ruleParameter ) )
                    // InternalQualityBtParser.g:870:5: (lv_parameters_12_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:870:5: (lv_parameters_12_0= ruleParameter )
                    // InternalQualityBtParser.g:871:6: lv_parameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_12_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:888:4: (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:889:5: otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAlwaysSuccessNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:893:5: ( (lv_parameters_14_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:894:6: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:894:6: (lv_parameters_14_0= ruleParameter )
                    	    // InternalQualityBtParser.g:895:7: lv_parameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlwaysSuccessNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlwaysSuccessNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_14_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getAlwaysSuccessNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAlwaysSuccessNodeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalQualityBtParser.g:926:1: entryRuleSetBlackboardNode returns [EObject current=null] : iv_ruleSetBlackboardNode= ruleSetBlackboardNode EOF ;
    public final EObject entryRuleSetBlackboardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetBlackboardNode = null;


        try {
            // InternalQualityBtParser.g:926:58: (iv_ruleSetBlackboardNode= ruleSetBlackboardNode EOF )
            // InternalQualityBtParser.g:927:2: iv_ruleSetBlackboardNode= ruleSetBlackboardNode EOF
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
    // InternalQualityBtParser.g:933:1: ruleSetBlackboardNode returns [EObject current=null] : (otherlv_0= SetBlackboardNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) otherlv_11= Output_key ( (lv_output_key_12_0= ruleEString ) ) (otherlv_13= Parameters otherlv_14= LeftCurlyBracket ( (lv_parameters_15_0= ruleParameter ) ) (otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) ) )* otherlv_18= RightCurlyBracket )? otherlv_19= RightCurlyBracket ) ;
    public final EObject ruleSetBlackboardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        AntlrDatatypeRuleToken lv_output_key_12_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_parameters_17_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:939:2: ( (otherlv_0= SetBlackboardNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) otherlv_11= Output_key ( (lv_output_key_12_0= ruleEString ) ) (otherlv_13= Parameters otherlv_14= LeftCurlyBracket ( (lv_parameters_15_0= ruleParameter ) ) (otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) ) )* otherlv_18= RightCurlyBracket )? otherlv_19= RightCurlyBracket ) )
            // InternalQualityBtParser.g:940:2: (otherlv_0= SetBlackboardNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) otherlv_11= Output_key ( (lv_output_key_12_0= ruleEString ) ) (otherlv_13= Parameters otherlv_14= LeftCurlyBracket ( (lv_parameters_15_0= ruleParameter ) ) (otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) ) )* otherlv_18= RightCurlyBracket )? otherlv_19= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:940:2: (otherlv_0= SetBlackboardNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) otherlv_11= Output_key ( (lv_output_key_12_0= ruleEString ) ) (otherlv_13= Parameters otherlv_14= LeftCurlyBracket ( (lv_parameters_15_0= ruleParameter ) ) (otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) ) )* otherlv_18= RightCurlyBracket )? otherlv_19= RightCurlyBracket )
            // InternalQualityBtParser.g:941:3: otherlv_0= SetBlackboardNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) otherlv_11= Output_key ( (lv_output_key_12_0= ruleEString ) ) (otherlv_13= Parameters otherlv_14= LeftCurlyBracket ( (lv_parameters_15_0= ruleParameter ) ) (otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) ) )* otherlv_18= RightCurlyBracket )? otherlv_19= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,SetBlackboardNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSetBlackboardNodeAccess().getSetBlackboardNodeKeyword_0());
            		
            // InternalQualityBtParser.g:945:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:946:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:946:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:947:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSetBlackboardNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:968:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQualityBtParser.g:969:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetBlackboardNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:973:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:974:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:974:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:975:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:993:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NodeType) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQualityBtParser.g:994:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getSetBlackboardNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:998:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:999:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:999:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:1000:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1018:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NodeStatus) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQualityBtParser.g:1019:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getSetBlackboardNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:1023:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:1024:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:1024:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:1025:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,Value,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSetBlackboardNodeAccess().getValueKeyword_6());
            		
            // InternalQualityBtParser.g:1047:3: ( (lv_value_10_0= ruleEString ) )
            // InternalQualityBtParser.g:1048:4: (lv_value_10_0= ruleEString )
            {
            // InternalQualityBtParser.g:1048:4: (lv_value_10_0= ruleEString )
            // InternalQualityBtParser.g:1049:5: lv_value_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getValueEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_24);
            lv_value_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_10_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,Output_key,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getSetBlackboardNodeAccess().getOutput_keyKeyword_8());
            		
            // InternalQualityBtParser.g:1070:3: ( (lv_output_key_12_0= ruleEString ) )
            // InternalQualityBtParser.g:1071:4: (lv_output_key_12_0= ruleEString )
            {
            // InternalQualityBtParser.g:1071:4: (lv_output_key_12_0= ruleEString )
            // InternalQualityBtParser.g:1072:5: lv_output_key_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getOutput_keyEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_17);
            lv_output_key_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
            					}
            					set(
            						current,
            						"output_key",
            						lv_output_key_12_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:1089:3: (otherlv_13= Parameters otherlv_14= LeftCurlyBracket ( (lv_parameters_15_0= ruleParameter ) ) (otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) ) )* otherlv_18= RightCurlyBracket )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Parameters) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQualityBtParser.g:1090:4: otherlv_13= Parameters otherlv_14= LeftCurlyBracket ( (lv_parameters_15_0= ruleParameter ) ) (otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) ) )* otherlv_18= RightCurlyBracket
                    {
                    otherlv_13=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getSetBlackboardNodeAccess().getParametersKeyword_10_0());
                    			
                    otherlv_14=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getSetBlackboardNodeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalQualityBtParser.g:1098:4: ( (lv_parameters_15_0= ruleParameter ) )
                    // InternalQualityBtParser.g:1099:5: (lv_parameters_15_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:1099:5: (lv_parameters_15_0= ruleParameter )
                    // InternalQualityBtParser.g:1100:6: lv_parameters_15_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getParametersParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_15_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_15_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:1117:4: (otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==Comma) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:1118:5: otherlv_16= Comma ( (lv_parameters_17_0= ruleParameter ) )
                    	    {
                    	    otherlv_16=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getSetBlackboardNodeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:1122:5: ( (lv_parameters_17_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:1123:6: (lv_parameters_17_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:1123:6: (lv_parameters_17_0= ruleParameter )
                    	    // InternalQualityBtParser.g:1124:7: lv_parameters_17_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSetBlackboardNodeAccess().getParametersParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_17_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSetBlackboardNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_17_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

                    				newLeafNode(otherlv_18, grammarAccess.getSetBlackboardNodeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSetBlackboardNodeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalQualityBtParser.g:1155:1: entryRuleFallbackNode returns [EObject current=null] : iv_ruleFallbackNode= ruleFallbackNode EOF ;
    public final EObject entryRuleFallbackNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFallbackNode = null;


        try {
            // InternalQualityBtParser.g:1155:53: (iv_ruleFallbackNode= ruleFallbackNode EOF )
            // InternalQualityBtParser.g:1156:2: iv_ruleFallbackNode= ruleFallbackNode EOF
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
    // InternalQualityBtParser.g:1162:1: ruleFallbackNode returns [EObject current=null] : (otherlv_0= FallbackNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleFallbackNode() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:1168:2: ( (otherlv_0= FallbackNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:1169:2: (otherlv_0= FallbackNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:1169:2: (otherlv_0= FallbackNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:1170:3: otherlv_0= FallbackNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,FallbackNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFallbackNodeAccess().getFallbackNodeKeyword_0());
            		
            // InternalQualityBtParser.g:1174:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:1175:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:1175:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:1176:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFallbackNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getFallbackNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:1197:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQualityBtParser.g:1198:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFallbackNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:1202:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:1203:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:1203:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:1204:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1222:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NodeType) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQualityBtParser.g:1223:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getFallbackNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:1227:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:1228:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:1228:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:1229:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1247:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NodeStatus) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQualityBtParser.g:1248:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getFallbackNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:1252:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:1253:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:1253:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:1254:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1272:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Parameters) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQualityBtParser.g:1273:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFallbackNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getFallbackNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:1281:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:1282:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:1282:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:1283:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:1300:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:1301:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFallbackNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:1305:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:1306:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:1306:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:1307:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFallbackNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getFallbackNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getFallbackNodeAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getFallbackNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:1338:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:1339:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:1339:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:1340:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getFallbackNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:1357:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQualityBtParser.g:1358:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getFallbackNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:1362:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:1363:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:1363:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:1364:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getFallbackNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFallbackNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getFallbackNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getFallbackNodeAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalQualityBtParser.g:1394:1: entryRuleIfThenElseNode returns [EObject current=null] : iv_ruleIfThenElseNode= ruleIfThenElseNode EOF ;
    public final EObject entryRuleIfThenElseNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElseNode = null;


        try {
            // InternalQualityBtParser.g:1394:55: (iv_ruleIfThenElseNode= ruleIfThenElseNode EOF )
            // InternalQualityBtParser.g:1395:2: iv_ruleIfThenElseNode= ruleIfThenElseNode EOF
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
    // InternalQualityBtParser.g:1401:1: ruleIfThenElseNode returns [EObject current=null] : (otherlv_0= IfThenElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleIfThenElseNode() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:1407:2: ( (otherlv_0= IfThenElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:1408:2: (otherlv_0= IfThenElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:1408:2: (otherlv_0= IfThenElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:1409:3: otherlv_0= IfThenElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,IfThenElseNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIfThenElseNodeAccess().getIfThenElseNodeKeyword_0());
            		
            // InternalQualityBtParser.g:1413:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:1414:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:1414:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:1415:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getIfThenElseNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:1436:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQualityBtParser.g:1437:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getIfThenElseNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:1441:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:1442:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:1442:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:1443:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1461:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NodeType) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQualityBtParser.g:1462:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfThenElseNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:1466:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:1467:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:1467:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:1468:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1486:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NodeStatus) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQualityBtParser.g:1487:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getIfThenElseNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:1491:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:1492:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:1492:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:1493:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1511:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Parameters) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQualityBtParser.g:1512:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfThenElseNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfThenElseNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:1520:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:1521:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:1521:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:1522:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:1539:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==Comma) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:1540:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getIfThenElseNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:1544:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:1545:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:1545:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:1546:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getIfThenElseNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getIfThenElseNodeAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getIfThenElseNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:1577:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:1578:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:1578:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:1579:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:1596:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalQualityBtParser.g:1597:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getIfThenElseNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:1601:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:1602:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:1602:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:1603:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getIfThenElseNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfThenElseNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getIfThenElseNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getIfThenElseNodeAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleMnualNode"
    // InternalQualityBtParser.g:1633:1: entryRuleMnualNode returns [EObject current=null] : iv_ruleMnualNode= ruleMnualNode EOF ;
    public final EObject entryRuleMnualNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMnualNode = null;


        try {
            // InternalQualityBtParser.g:1633:50: (iv_ruleMnualNode= ruleMnualNode EOF )
            // InternalQualityBtParser.g:1634:2: iv_ruleMnualNode= ruleMnualNode EOF
            {
             newCompositeNode(grammarAccess.getMnualNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMnualNode=ruleMnualNode();

            state._fsp--;

             current =iv_ruleMnualNode; 
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
    // $ANTLR end "entryRuleMnualNode"


    // $ANTLR start "ruleMnualNode"
    // InternalQualityBtParser.g:1640:1: ruleMnualNode returns [EObject current=null] : (otherlv_0= MnualNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleMnualNode() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:1646:2: ( (otherlv_0= MnualNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:1647:2: (otherlv_0= MnualNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:1647:2: (otherlv_0= MnualNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:1648:3: otherlv_0= MnualNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,MnualNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMnualNodeAccess().getMnualNodeKeyword_0());
            		
            // InternalQualityBtParser.g:1652:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:1653:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:1653:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:1654:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMnualNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMnualNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getMnualNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:1675:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQualityBtParser.g:1676:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMnualNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:1680:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:1681:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:1681:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:1682:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMnualNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMnualNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1700:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==NodeType) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQualityBtParser.g:1701:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getMnualNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:1705:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:1706:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:1706:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:1707:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getMnualNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMnualNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1725:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NodeStatus) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQualityBtParser.g:1726:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getMnualNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:1730:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:1731:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:1731:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:1732:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getMnualNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMnualNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1750:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Parameters) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQualityBtParser.g:1751:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getMnualNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMnualNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:1759:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:1760:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:1760:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:1761:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMnualNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMnualNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:1778:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==Comma) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:1779:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getMnualNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:1783:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:1784:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:1784:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:1785:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMnualNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMnualNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getMnualNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getMnualNodeAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getMnualNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:1816:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:1817:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:1817:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:1818:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getMnualNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMnualNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:1835:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Comma) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalQualityBtParser.g:1836:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getMnualNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:1840:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:1841:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:1841:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:1842:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getMnualNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMnualNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getMnualNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getMnualNodeAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleMnualNode"


    // $ANTLR start "entryRuleParallelNode"
    // InternalQualityBtParser.g:1872:1: entryRuleParallelNode returns [EObject current=null] : iv_ruleParallelNode= ruleParallelNode EOF ;
    public final EObject entryRuleParallelNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelNode = null;


        try {
            // InternalQualityBtParser.g:1872:53: (iv_ruleParallelNode= ruleParallelNode EOF )
            // InternalQualityBtParser.g:1873:2: iv_ruleParallelNode= ruleParallelNode EOF
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
    // InternalQualityBtParser.g:1879:1: ruleParallelNode returns [EObject current=null] : (otherlv_0= ParallelNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleParallelNode() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:1885:2: ( (otherlv_0= ParallelNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:1886:2: (otherlv_0= ParallelNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:1886:2: (otherlv_0= ParallelNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:1887:3: otherlv_0= ParallelNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,ParallelNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelNodeAccess().getParallelNodeKeyword_0());
            		
            // InternalQualityBtParser.g:1891:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:1892:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:1892:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:1893:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParallelNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParallelNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getParallelNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:1914:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQualityBtParser.g:1915:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallelNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:1919:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:1920:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:1920:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:1921:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParallelNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1939:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==NodeType) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQualityBtParser.g:1940:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallelNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:1944:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:1945:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:1945:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:1946:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getParallelNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1964:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==NodeStatus) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQualityBtParser.g:1965:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallelNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:1969:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:1970:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:1970:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:1971:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getParallelNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:1989:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Parameters) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQualityBtParser.g:1990:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getParallelNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallelNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:1998:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:1999:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:1999:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:2000:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getParallelNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:2017:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:2018:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getParallelNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:2022:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:2023:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:2023:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:2024:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getParallelNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParallelNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getParallelNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getParallelNodeAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getParallelNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:2055:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:2056:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:2056:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:2057:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getParallelNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParallelNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:2074:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Comma) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalQualityBtParser.g:2075:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getParallelNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:2079:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:2080:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:2080:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:2081:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getParallelNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParallelNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getParallelNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getParallelNodeAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleSequenceStarNode"
    // InternalQualityBtParser.g:2111:1: entryRuleSequenceStarNode returns [EObject current=null] : iv_ruleSequenceStarNode= ruleSequenceStarNode EOF ;
    public final EObject entryRuleSequenceStarNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceStarNode = null;


        try {
            // InternalQualityBtParser.g:2111:57: (iv_ruleSequenceStarNode= ruleSequenceStarNode EOF )
            // InternalQualityBtParser.g:2112:2: iv_ruleSequenceStarNode= ruleSequenceStarNode EOF
            {
             newCompositeNode(grammarAccess.getSequenceStarNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceStarNode=ruleSequenceStarNode();

            state._fsp--;

             current =iv_ruleSequenceStarNode; 
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
    // $ANTLR end "entryRuleSequenceStarNode"


    // $ANTLR start "ruleSequenceStarNode"
    // InternalQualityBtParser.g:2118:1: ruleSequenceStarNode returns [EObject current=null] : (otherlv_0= SequenceStarNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleSequenceStarNode() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:2124:2: ( (otherlv_0= SequenceStarNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:2125:2: (otherlv_0= SequenceStarNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:2125:2: (otherlv_0= SequenceStarNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:2126:3: otherlv_0= SequenceStarNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,SequenceStarNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceStarNodeAccess().getSequenceStarNodeKeyword_0());
            		
            // InternalQualityBtParser.g:2130:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:2131:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:2131:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:2132:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSequenceStarNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceStarNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceStarNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:2153:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQualityBtParser.g:2154:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSequenceStarNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:2158:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:2159:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:2159:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:2160:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSequenceStarNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceStarNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2178:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==NodeType) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQualityBtParser.g:2179:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getSequenceStarNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:2183:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:2184:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:2184:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:2185:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getSequenceStarNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceStarNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2203:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==NodeStatus) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQualityBtParser.g:2204:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getSequenceStarNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:2208:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:2209:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:2209:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:2210:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getSequenceStarNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceStarNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2228:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Parameters) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQualityBtParser.g:2229:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getSequenceStarNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSequenceStarNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:2237:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:2238:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:2238:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:2239:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSequenceStarNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceStarNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:2256:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==Comma) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:2257:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSequenceStarNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:2261:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:2262:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:2262:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:2263:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceStarNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceStarNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getSequenceStarNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getSequenceStarNodeAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getSequenceStarNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:2294:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:2295:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:2295:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:2296:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getSequenceStarNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceStarNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:2313:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Comma) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalQualityBtParser.g:2314:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getSequenceStarNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:2318:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:2319:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:2319:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:2320:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceStarNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceStarNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getSequenceStarNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getSequenceStarNodeAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleSequenceStarNode"


    // $ANTLR start "entryRuleSwitchNode"
    // InternalQualityBtParser.g:2350:1: entryRuleSwitchNode returns [EObject current=null] : iv_ruleSwitchNode= ruleSwitchNode EOF ;
    public final EObject entryRuleSwitchNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchNode = null;


        try {
            // InternalQualityBtParser.g:2350:51: (iv_ruleSwitchNode= ruleSwitchNode EOF )
            // InternalQualityBtParser.g:2351:2: iv_ruleSwitchNode= ruleSwitchNode EOF
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
    // InternalQualityBtParser.g:2357:1: ruleSwitchNode returns [EObject current=null] : (otherlv_0= SwitchNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleSwitchNode() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:2363:2: ( (otherlv_0= SwitchNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:2364:2: (otherlv_0= SwitchNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:2364:2: (otherlv_0= SwitchNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:2365:3: otherlv_0= SwitchNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,SwitchNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchNodeAccess().getSwitchNodeKeyword_0());
            		
            // InternalQualityBtParser.g:2369:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:2370:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:2370:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:2371:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSwitchNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getSwitchNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:2392:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQualityBtParser.g:2393:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSwitchNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:2397:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:2398:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:2398:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:2399:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2417:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==NodeType) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQualityBtParser.g:2418:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getSwitchNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:2422:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:2423:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:2423:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:2424:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2442:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==NodeStatus) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQualityBtParser.g:2443:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getSwitchNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:2447:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:2448:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:2448:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:2449:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2467:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Parameters) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalQualityBtParser.g:2468:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getSwitchNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSwitchNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:2476:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:2477:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:2477:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:2478:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:2495:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==Comma) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:2496:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSwitchNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:2500:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:2501:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:2501:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:2502:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSwitchNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getSwitchNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getSwitchNodeAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getSwitchNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:2533:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:2534:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:2534:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:2535:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getSwitchNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:2552:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==Comma) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalQualityBtParser.g:2553:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getSwitchNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:2557:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:2558:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:2558:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:2559:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getSwitchNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSwitchNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getSwitchNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getSwitchNodeAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleReactiveFallback"
    // InternalQualityBtParser.g:2589:1: entryRuleReactiveFallback returns [EObject current=null] : iv_ruleReactiveFallback= ruleReactiveFallback EOF ;
    public final EObject entryRuleReactiveFallback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactiveFallback = null;


        try {
            // InternalQualityBtParser.g:2589:57: (iv_ruleReactiveFallback= ruleReactiveFallback EOF )
            // InternalQualityBtParser.g:2590:2: iv_ruleReactiveFallback= ruleReactiveFallback EOF
            {
             newCompositeNode(grammarAccess.getReactiveFallbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactiveFallback=ruleReactiveFallback();

            state._fsp--;

             current =iv_ruleReactiveFallback; 
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
    // $ANTLR end "entryRuleReactiveFallback"


    // $ANTLR start "ruleReactiveFallback"
    // InternalQualityBtParser.g:2596:1: ruleReactiveFallback returns [EObject current=null] : (otherlv_0= ReactiveFallback ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleReactiveFallback() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:2602:2: ( (otherlv_0= ReactiveFallback ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:2603:2: (otherlv_0= ReactiveFallback ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:2603:2: (otherlv_0= ReactiveFallback ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:2604:3: otherlv_0= ReactiveFallback ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,ReactiveFallback,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactiveFallbackAccess().getReactiveFallbackKeyword_0());
            		
            // InternalQualityBtParser.g:2608:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:2609:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:2609:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:2610:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReactiveFallbackAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveFallbackRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getReactiveFallbackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:2631:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQualityBtParser.g:2632:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getReactiveFallbackAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:2636:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:2637:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:2637:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:2638:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReactiveFallbackAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveFallbackRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2656:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==NodeType) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQualityBtParser.g:2657:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getReactiveFallbackAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:2661:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:2662:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:2662:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:2663:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getReactiveFallbackAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveFallbackRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2681:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==NodeStatus) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalQualityBtParser.g:2682:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getReactiveFallbackAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:2686:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:2687:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:2687:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:2688:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getReactiveFallbackAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveFallbackRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2706:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Parameters) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQualityBtParser.g:2707:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getReactiveFallbackAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getReactiveFallbackAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:2715:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:2716:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:2716:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:2717:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getReactiveFallbackAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveFallbackRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:2734:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==Comma) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:2735:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getReactiveFallbackAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:2739:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:2740:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:2740:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:2741:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getReactiveFallbackAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReactiveFallbackRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getReactiveFallbackAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getReactiveFallbackAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getReactiveFallbackAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:2772:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:2773:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:2773:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:2774:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getReactiveFallbackAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveFallbackRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:2791:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==Comma) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalQualityBtParser.g:2792:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getReactiveFallbackAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:2796:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:2797:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:2797:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:2798:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getReactiveFallbackAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReactiveFallbackRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getReactiveFallbackAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getReactiveFallbackAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleReactiveFallback"


    // $ANTLR start "entryRuleWhileDoElseNode"
    // InternalQualityBtParser.g:2828:1: entryRuleWhileDoElseNode returns [EObject current=null] : iv_ruleWhileDoElseNode= ruleWhileDoElseNode EOF ;
    public final EObject entryRuleWhileDoElseNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileDoElseNode = null;


        try {
            // InternalQualityBtParser.g:2828:56: (iv_ruleWhileDoElseNode= ruleWhileDoElseNode EOF )
            // InternalQualityBtParser.g:2829:2: iv_ruleWhileDoElseNode= ruleWhileDoElseNode EOF
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
    // InternalQualityBtParser.g:2835:1: ruleWhileDoElseNode returns [EObject current=null] : (otherlv_0= WhileDoElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleWhileDoElseNode() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:2841:2: ( (otherlv_0= WhileDoElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:2842:2: (otherlv_0= WhileDoElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:2842:2: (otherlv_0= WhileDoElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:2843:3: otherlv_0= WhileDoElseNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,WhileDoElseNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileDoElseNodeAccess().getWhileDoElseNodeKeyword_0());
            		
            // InternalQualityBtParser.g:2847:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:2848:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:2848:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:2849:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileDoElseNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:2870:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalQualityBtParser.g:2871:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhileDoElseNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:2875:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:2876:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:2876:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:2877:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2895:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==NodeType) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalQualityBtParser.g:2896:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getWhileDoElseNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:2900:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:2901:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:2901:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:2902:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2920:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==NodeStatus) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalQualityBtParser.g:2921:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getWhileDoElseNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:2925:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:2926:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:2926:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:2927:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:2945:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Parameters) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalQualityBtParser.g:2946:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getWhileDoElseNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getWhileDoElseNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:2954:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:2955:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:2955:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:2956:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:2973:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==Comma) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:2974:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getWhileDoElseNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:2978:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:2979:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:2979:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:2980:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getWhileDoElseNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getWhileDoElseNodeAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getWhileDoElseNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:3011:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:3012:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:3012:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:3013:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:3030:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==Comma) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalQualityBtParser.g:3031:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getWhileDoElseNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:3035:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:3036:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:3036:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:3037:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getWhileDoElseNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhileDoElseNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getWhileDoElseNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getWhileDoElseNodeAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleReactiveSequence"
    // InternalQualityBtParser.g:3067:1: entryRuleReactiveSequence returns [EObject current=null] : iv_ruleReactiveSequence= ruleReactiveSequence EOF ;
    public final EObject entryRuleReactiveSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactiveSequence = null;


        try {
            // InternalQualityBtParser.g:3067:57: (iv_ruleReactiveSequence= ruleReactiveSequence EOF )
            // InternalQualityBtParser.g:3068:2: iv_ruleReactiveSequence= ruleReactiveSequence EOF
            {
             newCompositeNode(grammarAccess.getReactiveSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactiveSequence=ruleReactiveSequence();

            state._fsp--;

             current =iv_ruleReactiveSequence; 
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
    // $ANTLR end "entryRuleReactiveSequence"


    // $ANTLR start "ruleReactiveSequence"
    // InternalQualityBtParser.g:3074:1: ruleReactiveSequence returns [EObject current=null] : (otherlv_0= ReactiveSequence ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleReactiveSequence() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:3080:2: ( (otherlv_0= ReactiveSequence ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:3081:2: (otherlv_0= ReactiveSequence ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:3081:2: (otherlv_0= ReactiveSequence ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:3082:3: otherlv_0= ReactiveSequence ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,ReactiveSequence,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactiveSequenceAccess().getReactiveSequenceKeyword_0());
            		
            // InternalQualityBtParser.g:3086:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:3087:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:3087:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:3088:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReactiveSequenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveSequenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getReactiveSequenceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:3109:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==ID) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalQualityBtParser.g:3110:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getReactiveSequenceAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:3114:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:3115:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:3115:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:3116:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReactiveSequenceAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveSequenceRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3134:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==NodeType) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalQualityBtParser.g:3135:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getReactiveSequenceAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:3139:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:3140:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:3140:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:3141:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getReactiveSequenceAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveSequenceRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3159:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==NodeStatus) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalQualityBtParser.g:3160:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getReactiveSequenceAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:3164:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:3165:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:3165:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:3166:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getReactiveSequenceAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveSequenceRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3184:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Parameters) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalQualityBtParser.g:3185:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getReactiveSequenceAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getReactiveSequenceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:3193:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:3194:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:3194:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:3195:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getReactiveSequenceAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveSequenceRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:3212:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==Comma) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:3213:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getReactiveSequenceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:3217:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:3218:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:3218:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:3219:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getReactiveSequenceAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReactiveSequenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getReactiveSequenceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getReactiveSequenceAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getReactiveSequenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:3250:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:3251:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:3251:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:3252:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getReactiveSequenceAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveSequenceRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:3269:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==Comma) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalQualityBtParser.g:3270:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getReactiveSequenceAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:3274:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:3275:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:3275:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:3276:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getReactiveSequenceAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReactiveSequenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getReactiveSequenceAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getReactiveSequenceAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleReactiveSequence"


    // $ANTLR start "entryRuleSequenceNode"
    // InternalQualityBtParser.g:3306:1: entryRuleSequenceNode returns [EObject current=null] : iv_ruleSequenceNode= ruleSequenceNode EOF ;
    public final EObject entryRuleSequenceNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceNode = null;


        try {
            // InternalQualityBtParser.g:3306:53: (iv_ruleSequenceNode= ruleSequenceNode EOF )
            // InternalQualityBtParser.g:3307:2: iv_ruleSequenceNode= ruleSequenceNode EOF
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
    // InternalQualityBtParser.g:3313:1: ruleSequenceNode returns [EObject current=null] : (otherlv_0= SequenceNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) ;
    public final EObject ruleSequenceNode() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_17_0 = null;

        EObject lv_child_19_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:3319:2: ( (otherlv_0= SequenceNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket ) )
            // InternalQualityBtParser.g:3320:2: (otherlv_0= SequenceNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:3320:2: (otherlv_0= SequenceNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket )
            // InternalQualityBtParser.g:3321:3: otherlv_0= SequenceNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child otherlv_16= LeftCurlyBracket ( (lv_child_17_0= ruleTreeNode ) ) (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )* otherlv_20= RightCurlyBracket otherlv_21= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,SequenceNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceNodeAccess().getSequenceNodeKeyword_0());
            		
            // InternalQualityBtParser.g:3325:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:3326:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:3326:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:3327:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSequenceNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:3348:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalQualityBtParser.g:3349:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSequenceNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:3353:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:3354:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:3354:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:3355:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3373:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==NodeType) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalQualityBtParser.g:3374:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getSequenceNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:3378:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:3379:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:3379:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:3380:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3398:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==NodeStatus) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalQualityBtParser.g:3399:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getSequenceNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:3403:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:3404:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:3404:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:3405:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3423:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Parameters) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalQualityBtParser.g:3424:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getSequenceNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSequenceNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:3432:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:3433:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:3433:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:3434:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:3451:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==Comma) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:3452:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSequenceNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:3456:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:3457:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:3457:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:3458:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getSequenceNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getSequenceNodeAccess().getChildKeyword_7());
            		
            otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getSequenceNodeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalQualityBtParser.g:3489:3: ( (lv_child_17_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:3490:4: (lv_child_17_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:3490:4: (lv_child_17_0= ruleTreeNode )
            // InternalQualityBtParser.g:3491:5: lv_child_17_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getSequenceNodeAccess().getChildTreeNodeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_child_17_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
            					}
            					add(
            						current,
            						"child",
            						lv_child_17_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:3508:3: (otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==Comma) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalQualityBtParser.g:3509:4: otherlv_18= Comma ( (lv_child_19_0= ruleTreeNode ) )
            	    {
            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_18, grammarAccess.getSequenceNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalQualityBtParser.g:3513:4: ( (lv_child_19_0= ruleTreeNode ) )
            	    // InternalQualityBtParser.g:3514:5: (lv_child_19_0= ruleTreeNode )
            	    {
            	    // InternalQualityBtParser.g:3514:5: (lv_child_19_0= ruleTreeNode )
            	    // InternalQualityBtParser.g:3515:6: lv_child_19_0= ruleTreeNode
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceNodeAccess().getChildTreeNodeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_child_19_0=ruleTreeNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_19_0,
            	    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getSequenceNodeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getSequenceNodeAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalQualityBtParser.g:3545:1: entryRuleTimeoutNode returns [EObject current=null] : iv_ruleTimeoutNode= ruleTimeoutNode EOF ;
    public final EObject entryRuleTimeoutNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutNode = null;


        try {
            // InternalQualityBtParser.g:3545:52: (iv_ruleTimeoutNode= ruleTimeoutNode EOF )
            // InternalQualityBtParser.g:3546:2: iv_ruleTimeoutNode= ruleTimeoutNode EOF
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
    // InternalQualityBtParser.g:3552:1: ruleTimeoutNode returns [EObject current=null] : (otherlv_0= TimeoutNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Msec ( (lv_msec_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket ) ;
    public final EObject ruleTimeoutNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        AntlrDatatypeRuleToken lv_msec_10_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_child_18_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:3558:2: ( (otherlv_0= TimeoutNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Msec ( (lv_msec_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket ) )
            // InternalQualityBtParser.g:3559:2: (otherlv_0= TimeoutNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Msec ( (lv_msec_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:3559:2: (otherlv_0= TimeoutNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Msec ( (lv_msec_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket )
            // InternalQualityBtParser.g:3560:3: otherlv_0= TimeoutNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Msec ( (lv_msec_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,TimeoutNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutNodeAccess().getTimeoutNodeKeyword_0());
            		
            // InternalQualityBtParser.g:3564:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:3565:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:3565:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:3566:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTimeoutNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeoutNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:3587:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalQualityBtParser.g:3588:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeoutNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:3592:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:3593:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:3593:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:3594:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTimeoutNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3612:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==NodeType) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalQualityBtParser.g:3613:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimeoutNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:3617:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:3618:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:3618:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:3619:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getTimeoutNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3637:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==NodeStatus) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalQualityBtParser.g:3638:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTimeoutNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:3642:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:3643:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:3643:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:3644:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getTimeoutNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,Msec,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTimeoutNodeAccess().getMsecKeyword_6());
            		
            // InternalQualityBtParser.g:3666:3: ( (lv_msec_10_0= ruleEString ) )
            // InternalQualityBtParser.g:3667:4: (lv_msec_10_0= ruleEString )
            {
            // InternalQualityBtParser.g:3667:4: (lv_msec_10_0= ruleEString )
            // InternalQualityBtParser.g:3668:5: lv_msec_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTimeoutNodeAccess().getMsecEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
            lv_msec_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
            					}
            					set(
            						current,
            						"msec",
            						lv_msec_10_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:3685:3: (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Parameters) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalQualityBtParser.g:3686:4: otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket
                    {
                    otherlv_11=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getTimeoutNodeAccess().getParametersKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getTimeoutNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalQualityBtParser.g:3694:4: ( (lv_parameters_13_0= ruleParameter ) )
                    // InternalQualityBtParser.g:3695:5: (lv_parameters_13_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:3695:5: (lv_parameters_13_0= ruleParameter )
                    // InternalQualityBtParser.g:3696:6: lv_parameters_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTimeoutNodeAccess().getParametersParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_13_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_13_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:3713:4: (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==Comma) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:3714:5: otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTimeoutNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:3718:5: ( (lv_parameters_15_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:3719:6: (lv_parameters_15_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:3719:6: (lv_parameters_15_0= ruleParameter )
                    	    // InternalQualityBtParser.g:3720:7: lv_parameters_15_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimeoutNodeAccess().getParametersParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_15_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_15_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getTimeoutNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getTimeoutNodeAccess().getChildKeyword_9());
            		
            // InternalQualityBtParser.g:3747:3: ( (lv_child_18_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:3748:4: (lv_child_18_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:3748:4: (lv_child_18_0= ruleTreeNode )
            // InternalQualityBtParser.g:3749:5: lv_child_18_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getTimeoutNodeAccess().getChildTreeNodeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_18_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_18_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getTimeoutNodeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalQualityBtParser.g:3774:1: entryRuleKeepRunningUntilFailureNode returns [EObject current=null] : iv_ruleKeepRunningUntilFailureNode= ruleKeepRunningUntilFailureNode EOF ;
    public final EObject entryRuleKeepRunningUntilFailureNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeepRunningUntilFailureNode = null;


        try {
            // InternalQualityBtParser.g:3774:68: (iv_ruleKeepRunningUntilFailureNode= ruleKeepRunningUntilFailureNode EOF )
            // InternalQualityBtParser.g:3775:2: iv_ruleKeepRunningUntilFailureNode= ruleKeepRunningUntilFailureNode EOF
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
    // InternalQualityBtParser.g:3781:1: ruleKeepRunningUntilFailureNode returns [EObject current=null] : (otherlv_0= KeepRunningUntilFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) ;
    public final EObject ruleKeepRunningUntilFailureNode() throws RecognitionException {
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
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_16_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:3787:2: ( (otherlv_0= KeepRunningUntilFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) )
            // InternalQualityBtParser.g:3788:2: (otherlv_0= KeepRunningUntilFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:3788:2: (otherlv_0= KeepRunningUntilFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            // InternalQualityBtParser.g:3789:3: otherlv_0= KeepRunningUntilFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,KeepRunningUntilFailureNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKeepRunningUntilFailureNodeAccess().getKeepRunningUntilFailureNodeKeyword_0());
            		
            // InternalQualityBtParser.g:3793:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:3794:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:3794:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:3795:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getKeepRunningUntilFailureNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:3816:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==ID) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalQualityBtParser.g:3817:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getKeepRunningUntilFailureNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:3821:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:3822:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:3822:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:3823:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3841:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==NodeType) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalQualityBtParser.g:3842:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getKeepRunningUntilFailureNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:3846:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:3847:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:3847:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:3848:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3866:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NodeStatus) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalQualityBtParser.g:3867:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeepRunningUntilFailureNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:3871:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:3872:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:3872:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:3873:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:3891:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==Parameters) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalQualityBtParser.g:3892:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getKeepRunningUntilFailureNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getKeepRunningUntilFailureNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:3900:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:3901:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:3901:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:3902:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:3919:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==Comma) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:3920:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getKeepRunningUntilFailureNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:3924:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:3925:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:3925:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:3926:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getKeepRunningUntilFailureNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getKeepRunningUntilFailureNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtParser.g:3953:3: ( (lv_child_16_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:3954:4: (lv_child_16_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:3954:4: (lv_child_16_0= ruleTreeNode )
            // InternalQualityBtParser.g:3955:5: lv_child_16_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getKeepRunningUntilFailureNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_16_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeepRunningUntilFailureNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_16_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getKeepRunningUntilFailureNodeAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleTimerQueueNode"
    // InternalQualityBtParser.g:3980:1: entryRuleTimerQueueNode returns [EObject current=null] : iv_ruleTimerQueueNode= ruleTimerQueueNode EOF ;
    public final EObject entryRuleTimerQueueNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimerQueueNode = null;


        try {
            // InternalQualityBtParser.g:3980:55: (iv_ruleTimerQueueNode= ruleTimerQueueNode EOF )
            // InternalQualityBtParser.g:3981:2: iv_ruleTimerQueueNode= ruleTimerQueueNode EOF
            {
             newCompositeNode(grammarAccess.getTimerQueueNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimerQueueNode=ruleTimerQueueNode();

            state._fsp--;

             current =iv_ruleTimerQueueNode; 
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
    // $ANTLR end "entryRuleTimerQueueNode"


    // $ANTLR start "ruleTimerQueueNode"
    // InternalQualityBtParser.g:3987:1: ruleTimerQueueNode returns [EObject current=null] : (otherlv_0= TimerQueueNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) ;
    public final EObject ruleTimerQueueNode() throws RecognitionException {
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
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_16_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:3993:2: ( (otherlv_0= TimerQueueNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) )
            // InternalQualityBtParser.g:3994:2: (otherlv_0= TimerQueueNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:3994:2: (otherlv_0= TimerQueueNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            // InternalQualityBtParser.g:3995:3: otherlv_0= TimerQueueNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,TimerQueueNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTimerQueueNodeAccess().getTimerQueueNodeKeyword_0());
            		
            // InternalQualityBtParser.g:3999:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:4000:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:4000:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:4001:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTimerQueueNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimerQueueNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getTimerQueueNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:4022:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==ID) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalQualityBtParser.g:4023:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimerQueueNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:4027:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:4028:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:4028:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:4029:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTimerQueueNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimerQueueNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4047:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==NodeType) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalQualityBtParser.g:4048:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimerQueueNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:4052:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:4053:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:4053:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:4054:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getTimerQueueNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimerQueueNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4072:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==NodeStatus) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalQualityBtParser.g:4073:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTimerQueueNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:4077:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:4078:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:4078:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:4079:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getTimerQueueNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimerQueueNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4097:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==Parameters) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalQualityBtParser.g:4098:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getTimerQueueNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTimerQueueNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:4106:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:4107:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:4107:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:4108:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTimerQueueNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimerQueueNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:4125:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==Comma) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:4126:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTimerQueueNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:4130:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:4131:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:4131:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:4132:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimerQueueNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimerQueueNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getTimerQueueNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getTimerQueueNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtParser.g:4159:3: ( (lv_child_16_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:4160:4: (lv_child_16_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:4160:4: (lv_child_16_0= ruleTreeNode )
            // InternalQualityBtParser.g:4161:5: lv_child_16_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getTimerQueueNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_16_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimerQueueNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_16_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTimerQueueNodeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTimerQueueNode"


    // $ANTLR start "entryRuleInverterNode"
    // InternalQualityBtParser.g:4186:1: entryRuleInverterNode returns [EObject current=null] : iv_ruleInverterNode= ruleInverterNode EOF ;
    public final EObject entryRuleInverterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInverterNode = null;


        try {
            // InternalQualityBtParser.g:4186:53: (iv_ruleInverterNode= ruleInverterNode EOF )
            // InternalQualityBtParser.g:4187:2: iv_ruleInverterNode= ruleInverterNode EOF
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
    // InternalQualityBtParser.g:4193:1: ruleInverterNode returns [EObject current=null] : (otherlv_0= InverterNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) ;
    public final EObject ruleInverterNode() throws RecognitionException {
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
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_16_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:4199:2: ( (otherlv_0= InverterNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) )
            // InternalQualityBtParser.g:4200:2: (otherlv_0= InverterNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:4200:2: (otherlv_0= InverterNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            // InternalQualityBtParser.g:4201:3: otherlv_0= InverterNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,InverterNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInverterNodeAccess().getInverterNodeKeyword_0());
            		
            // InternalQualityBtParser.g:4205:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:4206:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:4206:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:4207:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInverterNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInverterNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getInverterNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:4228:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalQualityBtParser.g:4229:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getInverterNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:4233:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:4234:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:4234:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:4235:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInverterNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInverterNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4253:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==NodeType) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalQualityBtParser.g:4254:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getInverterNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:4258:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:4259:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:4259:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:4260:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getInverterNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInverterNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4278:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NodeStatus) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalQualityBtParser.g:4279:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getInverterNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:4283:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:4284:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:4284:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:4285:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getInverterNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInverterNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4303:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==Parameters) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalQualityBtParser.g:4304:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getInverterNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getInverterNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:4312:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:4313:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:4313:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:4314:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getInverterNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInverterNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:4331:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==Comma) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:4332:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getInverterNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:4336:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:4337:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:4337:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:4338:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getInverterNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInverterNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getInverterNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getInverterNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtParser.g:4365:3: ( (lv_child_16_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:4366:4: (lv_child_16_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:4366:4: (lv_child_16_0= ruleTreeNode )
            // InternalQualityBtParser.g:4367:5: lv_child_16_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getInverterNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_16_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInverterNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_16_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getInverterNodeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalQualityBtParser.g:4392:1: entryRuleForceSuccessNode returns [EObject current=null] : iv_ruleForceSuccessNode= ruleForceSuccessNode EOF ;
    public final EObject entryRuleForceSuccessNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForceSuccessNode = null;


        try {
            // InternalQualityBtParser.g:4392:57: (iv_ruleForceSuccessNode= ruleForceSuccessNode EOF )
            // InternalQualityBtParser.g:4393:2: iv_ruleForceSuccessNode= ruleForceSuccessNode EOF
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
    // InternalQualityBtParser.g:4399:1: ruleForceSuccessNode returns [EObject current=null] : (otherlv_0= ForceSuccessNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) ;
    public final EObject ruleForceSuccessNode() throws RecognitionException {
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
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_16_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:4405:2: ( (otherlv_0= ForceSuccessNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) )
            // InternalQualityBtParser.g:4406:2: (otherlv_0= ForceSuccessNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:4406:2: (otherlv_0= ForceSuccessNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            // InternalQualityBtParser.g:4407:3: otherlv_0= ForceSuccessNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,ForceSuccessNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getForceSuccessNodeAccess().getForceSuccessNodeKeyword_0());
            		
            // InternalQualityBtParser.g:4411:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:4412:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:4412:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:4413:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getForceSuccessNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:4434:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ID) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalQualityBtParser.g:4435:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getForceSuccessNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:4439:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:4440:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:4440:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:4441:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4459:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==NodeType) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalQualityBtParser.g:4460:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getForceSuccessNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:4464:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:4465:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:4465:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:4466:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4484:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==NodeStatus) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalQualityBtParser.g:4485:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getForceSuccessNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:4489:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:4490:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:4490:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:4491:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4509:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==Parameters) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalQualityBtParser.g:4510:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getForceSuccessNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getForceSuccessNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:4518:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:4519:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:4519:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:4520:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:4537:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==Comma) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:4538:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getForceSuccessNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:4542:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:4543:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:4543:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:4544:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getForceSuccessNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getForceSuccessNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtParser.g:4571:3: ( (lv_child_16_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:4572:4: (lv_child_16_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:4572:4: (lv_child_16_0= ruleTreeNode )
            // InternalQualityBtParser.g:4573:5: lv_child_16_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getForceSuccessNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_16_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceSuccessNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_16_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getForceSuccessNodeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalQualityBtParser.g:4598:1: entryRuleForceFailureNode returns [EObject current=null] : iv_ruleForceFailureNode= ruleForceFailureNode EOF ;
    public final EObject entryRuleForceFailureNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForceFailureNode = null;


        try {
            // InternalQualityBtParser.g:4598:57: (iv_ruleForceFailureNode= ruleForceFailureNode EOF )
            // InternalQualityBtParser.g:4599:2: iv_ruleForceFailureNode= ruleForceFailureNode EOF
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
    // InternalQualityBtParser.g:4605:1: ruleForceFailureNode returns [EObject current=null] : (otherlv_0= ForceFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) ;
    public final EObject ruleForceFailureNode() throws RecognitionException {
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
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_child_16_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:4611:2: ( (otherlv_0= ForceFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket ) )
            // InternalQualityBtParser.g:4612:2: (otherlv_0= ForceFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:4612:2: (otherlv_0= ForceFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket )
            // InternalQualityBtParser.g:4613:3: otherlv_0= ForceFailureNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )? otherlv_15= Child ( (lv_child_16_0= ruleTreeNode ) ) otherlv_17= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,ForceFailureNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getForceFailureNodeAccess().getForceFailureNodeKeyword_0());
            		
            // InternalQualityBtParser.g:4617:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:4618:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:4618:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:4619:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForceFailureNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getForceFailureNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:4640:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ID) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalQualityBtParser.g:4641:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getForceFailureNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:4645:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:4646:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:4646:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:4647:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getForceFailureNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4665:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==NodeType) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalQualityBtParser.g:4666:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getForceFailureNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:4670:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:4671:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:4671:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:4672:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getForceFailureNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4690:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==NodeStatus) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalQualityBtParser.g:4691:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getForceFailureNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:4695:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:4696:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:4696:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:4697:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getForceFailureNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4715:3: (otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==Parameters) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalQualityBtParser.g:4716:4: otherlv_9= Parameters otherlv_10= LeftCurlyBracket ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getForceFailureNodeAccess().getParametersKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getForceFailureNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQualityBtParser.g:4724:4: ( (lv_parameters_11_0= ruleParameter ) )
                    // InternalQualityBtParser.g:4725:5: (lv_parameters_11_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:4725:5: (lv_parameters_11_0= ruleParameter )
                    // InternalQualityBtParser.g:4726:6: lv_parameters_11_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getForceFailureNodeAccess().getParametersParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_11_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_11_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:4743:4: (otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==Comma) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:4744:5: otherlv_12= Comma ( (lv_parameters_13_0= ruleParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getForceFailureNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:4748:5: ( (lv_parameters_13_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:4749:6: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:4749:6: (lv_parameters_13_0= ruleParameter )
                    	    // InternalQualityBtParser.g:4750:7: lv_parameters_13_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getForceFailureNodeAccess().getParametersParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_13_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getForceFailureNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getForceFailureNodeAccess().getChildKeyword_7());
            		
            // InternalQualityBtParser.g:4777:3: ( (lv_child_16_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:4778:4: (lv_child_16_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:4778:4: (lv_child_16_0= ruleTreeNode )
            // InternalQualityBtParser.g:4779:5: lv_child_16_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getForceFailureNodeAccess().getChildTreeNodeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_16_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceFailureNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_16_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getForceFailureNodeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalQualityBtParser.g:4804:1: entryRuleRepeatNode returns [EObject current=null] : iv_ruleRepeatNode= ruleRepeatNode EOF ;
    public final EObject entryRuleRepeatNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatNode = null;


        try {
            // InternalQualityBtParser.g:4804:51: (iv_ruleRepeatNode= ruleRepeatNode EOF )
            // InternalQualityBtParser.g:4805:2: iv_ruleRepeatNode= ruleRepeatNode EOF
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
    // InternalQualityBtParser.g:4811:1: ruleRepeatNode returns [EObject current=null] : (otherlv_0= RepeatNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_cycles ( (lv_num_cycles_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket ) ;
    public final EObject ruleRepeatNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        AntlrDatatypeRuleToken lv_num_cycles_10_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_child_18_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:4817:2: ( (otherlv_0= RepeatNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_cycles ( (lv_num_cycles_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket ) )
            // InternalQualityBtParser.g:4818:2: (otherlv_0= RepeatNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_cycles ( (lv_num_cycles_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:4818:2: (otherlv_0= RepeatNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_cycles ( (lv_num_cycles_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket )
            // InternalQualityBtParser.g:4819:3: otherlv_0= RepeatNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_cycles ( (lv_num_cycles_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,RepeatNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatNodeAccess().getRepeatNodeKeyword_0());
            		
            // InternalQualityBtParser.g:4823:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:4824:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:4824:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:4825:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepeatNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:4846:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==ID) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalQualityBtParser.g:4847:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepeatNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:4851:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:4852:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:4852:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:4853:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRepeatNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4871:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==NodeType) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalQualityBtParser.g:4872:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getRepeatNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:4876:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:4877:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:4877:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:4878:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getRepeatNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:4896:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==NodeStatus) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalQualityBtParser.g:4897:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getRepeatNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:4901:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:4902:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:4902:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:4903:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getRepeatNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,Num_cycles,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRepeatNodeAccess().getNum_cyclesKeyword_6());
            		
            // InternalQualityBtParser.g:4925:3: ( (lv_num_cycles_10_0= ruleEString ) )
            // InternalQualityBtParser.g:4926:4: (lv_num_cycles_10_0= ruleEString )
            {
            // InternalQualityBtParser.g:4926:4: (lv_num_cycles_10_0= ruleEString )
            // InternalQualityBtParser.g:4927:5: lv_num_cycles_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepeatNodeAccess().getNum_cyclesEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
            lv_num_cycles_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
            					}
            					set(
            						current,
            						"num_cycles",
            						lv_num_cycles_10_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:4944:3: (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==Parameters) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalQualityBtParser.g:4945:4: otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket
                    {
                    otherlv_11=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getRepeatNodeAccess().getParametersKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRepeatNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalQualityBtParser.g:4953:4: ( (lv_parameters_13_0= ruleParameter ) )
                    // InternalQualityBtParser.g:4954:5: (lv_parameters_13_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:4954:5: (lv_parameters_13_0= ruleParameter )
                    // InternalQualityBtParser.g:4955:6: lv_parameters_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getRepeatNodeAccess().getParametersParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_13_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_13_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:4972:4: (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==Comma) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:4973:5: otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRepeatNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:4977:5: ( (lv_parameters_15_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:4978:6: (lv_parameters_15_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:4978:6: (lv_parameters_15_0= ruleParameter )
                    	    // InternalQualityBtParser.g:4979:7: lv_parameters_15_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepeatNodeAccess().getParametersParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_15_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_15_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getRepeatNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getRepeatNodeAccess().getChildKeyword_9());
            		
            // InternalQualityBtParser.g:5006:3: ( (lv_child_18_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:5007:4: (lv_child_18_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:5007:4: (lv_child_18_0= ruleTreeNode )
            // InternalQualityBtParser.g:5008:5: lv_child_18_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getRepeatNodeAccess().getChildTreeNodeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_18_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_18_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getRepeatNodeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalQualityBtParser.g:5033:1: entryRuleSubTree returns [EObject current=null] : iv_ruleSubTree= ruleSubTree EOF ;
    public final EObject entryRuleSubTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTree = null;


        try {
            // InternalQualityBtParser.g:5033:48: (iv_ruleSubTree= ruleSubTree EOF )
            // InternalQualityBtParser.g:5034:2: iv_ruleSubTree= ruleSubTree EOF
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
    // InternalQualityBtParser.g:5040:1: ruleSubTree returns [EObject current=null] : ( () otherlv_1= SubTree ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? (otherlv_16= Child otherlv_17= LeftCurlyBracket ( (lv_child_18_0= ruleTreeNode ) ) (otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) ) )* otherlv_21= RightCurlyBracket )? otherlv_22= RightCurlyBracket ) ;
    public final EObject ruleSubTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_uID_5_0 = null;

        Enumerator lv_NodeType_7_0 = null;

        Enumerator lv_NodeStatus_9_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_child_18_0 = null;

        EObject lv_child_20_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:5046:2: ( ( () otherlv_1= SubTree ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? (otherlv_16= Child otherlv_17= LeftCurlyBracket ( (lv_child_18_0= ruleTreeNode ) ) (otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) ) )* otherlv_21= RightCurlyBracket )? otherlv_22= RightCurlyBracket ) )
            // InternalQualityBtParser.g:5047:2: ( () otherlv_1= SubTree ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? (otherlv_16= Child otherlv_17= LeftCurlyBracket ( (lv_child_18_0= ruleTreeNode ) ) (otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) ) )* otherlv_21= RightCurlyBracket )? otherlv_22= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:5047:2: ( () otherlv_1= SubTree ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? (otherlv_16= Child otherlv_17= LeftCurlyBracket ( (lv_child_18_0= ruleTreeNode ) ) (otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) ) )* otherlv_21= RightCurlyBracket )? otherlv_22= RightCurlyBracket )
            // InternalQualityBtParser.g:5048:3: () otherlv_1= SubTree ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? (otherlv_16= Child otherlv_17= LeftCurlyBracket ( (lv_child_18_0= ruleTreeNode ) ) (otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) ) )* otherlv_21= RightCurlyBracket )? otherlv_22= RightCurlyBracket
            {
            // InternalQualityBtParser.g:5048:3: ()
            // InternalQualityBtParser.g:5049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubTreeAccess().getSubTreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SubTree,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubTreeAccess().getSubTreeKeyword_1());
            		
            // InternalQualityBtParser.g:5059:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtParser.g:5060:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtParser.g:5060:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtParser.g:5061:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubTreeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubTreeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getSubTreeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtParser.g:5082:3: (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ID) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalQualityBtParser.g:5083:4: otherlv_4= ID ( (lv_uID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubTreeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:5087:4: ( (lv_uID_5_0= ruleEString ) )
                    // InternalQualityBtParser.g:5088:5: (lv_uID_5_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:5088:5: (lv_uID_5_0= ruleEString )
                    // InternalQualityBtParser.g:5089:6: lv_uID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getUIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_uID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_5_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5107:3: (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==NodeType) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalQualityBtParser.g:5108:4: otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) )
                    {
                    otherlv_6=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubTreeAccess().getNodeTypeKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:5112:4: ( (lv_NodeType_7_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:5113:5: (lv_NodeType_7_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:5113:5: (lv_NodeType_7_0= ruleNodeType )
                    // InternalQualityBtParser.g:5114:6: lv_NodeType_7_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getNodeTypeNodeTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_NodeType_7_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_7_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5132:3: (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==NodeStatus) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalQualityBtParser.g:5133:4: otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) )
                    {
                    otherlv_8=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getSubTreeAccess().getNodeStatusKeyword_6_0());
                    			
                    // InternalQualityBtParser.g:5137:4: ( (lv_NodeStatus_9_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:5138:5: (lv_NodeStatus_9_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:5138:5: (lv_NodeStatus_9_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:5139:6: lv_NodeStatus_9_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getNodeStatusNodeStatusEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_NodeStatus_9_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_9_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5157:3: (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==Parameters) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalQualityBtParser.g:5158:4: otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket
                    {
                    otherlv_10=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getSubTreeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getSubTreeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtParser.g:5166:4: ( (lv_parameters_12_0= ruleParameter ) )
                    // InternalQualityBtParser.g:5167:5: (lv_parameters_12_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:5167:5: (lv_parameters_12_0= ruleParameter )
                    // InternalQualityBtParser.g:5168:6: lv_parameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_12_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:5185:4: (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==Comma) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:5186:5: otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSubTreeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:5190:5: ( (lv_parameters_14_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:5191:6: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:5191:6: (lv_parameters_14_0= ruleParameter )
                    	    // InternalQualityBtParser.g:5192:7: lv_parameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubTreeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_14_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,RightCurlyBracket,FOLLOW_42); 

                    				newLeafNode(otherlv_15, grammarAccess.getSubTreeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalQualityBtParser.g:5215:3: (otherlv_16= Child otherlv_17= LeftCurlyBracket ( (lv_child_18_0= ruleTreeNode ) ) (otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) ) )* otherlv_21= RightCurlyBracket )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==Child) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalQualityBtParser.g:5216:4: otherlv_16= Child otherlv_17= LeftCurlyBracket ( (lv_child_18_0= ruleTreeNode ) ) (otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) ) )* otherlv_21= RightCurlyBracket
                    {
                    otherlv_16=(Token)match(input,Child,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getSubTreeAccess().getChildKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getSubTreeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalQualityBtParser.g:5224:4: ( (lv_child_18_0= ruleTreeNode ) )
                    // InternalQualityBtParser.g:5225:5: (lv_child_18_0= ruleTreeNode )
                    {
                    // InternalQualityBtParser.g:5225:5: (lv_child_18_0= ruleTreeNode )
                    // InternalQualityBtParser.g:5226:6: lv_child_18_0= ruleTreeNode
                    {

                    						newCompositeNode(grammarAccess.getSubTreeAccess().getChildTreeNodeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_child_18_0=ruleTreeNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_18_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:5243:4: (otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==Comma) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:5244:5: otherlv_19= Comma ( (lv_child_20_0= ruleTreeNode ) )
                    	    {
                    	    otherlv_19=(Token)match(input,Comma,FOLLOW_9); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSubTreeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:5248:5: ( (lv_child_20_0= ruleTreeNode ) )
                    	    // InternalQualityBtParser.g:5249:6: (lv_child_20_0= ruleTreeNode )
                    	    {
                    	    // InternalQualityBtParser.g:5249:6: (lv_child_20_0= ruleTreeNode )
                    	    // InternalQualityBtParser.g:5250:7: lv_child_20_0= ruleTreeNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubTreeAccess().getChildTreeNodeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_child_20_0=ruleTreeNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubTreeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"child",
                    	    								lv_child_20_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

                    				newLeafNode(otherlv_21, grammarAccess.getSubTreeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getSubTreeAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleSimpleActionNode"
    // InternalQualityBtParser.g:5281:1: entryRuleSimpleActionNode returns [EObject current=null] : iv_ruleSimpleActionNode= ruleSimpleActionNode EOF ;
    public final EObject entryRuleSimpleActionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleActionNode = null;


        try {
            // InternalQualityBtParser.g:5281:57: (iv_ruleSimpleActionNode= ruleSimpleActionNode EOF )
            // InternalQualityBtParser.g:5282:2: iv_ruleSimpleActionNode= ruleSimpleActionNode EOF
            {
             newCompositeNode(grammarAccess.getSimpleActionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleActionNode=ruleSimpleActionNode();

            state._fsp--;

             current =iv_ruleSimpleActionNode; 
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
    // $ANTLR end "entryRuleSimpleActionNode"


    // $ANTLR start "ruleSimpleActionNode"
    // InternalQualityBtParser.g:5288:1: ruleSimpleActionNode returns [EObject current=null] : ( () otherlv_1= SimpleActionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket ) ;
    public final EObject ruleSimpleActionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_uID_5_0 = null;

        Enumerator lv_NodeType_7_0 = null;

        Enumerator lv_NodeStatus_9_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:5294:2: ( ( () otherlv_1= SimpleActionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket ) )
            // InternalQualityBtParser.g:5295:2: ( () otherlv_1= SimpleActionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:5295:2: ( () otherlv_1= SimpleActionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket )
            // InternalQualityBtParser.g:5296:3: () otherlv_1= SimpleActionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket
            {
            // InternalQualityBtParser.g:5296:3: ()
            // InternalQualityBtParser.g:5297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleActionNodeAccess().getSimpleActionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SimpleActionNode,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleActionNodeAccess().getSimpleActionNodeKeyword_1());
            		
            // InternalQualityBtParser.g:5307:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtParser.g:5308:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtParser.g:5308:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtParser.g:5309:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleActionNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleActionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleActionNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtParser.g:5330:3: (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==ID) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalQualityBtParser.g:5331:4: otherlv_4= ID ( (lv_uID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleActionNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:5335:4: ( (lv_uID_5_0= ruleEString ) )
                    // InternalQualityBtParser.g:5336:5: (lv_uID_5_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:5336:5: (lv_uID_5_0= ruleEString )
                    // InternalQualityBtParser.g:5337:6: lv_uID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSimpleActionNodeAccess().getUIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_uID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleActionNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_5_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5355:3: (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==NodeType) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalQualityBtParser.g:5356:4: otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) )
                    {
                    otherlv_6=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getSimpleActionNodeAccess().getNodeTypeKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:5360:4: ( (lv_NodeType_7_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:5361:5: (lv_NodeType_7_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:5361:5: (lv_NodeType_7_0= ruleNodeType )
                    // InternalQualityBtParser.g:5362:6: lv_NodeType_7_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getSimpleActionNodeAccess().getNodeTypeNodeTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_NodeType_7_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleActionNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_7_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5380:3: (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==NodeStatus) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalQualityBtParser.g:5381:4: otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) )
                    {
                    otherlv_8=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getSimpleActionNodeAccess().getNodeStatusKeyword_6_0());
                    			
                    // InternalQualityBtParser.g:5385:4: ( (lv_NodeStatus_9_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:5386:5: (lv_NodeStatus_9_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:5386:5: (lv_NodeStatus_9_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:5387:6: lv_NodeStatus_9_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getSimpleActionNodeAccess().getNodeStatusNodeStatusEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_NodeStatus_9_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleActionNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_9_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5405:3: (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==Parameters) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalQualityBtParser.g:5406:4: otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket
                    {
                    otherlv_10=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getSimpleActionNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getSimpleActionNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtParser.g:5414:4: ( (lv_parameters_12_0= ruleParameter ) )
                    // InternalQualityBtParser.g:5415:5: (lv_parameters_12_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:5415:5: (lv_parameters_12_0= ruleParameter )
                    // InternalQualityBtParser.g:5416:6: lv_parameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSimpleActionNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleActionNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_12_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:5433:4: (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==Comma) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:5434:5: otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSimpleActionNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:5438:5: ( (lv_parameters_14_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:5439:6: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:5439:6: (lv_parameters_14_0= ruleParameter )
                    	    // InternalQualityBtParser.g:5440:7: lv_parameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSimpleActionNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSimpleActionNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_14_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getSimpleActionNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSimpleActionNodeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSimpleActionNode"


    // $ANTLR start "entryRuleSimpleConditionNode"
    // InternalQualityBtParser.g:5471:1: entryRuleSimpleConditionNode returns [EObject current=null] : iv_ruleSimpleConditionNode= ruleSimpleConditionNode EOF ;
    public final EObject entryRuleSimpleConditionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleConditionNode = null;


        try {
            // InternalQualityBtParser.g:5471:60: (iv_ruleSimpleConditionNode= ruleSimpleConditionNode EOF )
            // InternalQualityBtParser.g:5472:2: iv_ruleSimpleConditionNode= ruleSimpleConditionNode EOF
            {
             newCompositeNode(grammarAccess.getSimpleConditionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleConditionNode=ruleSimpleConditionNode();

            state._fsp--;

             current =iv_ruleSimpleConditionNode; 
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
    // $ANTLR end "entryRuleSimpleConditionNode"


    // $ANTLR start "ruleSimpleConditionNode"
    // InternalQualityBtParser.g:5478:1: ruleSimpleConditionNode returns [EObject current=null] : ( () otherlv_1= SimpleConditionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket ) ;
    public final EObject ruleSimpleConditionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_uID_5_0 = null;

        Enumerator lv_NodeType_7_0 = null;

        Enumerator lv_NodeStatus_9_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:5484:2: ( ( () otherlv_1= SimpleConditionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket ) )
            // InternalQualityBtParser.g:5485:2: ( () otherlv_1= SimpleConditionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:5485:2: ( () otherlv_1= SimpleConditionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket )
            // InternalQualityBtParser.g:5486:3: () otherlv_1= SimpleConditionNode ( (lv_name_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )? (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )? (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )? (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )? otherlv_16= RightCurlyBracket
            {
            // InternalQualityBtParser.g:5486:3: ()
            // InternalQualityBtParser.g:5487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleConditionNodeAccess().getSimpleConditionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SimpleConditionNode,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleConditionNodeAccess().getSimpleConditionNodeKeyword_1());
            		
            // InternalQualityBtParser.g:5497:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQualityBtParser.g:5498:4: (lv_name_2_0= ruleEString )
            {
            // InternalQualityBtParser.g:5498:4: (lv_name_2_0= ruleEString )
            // InternalQualityBtParser.g:5499:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleConditionNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleConditionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleConditionNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQualityBtParser.g:5520:3: (otherlv_4= ID ( (lv_uID_5_0= ruleEString ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ID) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalQualityBtParser.g:5521:4: otherlv_4= ID ( (lv_uID_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleConditionNodeAccess().getIDKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:5525:4: ( (lv_uID_5_0= ruleEString ) )
                    // InternalQualityBtParser.g:5526:5: (lv_uID_5_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:5526:5: (lv_uID_5_0= ruleEString )
                    // InternalQualityBtParser.g:5527:6: lv_uID_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSimpleConditionNodeAccess().getUIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_uID_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleConditionNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_5_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5545:3: (otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==NodeType) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalQualityBtParser.g:5546:4: otherlv_6= NodeType ( (lv_NodeType_7_0= ruleNodeType ) )
                    {
                    otherlv_6=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getSimpleConditionNodeAccess().getNodeTypeKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:5550:4: ( (lv_NodeType_7_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:5551:5: (lv_NodeType_7_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:5551:5: (lv_NodeType_7_0= ruleNodeType )
                    // InternalQualityBtParser.g:5552:6: lv_NodeType_7_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getSimpleConditionNodeAccess().getNodeTypeNodeTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_NodeType_7_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleConditionNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_7_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5570:3: (otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==NodeStatus) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalQualityBtParser.g:5571:4: otherlv_8= NodeStatus ( (lv_NodeStatus_9_0= ruleNodeStatus ) )
                    {
                    otherlv_8=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getSimpleConditionNodeAccess().getNodeStatusKeyword_6_0());
                    			
                    // InternalQualityBtParser.g:5575:4: ( (lv_NodeStatus_9_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:5576:5: (lv_NodeStatus_9_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:5576:5: (lv_NodeStatus_9_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:5577:6: lv_NodeStatus_9_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getSimpleConditionNodeAccess().getNodeStatusNodeStatusEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_NodeStatus_9_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleConditionNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_9_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5595:3: (otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==Parameters) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalQualityBtParser.g:5596:4: otherlv_10= Parameters otherlv_11= LeftCurlyBracket ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= RightCurlyBracket
                    {
                    otherlv_10=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getSimpleConditionNodeAccess().getParametersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getSimpleConditionNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalQualityBtParser.g:5604:4: ( (lv_parameters_12_0= ruleParameter ) )
                    // InternalQualityBtParser.g:5605:5: (lv_parameters_12_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:5605:5: (lv_parameters_12_0= ruleParameter )
                    // InternalQualityBtParser.g:5606:6: lv_parameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSimpleConditionNodeAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleConditionNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_12_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:5623:4: (otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) ) )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==Comma) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:5624:5: otherlv_13= Comma ( (lv_parameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSimpleConditionNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:5628:5: ( (lv_parameters_14_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:5629:6: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:5629:6: (lv_parameters_14_0= ruleParameter )
                    	    // InternalQualityBtParser.g:5630:7: lv_parameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSimpleConditionNodeAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSimpleConditionNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_14_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop129;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,RightCurlyBracket,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getSimpleConditionNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSimpleConditionNodeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSimpleConditionNode"


    // $ANTLR start "entryRuleRetryNode"
    // InternalQualityBtParser.g:5661:1: entryRuleRetryNode returns [EObject current=null] : iv_ruleRetryNode= ruleRetryNode EOF ;
    public final EObject entryRuleRetryNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetryNode = null;


        try {
            // InternalQualityBtParser.g:5661:50: (iv_ruleRetryNode= ruleRetryNode EOF )
            // InternalQualityBtParser.g:5662:2: iv_ruleRetryNode= ruleRetryNode EOF
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
    // InternalQualityBtParser.g:5668:1: ruleRetryNode returns [EObject current=null] : (otherlv_0= RetryNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_attempts ( (lv_num_attempts_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket ) ;
    public final EObject ruleRetryNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        AntlrDatatypeRuleToken lv_num_attempts_10_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_child_18_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:5674:2: ( (otherlv_0= RetryNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_attempts ( (lv_num_attempts_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket ) )
            // InternalQualityBtParser.g:5675:2: (otherlv_0= RetryNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_attempts ( (lv_num_attempts_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:5675:2: (otherlv_0= RetryNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_attempts ( (lv_num_attempts_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket )
            // InternalQualityBtParser.g:5676:3: otherlv_0= RetryNode ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Num_attempts ( (lv_num_attempts_10_0= ruleEString ) ) (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )? otherlv_17= Child ( (lv_child_18_0= ruleTreeNode ) ) otherlv_19= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,RetryNode,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRetryNodeAccess().getRetryNodeKeyword_0());
            		
            // InternalQualityBtParser.g:5680:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:5681:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:5681:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:5682:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRetryNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetryNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getRetryNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:5703:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==ID) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalQualityBtParser.g:5704:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRetryNodeAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:5708:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:5709:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:5709:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:5710:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRetryNodeAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRetryNodeRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5728:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==NodeType) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalQualityBtParser.g:5729:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getRetryNodeAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:5733:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:5734:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:5734:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:5735:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getRetryNodeAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRetryNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5753:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==NodeStatus) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalQualityBtParser.g:5754:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getRetryNodeAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:5758:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:5759:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:5759:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:5760:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getRetryNodeAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRetryNodeRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,Num_attempts,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRetryNodeAccess().getNum_attemptsKeyword_6());
            		
            // InternalQualityBtParser.g:5782:3: ( (lv_num_attempts_10_0= ruleEString ) )
            // InternalQualityBtParser.g:5783:4: (lv_num_attempts_10_0= ruleEString )
            {
            // InternalQualityBtParser.g:5783:4: (lv_num_attempts_10_0= ruleEString )
            // InternalQualityBtParser.g:5784:5: lv_num_attempts_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRetryNodeAccess().getNum_attemptsEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
            lv_num_attempts_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetryNodeRule());
            					}
            					set(
            						current,
            						"num_attempts",
            						lv_num_attempts_10_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:5801:3: (otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==Parameters) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalQualityBtParser.g:5802:4: otherlv_11= Parameters otherlv_12= LeftCurlyBracket ( (lv_parameters_13_0= ruleParameter ) ) (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )* otherlv_16= RightCurlyBracket
                    {
                    otherlv_11=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getRetryNodeAccess().getParametersKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRetryNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalQualityBtParser.g:5810:4: ( (lv_parameters_13_0= ruleParameter ) )
                    // InternalQualityBtParser.g:5811:5: (lv_parameters_13_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:5811:5: (lv_parameters_13_0= ruleParameter )
                    // InternalQualityBtParser.g:5812:6: lv_parameters_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getRetryNodeAccess().getParametersParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_13_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRetryNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_13_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:5829:4: (otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==Comma) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:5830:5: otherlv_14= Comma ( (lv_parameters_15_0= ruleParameter ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRetryNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:5834:5: ( (lv_parameters_15_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:5835:6: (lv_parameters_15_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:5835:6: (lv_parameters_15_0= ruleParameter )
                    	    // InternalQualityBtParser.g:5836:7: lv_parameters_15_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRetryNodeAccess().getParametersParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_15_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRetryNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_15_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getRetryNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getRetryNodeAccess().getChildKeyword_9());
            		
            // InternalQualityBtParser.g:5863:3: ( (lv_child_18_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:5864:4: (lv_child_18_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:5864:4: (lv_child_18_0= ruleTreeNode )
            // InternalQualityBtParser.g:5865:5: lv_child_18_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getRetryNodeAccess().getChildTreeNodeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_18_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetryNodeRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_18_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getRetryNodeAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleBlackboardCheckInt"
    // InternalQualityBtParser.g:5890:1: entryRuleBlackboardCheckInt returns [EObject current=null] : iv_ruleBlackboardCheckInt= ruleBlackboardCheckInt EOF ;
    public final EObject entryRuleBlackboardCheckInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlackboardCheckInt = null;


        try {
            // InternalQualityBtParser.g:5890:59: (iv_ruleBlackboardCheckInt= ruleBlackboardCheckInt EOF )
            // InternalQualityBtParser.g:5891:2: iv_ruleBlackboardCheckInt= ruleBlackboardCheckInt EOF
            {
             newCompositeNode(grammarAccess.getBlackboardCheckIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlackboardCheckInt=ruleBlackboardCheckInt();

            state._fsp--;

             current =iv_ruleBlackboardCheckInt; 
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
    // $ANTLR end "entryRuleBlackboardCheckInt"


    // $ANTLR start "ruleBlackboardCheckInt"
    // InternalQualityBtParser.g:5897:1: ruleBlackboardCheckInt returns [EObject current=null] : (otherlv_0= BlackboardCheckInt ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket ) ;
    public final EObject ruleBlackboardCheckInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        Enumerator lv_return_on_mismatch_10_0 = null;

        AntlrDatatypeRuleToken lv_value_A_12_0 = null;

        AntlrDatatypeRuleToken lv_value_B_14_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_child_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:5903:2: ( (otherlv_0= BlackboardCheckInt ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket ) )
            // InternalQualityBtParser.g:5904:2: (otherlv_0= BlackboardCheckInt ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:5904:2: (otherlv_0= BlackboardCheckInt ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket )
            // InternalQualityBtParser.g:5905:3: otherlv_0= BlackboardCheckInt ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,BlackboardCheckInt,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlackboardCheckIntAccess().getBlackboardCheckIntKeyword_0());
            		
            // InternalQualityBtParser.g:5909:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:5910:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:5910:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:5911:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getBlackboardCheckIntAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:5932:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==ID) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalQualityBtParser.g:5933:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBlackboardCheckIntAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:5937:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:5938:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:5938:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:5939:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5957:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==NodeType) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalQualityBtParser.g:5958:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getBlackboardCheckIntAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:5962:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:5963:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:5963:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:5964:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:5982:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==NodeStatus) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalQualityBtParser.g:5983:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getBlackboardCheckIntAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:5987:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:5988:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:5988:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:5989:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,Return_on_mismatch,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getBlackboardCheckIntAccess().getReturn_on_mismatchKeyword_6());
            		
            // InternalQualityBtParser.g:6011:3: ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) )
            // InternalQualityBtParser.g:6012:4: (lv_return_on_mismatch_10_0= ruleNodeStatus )
            {
            // InternalQualityBtParser.g:6012:4: (lv_return_on_mismatch_10_0= ruleNodeStatus )
            // InternalQualityBtParser.g:6013:5: lv_return_on_mismatch_10_0= ruleNodeStatus
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getReturn_on_mismatchNodeStatusEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_51);
            lv_return_on_mismatch_10_0=ruleNodeStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
            					}
            					set(
            						current,
            						"return_on_mismatch",
            						lv_return_on_mismatch_10_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,Value_A,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getBlackboardCheckIntAccess().getValue_AKeyword_8());
            		
            // InternalQualityBtParser.g:6034:3: ( (lv_value_A_12_0= ruleEString ) )
            // InternalQualityBtParser.g:6035:4: (lv_value_A_12_0= ruleEString )
            {
            // InternalQualityBtParser.g:6035:4: (lv_value_A_12_0= ruleEString )
            // InternalQualityBtParser.g:6036:5: lv_value_A_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getValue_AEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_52);
            lv_value_A_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
            					}
            					set(
            						current,
            						"value_A",
            						lv_value_A_12_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,Value_B,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getBlackboardCheckIntAccess().getValue_BKeyword_10());
            		
            // InternalQualityBtParser.g:6057:3: ( (lv_value_B_14_0= ruleEString ) )
            // InternalQualityBtParser.g:6058:4: (lv_value_B_14_0= ruleEString )
            {
            // InternalQualityBtParser.g:6058:4: (lv_value_B_14_0= ruleEString )
            // InternalQualityBtParser.g:6059:5: lv_value_B_14_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getValue_BEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_28);
            lv_value_B_14_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
            					}
            					set(
            						current,
            						"value_B",
            						lv_value_B_14_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:6076:3: (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==Parameters) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalQualityBtParser.g:6077:4: otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket
                    {
                    otherlv_15=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getBlackboardCheckIntAccess().getParametersKeyword_12_0());
                    			
                    otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getBlackboardCheckIntAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalQualityBtParser.g:6085:4: ( (lv_parameters_17_0= ruleParameter ) )
                    // InternalQualityBtParser.g:6086:5: (lv_parameters_17_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:6086:5: (lv_parameters_17_0= ruleParameter )
                    // InternalQualityBtParser.g:6087:6: lv_parameters_17_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getParametersParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_17_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_17_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:6104:4: (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==Comma) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:6105:5: otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBlackboardCheckIntAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:6109:5: ( (lv_parameters_19_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:6110:6: (lv_parameters_19_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:6110:6: (lv_parameters_19_0= ruleParameter )
                    	    // InternalQualityBtParser.g:6111:7: lv_parameters_19_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getParametersParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_19_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_19_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_20, grammarAccess.getBlackboardCheckIntAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_21, grammarAccess.getBlackboardCheckIntAccess().getChildKeyword_13());
            		
            // InternalQualityBtParser.g:6138:3: ( (lv_child_22_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:6139:4: (lv_child_22_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:6139:4: (lv_child_22_0= ruleTreeNode )
            // InternalQualityBtParser.g:6140:5: lv_child_22_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckIntAccess().getChildTreeNodeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_22_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckIntRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_22_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getBlackboardCheckIntAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleBlackboardCheckInt"


    // $ANTLR start "entryRuleBlackboardCheckDouble"
    // InternalQualityBtParser.g:6165:1: entryRuleBlackboardCheckDouble returns [EObject current=null] : iv_ruleBlackboardCheckDouble= ruleBlackboardCheckDouble EOF ;
    public final EObject entryRuleBlackboardCheckDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlackboardCheckDouble = null;


        try {
            // InternalQualityBtParser.g:6165:62: (iv_ruleBlackboardCheckDouble= ruleBlackboardCheckDouble EOF )
            // InternalQualityBtParser.g:6166:2: iv_ruleBlackboardCheckDouble= ruleBlackboardCheckDouble EOF
            {
             newCompositeNode(grammarAccess.getBlackboardCheckDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlackboardCheckDouble=ruleBlackboardCheckDouble();

            state._fsp--;

             current =iv_ruleBlackboardCheckDouble; 
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
    // $ANTLR end "entryRuleBlackboardCheckDouble"


    // $ANTLR start "ruleBlackboardCheckDouble"
    // InternalQualityBtParser.g:6172:1: ruleBlackboardCheckDouble returns [EObject current=null] : (otherlv_0= BlackboardCheckDouble ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket ) ;
    public final EObject ruleBlackboardCheckDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        Enumerator lv_return_on_mismatch_10_0 = null;

        AntlrDatatypeRuleToken lv_value_A_12_0 = null;

        AntlrDatatypeRuleToken lv_value_B_14_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_child_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:6178:2: ( (otherlv_0= BlackboardCheckDouble ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket ) )
            // InternalQualityBtParser.g:6179:2: (otherlv_0= BlackboardCheckDouble ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:6179:2: (otherlv_0= BlackboardCheckDouble ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket )
            // InternalQualityBtParser.g:6180:3: otherlv_0= BlackboardCheckDouble ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,BlackboardCheckDouble,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlackboardCheckDoubleAccess().getBlackboardCheckDoubleKeyword_0());
            		
            // InternalQualityBtParser.g:6184:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:6185:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:6185:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:6186:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getBlackboardCheckDoubleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:6207:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==ID) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalQualityBtParser.g:6208:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBlackboardCheckDoubleAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:6212:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:6213:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:6213:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:6214:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:6232:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==NodeType) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalQualityBtParser.g:6233:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getBlackboardCheckDoubleAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:6237:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:6238:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:6238:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:6239:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:6257:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==NodeStatus) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalQualityBtParser.g:6258:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getBlackboardCheckDoubleAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:6262:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:6263:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:6263:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:6264:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,Return_on_mismatch,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getBlackboardCheckDoubleAccess().getReturn_on_mismatchKeyword_6());
            		
            // InternalQualityBtParser.g:6286:3: ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) )
            // InternalQualityBtParser.g:6287:4: (lv_return_on_mismatch_10_0= ruleNodeStatus )
            {
            // InternalQualityBtParser.g:6287:4: (lv_return_on_mismatch_10_0= ruleNodeStatus )
            // InternalQualityBtParser.g:6288:5: lv_return_on_mismatch_10_0= ruleNodeStatus
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getReturn_on_mismatchNodeStatusEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_51);
            lv_return_on_mismatch_10_0=ruleNodeStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
            					}
            					set(
            						current,
            						"return_on_mismatch",
            						lv_return_on_mismatch_10_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,Value_A,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getBlackboardCheckDoubleAccess().getValue_AKeyword_8());
            		
            // InternalQualityBtParser.g:6309:3: ( (lv_value_A_12_0= ruleEString ) )
            // InternalQualityBtParser.g:6310:4: (lv_value_A_12_0= ruleEString )
            {
            // InternalQualityBtParser.g:6310:4: (lv_value_A_12_0= ruleEString )
            // InternalQualityBtParser.g:6311:5: lv_value_A_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getValue_AEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_52);
            lv_value_A_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
            					}
            					set(
            						current,
            						"value_A",
            						lv_value_A_12_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,Value_B,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getBlackboardCheckDoubleAccess().getValue_BKeyword_10());
            		
            // InternalQualityBtParser.g:6332:3: ( (lv_value_B_14_0= ruleEString ) )
            // InternalQualityBtParser.g:6333:4: (lv_value_B_14_0= ruleEString )
            {
            // InternalQualityBtParser.g:6333:4: (lv_value_B_14_0= ruleEString )
            // InternalQualityBtParser.g:6334:5: lv_value_B_14_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getValue_BEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_28);
            lv_value_B_14_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
            					}
            					set(
            						current,
            						"value_B",
            						lv_value_B_14_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:6351:3: (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==Parameters) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalQualityBtParser.g:6352:4: otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket
                    {
                    otherlv_15=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getBlackboardCheckDoubleAccess().getParametersKeyword_12_0());
                    			
                    otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getBlackboardCheckDoubleAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalQualityBtParser.g:6360:4: ( (lv_parameters_17_0= ruleParameter ) )
                    // InternalQualityBtParser.g:6361:5: (lv_parameters_17_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:6361:5: (lv_parameters_17_0= ruleParameter )
                    // InternalQualityBtParser.g:6362:6: lv_parameters_17_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getParametersParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_17_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_17_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:6379:4: (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==Comma) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:6380:5: otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBlackboardCheckDoubleAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:6384:5: ( (lv_parameters_19_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:6385:6: (lv_parameters_19_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:6385:6: (lv_parameters_19_0= ruleParameter )
                    	    // InternalQualityBtParser.g:6386:7: lv_parameters_19_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getParametersParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_19_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_19_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_20, grammarAccess.getBlackboardCheckDoubleAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_21, grammarAccess.getBlackboardCheckDoubleAccess().getChildKeyword_13());
            		
            // InternalQualityBtParser.g:6413:3: ( (lv_child_22_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:6414:4: (lv_child_22_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:6414:4: (lv_child_22_0= ruleTreeNode )
            // InternalQualityBtParser.g:6415:5: lv_child_22_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckDoubleAccess().getChildTreeNodeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_22_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckDoubleRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_22_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getBlackboardCheckDoubleAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleBlackboardCheckDouble"


    // $ANTLR start "entryRuleBlackboardCheckString"
    // InternalQualityBtParser.g:6440:1: entryRuleBlackboardCheckString returns [EObject current=null] : iv_ruleBlackboardCheckString= ruleBlackboardCheckString EOF ;
    public final EObject entryRuleBlackboardCheckString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlackboardCheckString = null;


        try {
            // InternalQualityBtParser.g:6440:62: (iv_ruleBlackboardCheckString= ruleBlackboardCheckString EOF )
            // InternalQualityBtParser.g:6441:2: iv_ruleBlackboardCheckString= ruleBlackboardCheckString EOF
            {
             newCompositeNode(grammarAccess.getBlackboardCheckStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlackboardCheckString=ruleBlackboardCheckString();

            state._fsp--;

             current =iv_ruleBlackboardCheckString; 
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
    // $ANTLR end "entryRuleBlackboardCheckString"


    // $ANTLR start "ruleBlackboardCheckString"
    // InternalQualityBtParser.g:6447:1: ruleBlackboardCheckString returns [EObject current=null] : (otherlv_0= BlackboardCheckString ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket ) ;
    public final EObject ruleBlackboardCheckString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uID_4_0 = null;

        Enumerator lv_NodeType_6_0 = null;

        Enumerator lv_NodeStatus_8_0 = null;

        Enumerator lv_return_on_mismatch_10_0 = null;

        AntlrDatatypeRuleToken lv_value_A_12_0 = null;

        AntlrDatatypeRuleToken lv_value_B_14_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_child_22_0 = null;



        	enterRule();

        try {
            // InternalQualityBtParser.g:6453:2: ( (otherlv_0= BlackboardCheckString ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket ) )
            // InternalQualityBtParser.g:6454:2: (otherlv_0= BlackboardCheckString ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket )
            {
            // InternalQualityBtParser.g:6454:2: (otherlv_0= BlackboardCheckString ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket )
            // InternalQualityBtParser.g:6455:3: otherlv_0= BlackboardCheckString ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftCurlyBracket (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )? (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )? (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )? otherlv_9= Return_on_mismatch ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) ) otherlv_11= Value_A ( (lv_value_A_12_0= ruleEString ) ) otherlv_13= Value_B ( (lv_value_B_14_0= ruleEString ) ) (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )? otherlv_21= Child ( (lv_child_22_0= ruleTreeNode ) ) otherlv_23= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,BlackboardCheckString,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlackboardCheckStringAccess().getBlackboardCheckStringKeyword_0());
            		
            // InternalQualityBtParser.g:6459:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQualityBtParser.g:6460:4: (lv_name_1_0= ruleEString )
            {
            // InternalQualityBtParser.g:6460:4: (lv_name_1_0= ruleEString )
            // InternalQualityBtParser.g:6461:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getBlackboardCheckStringAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityBtParser.g:6482:3: (otherlv_3= ID ( (lv_uID_4_0= ruleEString ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==ID) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalQualityBtParser.g:6483:4: otherlv_3= ID ( (lv_uID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,ID,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBlackboardCheckStringAccess().getIDKeyword_3_0());
                    			
                    // InternalQualityBtParser.g:6487:4: ( (lv_uID_4_0= ruleEString ) )
                    // InternalQualityBtParser.g:6488:5: (lv_uID_4_0= ruleEString )
                    {
                    // InternalQualityBtParser.g:6488:5: (lv_uID_4_0= ruleEString )
                    // InternalQualityBtParser.g:6489:6: lv_uID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getUIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_uID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
                    						}
                    						set(
                    							current,
                    							"uID",
                    							lv_uID_4_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:6507:3: (otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==NodeType) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalQualityBtParser.g:6508:4: otherlv_5= NodeType ( (lv_NodeType_6_0= ruleNodeType ) )
                    {
                    otherlv_5=(Token)match(input,NodeType,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getBlackboardCheckStringAccess().getNodeTypeKeyword_4_0());
                    			
                    // InternalQualityBtParser.g:6512:4: ( (lv_NodeType_6_0= ruleNodeType ) )
                    // InternalQualityBtParser.g:6513:5: (lv_NodeType_6_0= ruleNodeType )
                    {
                    // InternalQualityBtParser.g:6513:5: (lv_NodeType_6_0= ruleNodeType )
                    // InternalQualityBtParser.g:6514:6: lv_NodeType_6_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getNodeTypeNodeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_NodeType_6_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
                    						}
                    						set(
                    							current,
                    							"NodeType",
                    							lv_NodeType_6_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQualityBtParser.g:6532:3: (otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==NodeStatus) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalQualityBtParser.g:6533:4: otherlv_7= NodeStatus ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    {
                    otherlv_7=(Token)match(input,NodeStatus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getBlackboardCheckStringAccess().getNodeStatusKeyword_5_0());
                    			
                    // InternalQualityBtParser.g:6537:4: ( (lv_NodeStatus_8_0= ruleNodeStatus ) )
                    // InternalQualityBtParser.g:6538:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    {
                    // InternalQualityBtParser.g:6538:5: (lv_NodeStatus_8_0= ruleNodeStatus )
                    // InternalQualityBtParser.g:6539:6: lv_NodeStatus_8_0= ruleNodeStatus
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getNodeStatusNodeStatusEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_NodeStatus_8_0=ruleNodeStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
                    						}
                    						set(
                    							current,
                    							"NodeStatus",
                    							lv_NodeStatus_8_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,Return_on_mismatch,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getBlackboardCheckStringAccess().getReturn_on_mismatchKeyword_6());
            		
            // InternalQualityBtParser.g:6561:3: ( (lv_return_on_mismatch_10_0= ruleNodeStatus ) )
            // InternalQualityBtParser.g:6562:4: (lv_return_on_mismatch_10_0= ruleNodeStatus )
            {
            // InternalQualityBtParser.g:6562:4: (lv_return_on_mismatch_10_0= ruleNodeStatus )
            // InternalQualityBtParser.g:6563:5: lv_return_on_mismatch_10_0= ruleNodeStatus
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getReturn_on_mismatchNodeStatusEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_51);
            lv_return_on_mismatch_10_0=ruleNodeStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
            					}
            					set(
            						current,
            						"return_on_mismatch",
            						lv_return_on_mismatch_10_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.NodeStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,Value_A,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getBlackboardCheckStringAccess().getValue_AKeyword_8());
            		
            // InternalQualityBtParser.g:6584:3: ( (lv_value_A_12_0= ruleEString ) )
            // InternalQualityBtParser.g:6585:4: (lv_value_A_12_0= ruleEString )
            {
            // InternalQualityBtParser.g:6585:4: (lv_value_A_12_0= ruleEString )
            // InternalQualityBtParser.g:6586:5: lv_value_A_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getValue_AEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_52);
            lv_value_A_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
            					}
            					set(
            						current,
            						"value_A",
            						lv_value_A_12_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,Value_B,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getBlackboardCheckStringAccess().getValue_BKeyword_10());
            		
            // InternalQualityBtParser.g:6607:3: ( (lv_value_B_14_0= ruleEString ) )
            // InternalQualityBtParser.g:6608:4: (lv_value_B_14_0= ruleEString )
            {
            // InternalQualityBtParser.g:6608:4: (lv_value_B_14_0= ruleEString )
            // InternalQualityBtParser.g:6609:5: lv_value_B_14_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getValue_BEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_28);
            lv_value_B_14_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
            					}
            					set(
            						current,
            						"value_B",
            						lv_value_B_14_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityBtParser.g:6626:3: (otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==Parameters) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalQualityBtParser.g:6627:4: otherlv_15= Parameters otherlv_16= LeftCurlyBracket ( (lv_parameters_17_0= ruleParameter ) ) (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )* otherlv_20= RightCurlyBracket
                    {
                    otherlv_15=(Token)match(input,Parameters,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getBlackboardCheckStringAccess().getParametersKeyword_12_0());
                    			
                    otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getBlackboardCheckStringAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalQualityBtParser.g:6635:4: ( (lv_parameters_17_0= ruleParameter ) )
                    // InternalQualityBtParser.g:6636:5: (lv_parameters_17_0= ruleParameter )
                    {
                    // InternalQualityBtParser.g:6636:5: (lv_parameters_17_0= ruleParameter )
                    // InternalQualityBtParser.g:6637:6: lv_parameters_17_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getParametersParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_17_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_17_0,
                    							"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityBtParser.g:6654:4: (otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==Comma) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalQualityBtParser.g:6655:5: otherlv_18= Comma ( (lv_parameters_19_0= ruleParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBlackboardCheckStringAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalQualityBtParser.g:6659:5: ( (lv_parameters_19_0= ruleParameter ) )
                    	    // InternalQualityBtParser.g:6660:6: (lv_parameters_19_0= ruleParameter )
                    	    {
                    	    // InternalQualityBtParser.g:6660:6: (lv_parameters_19_0= ruleParameter )
                    	    // InternalQualityBtParser.g:6661:7: lv_parameters_19_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getParametersParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_19_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_19_0,
                    	    								"org.xtext.chalmers.qualitybt.QualityBt.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_20, grammarAccess.getBlackboardCheckStringAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,Child,FOLLOW_9); 

            			newLeafNode(otherlv_21, grammarAccess.getBlackboardCheckStringAccess().getChildKeyword_13());
            		
            // InternalQualityBtParser.g:6688:3: ( (lv_child_22_0= ruleTreeNode ) )
            // InternalQualityBtParser.g:6689:4: (lv_child_22_0= ruleTreeNode )
            {
            // InternalQualityBtParser.g:6689:4: (lv_child_22_0= ruleTreeNode )
            // InternalQualityBtParser.g:6690:5: lv_child_22_0= ruleTreeNode
            {

            					newCompositeNode(grammarAccess.getBlackboardCheckStringAccess().getChildTreeNodeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_22_0=ruleTreeNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlackboardCheckStringRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_22_0,
            						"org.xtext.chalmers.qualitybt.QualityBt.TreeNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getBlackboardCheckStringAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleBlackboardCheckString"


    // $ANTLR start "ruleNodeType"
    // InternalQualityBtParser.g:6715:1: ruleNodeType returns [Enumerator current=null] : ( (enumLiteral_0= UNDEFINED ) | (enumLiteral_1= ACTION ) | (enumLiteral_2= CONDITION ) | (enumLiteral_3= CONTROL ) | (enumLiteral_4= DECORATOR ) | (enumLiteral_5= SUBTREE ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalQualityBtParser.g:6721:2: ( ( (enumLiteral_0= UNDEFINED ) | (enumLiteral_1= ACTION ) | (enumLiteral_2= CONDITION ) | (enumLiteral_3= CONTROL ) | (enumLiteral_4= DECORATOR ) | (enumLiteral_5= SUBTREE ) ) )
            // InternalQualityBtParser.g:6722:2: ( (enumLiteral_0= UNDEFINED ) | (enumLiteral_1= ACTION ) | (enumLiteral_2= CONDITION ) | (enumLiteral_3= CONTROL ) | (enumLiteral_4= DECORATOR ) | (enumLiteral_5= SUBTREE ) )
            {
            // InternalQualityBtParser.g:6722:2: ( (enumLiteral_0= UNDEFINED ) | (enumLiteral_1= ACTION ) | (enumLiteral_2= CONDITION ) | (enumLiteral_3= CONTROL ) | (enumLiteral_4= DECORATOR ) | (enumLiteral_5= SUBTREE ) )
            int alt151=6;
            switch ( input.LA(1) ) {
            case UNDEFINED:
                {
                alt151=1;
                }
                break;
            case ACTION:
                {
                alt151=2;
                }
                break;
            case CONDITION:
                {
                alt151=3;
                }
                break;
            case CONTROL:
                {
                alt151=4;
                }
                break;
            case DECORATOR:
                {
                alt151=5;
                }
                break;
            case SUBTREE:
                {
                alt151=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // InternalQualityBtParser.g:6723:3: (enumLiteral_0= UNDEFINED )
                    {
                    // InternalQualityBtParser.g:6723:3: (enumLiteral_0= UNDEFINED )
                    // InternalQualityBtParser.g:6724:4: enumLiteral_0= UNDEFINED
                    {
                    enumLiteral_0=(Token)match(input,UNDEFINED,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNodeTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityBtParser.g:6731:3: (enumLiteral_1= ACTION )
                    {
                    // InternalQualityBtParser.g:6731:3: (enumLiteral_1= ACTION )
                    // InternalQualityBtParser.g:6732:4: enumLiteral_1= ACTION
                    {
                    enumLiteral_1=(Token)match(input,ACTION,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getACTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNodeTypeAccess().getACTIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityBtParser.g:6739:3: (enumLiteral_2= CONDITION )
                    {
                    // InternalQualityBtParser.g:6739:3: (enumLiteral_2= CONDITION )
                    // InternalQualityBtParser.g:6740:4: enumLiteral_2= CONDITION
                    {
                    enumLiteral_2=(Token)match(input,CONDITION,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getCONDITIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNodeTypeAccess().getCONDITIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityBtParser.g:6747:3: (enumLiteral_3= CONTROL )
                    {
                    // InternalQualityBtParser.g:6747:3: (enumLiteral_3= CONTROL )
                    // InternalQualityBtParser.g:6748:4: enumLiteral_3= CONTROL
                    {
                    enumLiteral_3=(Token)match(input,CONTROL,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getCONTROLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNodeTypeAccess().getCONTROLEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityBtParser.g:6755:3: (enumLiteral_4= DECORATOR )
                    {
                    // InternalQualityBtParser.g:6755:3: (enumLiteral_4= DECORATOR )
                    // InternalQualityBtParser.g:6756:4: enumLiteral_4= DECORATOR
                    {
                    enumLiteral_4=(Token)match(input,DECORATOR,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getDECORATOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNodeTypeAccess().getDECORATOREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityBtParser.g:6763:3: (enumLiteral_5= SUBTREE )
                    {
                    // InternalQualityBtParser.g:6763:3: (enumLiteral_5= SUBTREE )
                    // InternalQualityBtParser.g:6764:4: enumLiteral_5= SUBTREE
                    {
                    enumLiteral_5=(Token)match(input,SUBTREE,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getSUBTREEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNodeTypeAccess().getSUBTREEEnumLiteralDeclaration_5());
                    			

                    }


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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "ruleNodeStatus"
    // InternalQualityBtParser.g:6774:1: ruleNodeStatus returns [Enumerator current=null] : ( (enumLiteral_0= IDLE ) | (enumLiteral_1= RUNNING ) | (enumLiteral_2= SUCCESS ) | (enumLiteral_3= FAILURE ) ) ;
    public final Enumerator ruleNodeStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalQualityBtParser.g:6780:2: ( ( (enumLiteral_0= IDLE ) | (enumLiteral_1= RUNNING ) | (enumLiteral_2= SUCCESS ) | (enumLiteral_3= FAILURE ) ) )
            // InternalQualityBtParser.g:6781:2: ( (enumLiteral_0= IDLE ) | (enumLiteral_1= RUNNING ) | (enumLiteral_2= SUCCESS ) | (enumLiteral_3= FAILURE ) )
            {
            // InternalQualityBtParser.g:6781:2: ( (enumLiteral_0= IDLE ) | (enumLiteral_1= RUNNING ) | (enumLiteral_2= SUCCESS ) | (enumLiteral_3= FAILURE ) )
            int alt152=4;
            switch ( input.LA(1) ) {
            case IDLE:
                {
                alt152=1;
                }
                break;
            case RUNNING:
                {
                alt152=2;
                }
                break;
            case SUCCESS:
                {
                alt152=3;
                }
                break;
            case FAILURE:
                {
                alt152=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // InternalQualityBtParser.g:6782:3: (enumLiteral_0= IDLE )
                    {
                    // InternalQualityBtParser.g:6782:3: (enumLiteral_0= IDLE )
                    // InternalQualityBtParser.g:6783:4: enumLiteral_0= IDLE
                    {
                    enumLiteral_0=(Token)match(input,IDLE,FOLLOW_2); 

                    				current = grammarAccess.getNodeStatusAccess().getIDLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNodeStatusAccess().getIDLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityBtParser.g:6790:3: (enumLiteral_1= RUNNING )
                    {
                    // InternalQualityBtParser.g:6790:3: (enumLiteral_1= RUNNING )
                    // InternalQualityBtParser.g:6791:4: enumLiteral_1= RUNNING
                    {
                    enumLiteral_1=(Token)match(input,RUNNING,FOLLOW_2); 

                    				current = grammarAccess.getNodeStatusAccess().getRUNNINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNodeStatusAccess().getRUNNINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityBtParser.g:6798:3: (enumLiteral_2= SUCCESS )
                    {
                    // InternalQualityBtParser.g:6798:3: (enumLiteral_2= SUCCESS )
                    // InternalQualityBtParser.g:6799:4: enumLiteral_2= SUCCESS
                    {
                    enumLiteral_2=(Token)match(input,SUCCESS,FOLLOW_2); 

                    				current = grammarAccess.getNodeStatusAccess().getSUCCESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNodeStatusAccess().getSUCCESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityBtParser.g:6806:3: (enumLiteral_3= FAILURE )
                    {
                    // InternalQualityBtParser.g:6806:3: (enumLiteral_3= FAILURE )
                    // InternalQualityBtParser.g:6807:4: enumLiteral_3= FAILURE
                    {
                    enumLiteral_3=(Token)match(input,FAILURE,FOLLOW_2); 

                    				current = grammarAccess.getNodeStatusAccess().getFAILUREEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNodeStatusAccess().getFAILUREEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleNodeStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x8000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000080C1A7BFFDF0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x800080C1A7BFFDF0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x1100020840000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1000020840000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004253000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1000000840000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0020580000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0110020040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010020040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0108020840000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008020840000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000840000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0140020040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040020040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100020240000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020240000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1108020840000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1008020840000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1008000840000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1008000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100020048000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020048000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100020040000200L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020040000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000040000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});

}