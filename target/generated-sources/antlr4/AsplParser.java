// Generated from Aspl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AsplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T_SEARCH=8, T_EVAL=9, 
		T_SOURCE=10, T_REGEX=11, T_WILDCARD=12, T_DATEHISTOGRAM=13, T_HISTOGRAM=14, 
		T_STATS=15, T_BUCKET=16, T_SELECT=17, T_BY=18, T_DO=19, T_NOT=20, T_AND=21, 
		T_OR=22, T_SORT=23, T_ASC=24, T_DESC=25, T_LIMIT=26, T_PIPE=27, T_PIPE2=28, 
		T_LP=29, T_RP=30, T_AMP2=31, T_EQ=32, T_EQ2=33, T_EQ3=34, T_NEQ=35, T_LT=36, 
		T_LTE=37, T_GT=38, T_GTE=39, T_EXCL=40, T_COMMA=41, IDENTIFIER=42, WS=43, 
		COMMENT=44, LINE_COMMENT=45, DECIMAL_LITERAL=46, HEX_LITERAL=47, OCT_LITERAL=48, 
		BINARY_LITERAL=49, FLOAT_LITERAL=50, HEX_FLOAT_LITERAL=51, BOOL_LITERAL=52, 
		CHAR_LITERAL=53, STRING_LITERAL=54, NULL_LITERAL=55;
	public static final int
		RULE_sections = 0, RULE_sourceStatement = 1, RULE_searchStatements = 2, 
		RULE_searchStatement = 3, RULE_sortStatement = 4, RULE_sortField = 5, 
		RULE_limitStatement = 6, RULE_statsStatement = 7, RULE_evalStatement = 8, 
		RULE_bucketStatement = 9, RULE_statsGroupingColumns = 10, RULE_statsParameters = 11, 
		RULE_statsFunctions = 12, RULE_statsFunction = 13, RULE_booleanExpression = 14, 
		RULE_primaryBooleanExpression = 15, RULE_literal = 16, RULE_integerLiteral = 17, 
		RULE_floatLiteral = 18, RULE_stringLiteral = 19, RULE_expression = 20, 
		RULE_expressionList = 21, RULE_methodCall = 22, RULE_primary = 23;
	public static final String[] ruleNames = {
		"sections", "sourceStatement", "searchStatements", "searchStatement", 
		"sortStatement", "sortField", "limitStatement", "statsStatement", "evalStatement", 
		"bucketStatement", "statsGroupingColumns", "statsParameters", "statsFunctions", 
		"statsFunction", "booleanExpression", "primaryBooleanExpression", "literal", 
		"integerLiteral", "floatLiteral", "stringLiteral", "expression", "expressionList", 
		"methodCall", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'++'", "'--'", "'*'", "'/'", "'%'", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'|'", "'||'", "'('", "')'", "'&&'", "'='", "'=='", 
		"'==='", "'!='", "'<'", "'<='", "'>'", "'>='", "'!'", "','", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "T_SEARCH", "T_EVAL", 
		"T_SOURCE", "T_REGEX", "T_WILDCARD", "T_DATEHISTOGRAM", "T_HISTOGRAM", 
		"T_STATS", "T_BUCKET", "T_SELECT", "T_BY", "T_DO", "T_NOT", "T_AND", "T_OR", 
		"T_SORT", "T_ASC", "T_DESC", "T_LIMIT", "T_PIPE", "T_PIPE2", "T_LP", "T_RP", 
		"T_AMP2", "T_EQ", "T_EQ2", "T_EQ3", "T_NEQ", "T_LT", "T_LTE", "T_GT", 
		"T_GTE", "T_EXCL", "T_COMMA", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", 
		"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
		"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"NULL_LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Aspl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AsplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SectionsContext extends ParserRuleContext {
		public SourceStatementContext sourceStatement() {
			return getRuleContext(SourceStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AsplParser.EOF, 0); }
		public List<TerminalNode> T_PIPE() { return getTokens(AsplParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(AsplParser.T_PIPE, i);
		}
		public List<SearchStatementContext> searchStatement() {
			return getRuleContexts(SearchStatementContext.class);
		}
		public SearchStatementContext searchStatement(int i) {
			return getRuleContext(SearchStatementContext.class,i);
		}
		public SortStatementContext sortStatement() {
			return getRuleContext(SortStatementContext.class,0);
		}
		public LimitStatementContext limitStatement() {
			return getRuleContext(LimitStatementContext.class,0);
		}
		public List<EvalStatementContext> evalStatement() {
			return getRuleContexts(EvalStatementContext.class);
		}
		public EvalStatementContext evalStatement(int i) {
			return getRuleContext(EvalStatementContext.class,i);
		}
		public StatsStatementContext statsStatement() {
			return getRuleContext(StatsStatementContext.class,0);
		}
		public BucketStatementContext bucketStatement() {
			return getRuleContext(BucketStatementContext.class,0);
		}
		public SectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitSections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitSections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sections);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			sourceStatement();
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					match(T_PIPE);
					setState(50);
					searchStatement();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(56);
				match(T_PIPE);
				setState(57);
				sortStatement();
				}
				break;
			}
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(60);
				match(T_PIPE);
				setState(61);
				limitStatement();
				}
				break;
			}
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(T_PIPE);
					setState(65);
					evalStatement();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PIPE) {
				{
				setState(71);
				match(T_PIPE);
				setState(72);
				statsStatement();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PIPE) {
					{
					setState(73);
					match(T_PIPE);
					setState(74);
					bucketStatement();
					}
				}

				}
			}

			setState(79);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceStatementContext extends ParserRuleContext {
		public TerminalNode T_SOURCE() { return getToken(AsplParser.T_SOURCE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SourceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterSourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitSourceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitSourceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceStatementContext sourceStatement() throws RecognitionException {
		SourceStatementContext _localctx = new SourceStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T_SOURCE);
			setState(82);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchStatementsContext extends ParserRuleContext {
		public List<SearchStatementContext> searchStatement() {
			return getRuleContexts(SearchStatementContext.class);
		}
		public SearchStatementContext searchStatement(int i) {
			return getRuleContext(SearchStatementContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(AsplParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(AsplParser.T_PIPE, i);
		}
		public SearchStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterSearchStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitSearchStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitSearchStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchStatementsContext searchStatements() throws RecognitionException {
		SearchStatementsContext _localctx = new SearchStatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_searchStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			searchStatement();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_PIPE) {
				{
				{
				setState(85);
				match(T_PIPE);
				setState(86);
				searchStatement();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchStatementContext extends ParserRuleContext {
		public TerminalNode T_SEARCH() { return getToken(AsplParser.T_SEARCH, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public SearchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterSearchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitSearchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitSearchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchStatementContext searchStatement() throws RecognitionException {
		SearchStatementContext _localctx = new SearchStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_searchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T_SEARCH);
			setState(93);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortStatementContext extends ParserRuleContext {
		public TerminalNode T_SORT() { return getToken(AsplParser.T_SORT, 0); }
		public List<SortFieldContext> sortField() {
			return getRuleContexts(SortFieldContext.class);
		}
		public SortFieldContext sortField(int i) {
			return getRuleContext(SortFieldContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(AsplParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(AsplParser.T_COMMA, i);
		}
		public SortStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterSortStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitSortStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitSortStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortStatementContext sortStatement() throws RecognitionException {
		SortStatementContext _localctx = new SortStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sortStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T_SORT);
			setState(96);
			sortField();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(97);
				match(T_COMMA);
				setState(98);
				sortField();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortFieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsplParser.IDENTIFIER, 0); }
		public TerminalNode T_ASC() { return getToken(AsplParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(AsplParser.T_DESC, 0); }
		public SortFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterSortField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitSortField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitSortField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortFieldContext sortField() throws RecognitionException {
		SortFieldContext _localctx = new SortFieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sortField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFIER);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitStatementContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(AsplParser.T_LIMIT, 0); }
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(AsplParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(AsplParser.T_COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsplParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsplParser.IDENTIFIER, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(AsplParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(AsplParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(AsplParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(AsplParser.T_DESC, i);
		}
		public LimitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterLimitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitLimitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitLimitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitStatementContext limitStatement() throws RecognitionException {
		LimitStatementContext _localctx = new LimitStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_limitStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T_LIMIT);
			setState(109);
			integerLiteral();
			setState(110);
			match(T_COMMA);
			setState(111);
			integerLiteral();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(115);
				match(T_COMMA);
				setState(116);
				match(IDENTIFIER);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(117);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatsStatementContext extends ParserRuleContext {
		public Token op;
		public StatsFunctionsContext statsFunctions() {
			return getRuleContext(StatsFunctionsContext.class,0);
		}
		public TerminalNode T_STATS() { return getToken(AsplParser.T_STATS, 0); }
		public TerminalNode T_BY() { return getToken(AsplParser.T_BY, 0); }
		public StatsGroupingColumnsContext statsGroupingColumns() {
			return getRuleContext(StatsGroupingColumnsContext.class,0);
		}
		public StatsParametersContext statsParameters() {
			return getRuleContext(StatsParametersContext.class,0);
		}
		public TerminalNode T_DATEHISTOGRAM() { return getToken(AsplParser.T_DATEHISTOGRAM, 0); }
		public TerminalNode T_DO() { return getToken(AsplParser.T_DO, 0); }
		public TerminalNode T_HISTOGRAM() { return getToken(AsplParser.T_HISTOGRAM, 0); }
		public StatsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterStatsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitStatsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitStatsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsStatementContext statsStatement() throws RecognitionException {
		StatsStatementContext _localctx = new StatsStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statsStatement);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_STATS:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((StatsStatementContext)_localctx).op = match(T_STATS);
				setState(126);
				statsFunctions();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY) {
					{
					setState(127);
					match(T_BY);
					setState(128);
					statsGroupingColumns();
					}
				}

				}
				break;
			case T_DATEHISTOGRAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((StatsStatementContext)_localctx).op = match(T_DATEHISTOGRAM);
				setState(132);
				statsParameters();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DO) {
					{
					setState(133);
					match(T_DO);
					setState(134);
					statsFunctions();
					}
				}

				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY) {
					{
					setState(137);
					match(T_BY);
					setState(138);
					statsGroupingColumns();
					}
				}

				}
				break;
			case T_HISTOGRAM:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				((StatsStatementContext)_localctx).op = match(T_HISTOGRAM);
				setState(142);
				statsParameters();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DO) {
					{
					setState(143);
					match(T_DO);
					setState(144);
					statsFunctions();
					}
				}

				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY) {
					{
					setState(147);
					match(T_BY);
					setState(148);
					statsGroupingColumns();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvalStatementContext extends ParserRuleContext {
		public TerminalNode T_EVAL() { return getToken(AsplParser.T_EVAL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsplParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsplParser.IDENTIFIER, i);
		}
		public List<TerminalNode> T_EQ() { return getTokens(AsplParser.T_EQ); }
		public TerminalNode T_EQ(int i) {
			return getToken(AsplParser.T_EQ, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(AsplParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(AsplParser.T_COMMA, i);
		}
		public EvalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterEvalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitEvalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitEvalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalStatementContext evalStatement() throws RecognitionException {
		EvalStatementContext _localctx = new EvalStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_evalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T_EVAL);
			{
			setState(154);
			match(IDENTIFIER);
			setState(155);
			match(T_EQ);
			setState(156);
			stringLiteral();
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(158);
				match(T_COMMA);
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(T_EQ);
				setState(161);
				stringLiteral();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketStatementContext extends ParserRuleContext {
		public Token op;
		public TerminalNode T_BUCKET() { return getToken(AsplParser.T_BUCKET, 0); }
		public StatsFunctionsContext statsFunctions() {
			return getRuleContext(StatsFunctionsContext.class,0);
		}
		public TerminalNode T_STATS() { return getToken(AsplParser.T_STATS, 0); }
		public List<TerminalNode> T_SELECT() { return getTokens(AsplParser.T_SELECT); }
		public TerminalNode T_SELECT(int i) {
			return getToken(AsplParser.T_SELECT, i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(AsplParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(AsplParser.T_PIPE, i);
		}
		public BucketStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterBucketStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitBucketStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitBucketStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketStatementContext bucketStatement() throws RecognitionException {
		BucketStatementContext _localctx = new BucketStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucketStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T_BUCKET);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_STATS) {
				{
				setState(168);
				((BucketStatementContext)_localctx).op = match(T_STATS);
				setState(169);
				statsFunctions();
				}
			}

			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SELECT) {
				{
				setState(172);
				match(T_SELECT);
				setState(173);
				booleanExpression(0);
				}
			}

			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_PIPE) {
				{
				{
				setState(176);
				match(T_PIPE);
				setState(177);
				match(T_SELECT);
				setState(178);
				booleanExpression(0);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatsGroupingColumnsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsplParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsplParser.IDENTIFIER, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(AsplParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(AsplParser.T_COMMA, i);
		}
		public StatsGroupingColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statsGroupingColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterStatsGroupingColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitStatsGroupingColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitStatsGroupingColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsGroupingColumnsContext statsGroupingColumns() throws RecognitionException {
		StatsGroupingColumnsContext _localctx = new StatsGroupingColumnsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statsGroupingColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			match(IDENTIFIER);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(185);
				match(T_COMMA);
				setState(186);
				match(IDENTIFIER);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatsParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsplParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsplParser.IDENTIFIER, i);
		}
		public List<TerminalNode> T_EQ() { return getTokens(AsplParser.T_EQ); }
		public TerminalNode T_EQ(int i) {
			return getToken(AsplParser.T_EQ, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(AsplParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(AsplParser.T_COMMA, i);
		}
		public StatsParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statsParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterStatsParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitStatsParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitStatsParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsParametersContext statsParameters() throws RecognitionException {
		StatsParametersContext _localctx = new StatsParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statsParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			match(IDENTIFIER);
			setState(193);
			match(T_EQ);
			setState(194);
			literal();
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(196);
				match(T_COMMA);
				setState(197);
				match(IDENTIFIER);
				setState(198);
				match(T_EQ);
				setState(199);
				literal();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatsFunctionsContext extends ParserRuleContext {
		public List<StatsFunctionContext> statsFunction() {
			return getRuleContexts(StatsFunctionContext.class);
		}
		public StatsFunctionContext statsFunction(int i) {
			return getRuleContext(StatsFunctionContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(AsplParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(AsplParser.T_COMMA, i);
		}
		public StatsFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statsFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterStatsFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitStatsFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitStatsFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsFunctionsContext statsFunctions() throws RecognitionException {
		StatsFunctionsContext _localctx = new StatsFunctionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statsFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			statsFunction();
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(206);
				match(T_COMMA);
				setState(207);
				statsFunction();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatsFunctionContext extends ParserRuleContext {
		public Token columnName;
		public Token methodName;
		public Token fieldName;
		public TerminalNode T_EQ() { return getToken(AsplParser.T_EQ, 0); }
		public TerminalNode T_LP() { return getToken(AsplParser.T_LP, 0); }
		public TerminalNode T_RP() { return getToken(AsplParser.T_RP, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsplParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsplParser.IDENTIFIER, i);
		}
		public StatsFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statsFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterStatsFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitStatsFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitStatsFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsFunctionContext statsFunction() throws RecognitionException {
		StatsFunctionContext _localctx = new StatsFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statsFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			((StatsFunctionContext)_localctx).columnName = match(IDENTIFIER);
			setState(214);
			match(T_EQ);
			setState(215);
			((StatsFunctionContext)_localctx).methodName = match(IDENTIFIER);
			setState(216);
			match(T_LP);
			setState(217);
			((StatsFunctionContext)_localctx).fieldName = match(IDENTIFIER);
			setState(218);
			match(T_RP);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public Token op;
		public Token identifier;
		public PrimaryBooleanExpressionContext primaryBooleanExpression() {
			return getRuleContext(PrimaryBooleanExpressionContext.class,0);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode T_NOT() { return getToken(AsplParser.T_NOT, 0); }
		public TerminalNode T_EXCL() { return getToken(AsplParser.T_EXCL, 0); }
		public TerminalNode T_EQ() { return getToken(AsplParser.T_EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode T_REGEX() { return getToken(AsplParser.T_REGEX, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsplParser.IDENTIFIER, 0); }
		public TerminalNode T_WILDCARD() { return getToken(AsplParser.T_WILDCARD, 0); }
		public TerminalNode T_LTE() { return getToken(AsplParser.T_LTE, 0); }
		public TerminalNode T_GTE() { return getToken(AsplParser.T_GTE, 0); }
		public TerminalNode T_LT() { return getToken(AsplParser.T_LT, 0); }
		public TerminalNode T_GT() { return getToken(AsplParser.T_GT, 0); }
		public TerminalNode T_EQ2() { return getToken(AsplParser.T_EQ2, 0); }
		public TerminalNode T_EQ3() { return getToken(AsplParser.T_EQ3, 0); }
		public TerminalNode T_NEQ() { return getToken(AsplParser.T_NEQ, 0); }
		public TerminalNode T_AMP2() { return getToken(AsplParser.T_AMP2, 0); }
		public TerminalNode T_AND() { return getToken(AsplParser.T_AND, 0); }
		public TerminalNode T_PIPE2() { return getToken(AsplParser.T_PIPE2, 0); }
		public TerminalNode T_OR() { return getToken(AsplParser.T_OR, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(221);
				primaryBooleanExpression();
				}
				break;
			case 2:
				{
				setState(222);
				((BooleanExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_NOT || _la==T_EXCL) ) {
					((BooleanExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				booleanExpression(7);
				}
				break;
			case 3:
				{
				setState(224);
				((BooleanExpressionContext)_localctx).op = match(T_REGEX);
				setState(225);
				((BooleanExpressionContext)_localctx).identifier = match(IDENTIFIER);
				setState(226);
				match(T_EQ);
				setState(227);
				literal();
				}
				break;
			case 4:
				{
				setState(228);
				((BooleanExpressionContext)_localctx).op = match(T_WILDCARD);
				setState(229);
				((BooleanExpressionContext)_localctx).identifier = match(IDENTIFIER);
				setState(230);
				match(T_EQ);
				setState(231);
				literal();
				}
				break;
			case 5:
				{
				setState(232);
				((BooleanExpressionContext)_localctx).identifier = match(IDENTIFIER);
				setState(233);
				((BooleanExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_LT) | (1L << T_LTE) | (1L << T_GT) | (1L << T_GTE))) != 0)) ) {
					((BooleanExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				literal();
				}
				break;
			case 6:
				{
				setState(235);
				((BooleanExpressionContext)_localctx).identifier = match(IDENTIFIER);
				setState(236);
				((BooleanExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_EQ) | (1L << T_EQ2) | (1L << T_EQ3) | (1L << T_NEQ))) != 0)) ) {
					((BooleanExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						((BooleanExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T_AND || _la==T_AMP2) ) {
							((BooleanExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(243);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(244);
						((BooleanExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T_OR || _la==T_PIPE2) ) {
							((BooleanExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryBooleanExpressionContext extends ParserRuleContext {
		public TerminalNode T_LP() { return getToken(AsplParser.T_LP, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode T_RP() { return getToken(AsplParser.T_RP, 0); }
		public PrimaryBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryBooleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterPrimaryBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitPrimaryBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitPrimaryBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryBooleanExpressionContext primaryBooleanExpression() throws RecognitionException {
		PrimaryBooleanExpressionContext _localctx = new PrimaryBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primaryBooleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T_LP);
			setState(252);
			booleanExpression(0);
			setState(253);
			match(T_RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(AsplParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(AsplParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(AsplParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(AsplParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(AsplParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(AsplParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(AsplParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(AsplParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(AsplParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AsplParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==CHAR_LITERAL || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode T_AND() { return getToken(AsplParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(AsplParser.T_OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LP:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				{
				setState(269);
				primary();
				}
				break;
			case IDENTIFIER:
				{
				setState(270);
				methodCall();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				{
				setState(271);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				expression(8);
				}
				break;
			case T_EXCL:
				{
				setState(273);
				((ExpressionContext)_localctx).prefix = match(T_EXCL);
				setState(274);
				expression(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(284);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_LT) | (1L << T_LTE) | (1L << T_GT) | (1L << T_GTE))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(285);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(287);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T_EQ2 || _la==T_NEQ) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T_AND || _la==T_AMP2) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(293);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T_OR || _la==T_PIPE2) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			expression(0);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(301);
				match(T_COMMA);
				setState(302);
				expression(0);
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsplParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(IDENTIFIER);
			setState(309);
			match(T_LP);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T_LP) | (1L << T_EXCL) | (1L << IDENTIFIER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
				{
				setState(310);
				expressionList();
				}
			}

			setState(313);
			match(T_RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsplListener ) ((AsplListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsplVisitor ) return ((AsplVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T_LP);
				setState(316);
				expression(0);
				setState(317);
				match(T_RP);
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0145\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\5\2=\n\2\3\2\3\2\5\2A\n"+
		"\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\3\2\5\2N\n\2\5\2P\n\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\5\bt\n\b\3\b\3\b\3\b\5\by\n\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t"+
		"\3\t\5\t\u0084\n\t\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\5\t\u008e\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0094\n\t\3\t\3\t\5\t\u0098\n\t\5\t\u009a\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a5\n\n\f\n\16\n\u00a8\13\n\3\13"+
		"\3\13\3\13\5\13\u00ad\n\13\3\13\3\13\5\13\u00b1\n\13\3\13\3\13\3\13\7"+
		"\13\u00b6\n\13\f\13\16\13\u00b9\13\13\3\f\3\f\3\f\7\f\u00be\n\f\f\f\16"+
		"\f\u00c1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cb\n\r\f\r\16\r\u00ce"+
		"\13\r\3\16\3\16\3\16\7\16\u00d3\n\16\f\16\16\16\u00d6\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f1\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00f9\n\20\f\20\16\20\u00fc\13\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0107\n\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0116\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u012a\n\26\f\26\16\26\u012d\13\26\3\27\3\27\3\27\7\27"+
		"\u0132\n\27\f\27\16\27\u0135\13\27\3\30\3\30\3\30\5\30\u013a\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0143\n\31\3\31\2\4\36*\32\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\17\3\2\32\33\4\2\26\26*"+
		"*\3\2&)\3\2\"%\4\2\27\27!!\4\2\30\30\36\36\3\2\60\63\3\2\64\65\3\2\67"+
		"8\3\2\3\6\3\2\7\t\3\2\3\4\4\2##%%\2\u015d\2\62\3\2\2\2\4S\3\2\2\2\6V\3"+
		"\2\2\2\b^\3\2\2\2\na\3\2\2\2\fj\3\2\2\2\16n\3\2\2\2\20\u0099\3\2\2\2\22"+
		"\u009b\3\2\2\2\24\u00a9\3\2\2\2\26\u00ba\3\2\2\2\30\u00c2\3\2\2\2\32\u00cf"+
		"\3\2\2\2\34\u00d7\3\2\2\2\36\u00f0\3\2\2\2 \u00fd\3\2\2\2\"\u0106\3\2"+
		"\2\2$\u0108\3\2\2\2&\u010a\3\2\2\2(\u010c\3\2\2\2*\u0115\3\2\2\2,\u012e"+
		"\3\2\2\2.\u0136\3\2\2\2\60\u0142\3\2\2\2\62\67\5\4\3\2\63\64\7\35\2\2"+
		"\64\66\5\b\5\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28<\3"+
		"\2\2\29\67\3\2\2\2:;\7\35\2\2;=\5\n\6\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2"+
		">?\7\35\2\2?A\5\16\b\2@>\3\2\2\2@A\3\2\2\2AF\3\2\2\2BC\7\35\2\2CE\5\22"+
		"\n\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GO\3\2\2\2HF\3\2\2\2IJ\7\35"+
		"\2\2JM\5\20\t\2KL\7\35\2\2LN\5\24\13\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2O"+
		"I\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\2\2\3R\3\3\2\2\2ST\7\f\2\2TU\5(\25\2"+
		"U\5\3\2\2\2V[\5\b\5\2WX\7\35\2\2XZ\5\b\5\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\\7\3\2\2\2][\3\2\2\2^_\7\n\2\2_`\5\36\20\2`\t\3\2\2\2a"+
		"b\7\31\2\2bg\5\f\7\2cd\7+\2\2df\5\f\7\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2h\13\3\2\2\2ig\3\2\2\2jl\7,\2\2km\t\2\2\2lk\3\2\2\2lm\3\2\2"+
		"\2m\r\3\2\2\2no\7\34\2\2op\5$\23\2pq\7+\2\2qs\5$\23\2rt\t\2\2\2sr\3\2"+
		"\2\2st\3\2\2\2t|\3\2\2\2uv\7+\2\2vx\7,\2\2wy\t\2\2\2xw\3\2\2\2xy\3\2\2"+
		"\2y{\3\2\2\2zu\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2"+
		"\2\2\177\u0080\7\21\2\2\u0080\u0083\5\32\16\2\u0081\u0082\7\24\2\2\u0082"+
		"\u0084\5\26\f\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u009a\3"+
		"\2\2\2\u0085\u0086\7\17\2\2\u0086\u0089\5\30\r\2\u0087\u0088\7\25\2\2"+
		"\u0088\u008a\5\32\16\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u008c\7\24\2\2\u008c\u008e\5\26\f\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u009a\3\2\2\2\u008f\u0090\7\20\2\2\u0090\u0093"+
		"\5\30\r\2\u0091\u0092\7\25\2\2\u0092\u0094\5\32\16\2\u0093\u0091\3\2\2"+
		"\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\7\24\2\2\u0096"+
		"\u0098\5\26\f\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3"+
		"\2\2\2\u0099\177\3\2\2\2\u0099\u0085\3\2\2\2\u0099\u008f\3\2\2\2\u009a"+
		"\21\3\2\2\2\u009b\u009c\7\13\2\2\u009c\u009d\7,\2\2\u009d\u009e\7\"\2"+
		"\2\u009e\u009f\5(\25\2\u009f\u00a6\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1\u00a2"+
		"\7,\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a5\5(\25\2\u00a4\u00a0\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\23\3\2\2"+
		"\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\7\22\2\2\u00aa\u00ab\7\21\2\2\u00ab"+
		"\u00ad\5\32\16\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00af\7\23\2\2\u00af\u00b1\5\36\20\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b7\3\2\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4"+
		"\7\23\2\2\u00b4\u00b6\5\36\20\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\25\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bf\7,\2\2\u00bb\u00bc\7+\2\2\u00bc\u00be\7,\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\27\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c4"+
		"\7\"\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\7+\2\2\u00c7"+
		"\u00c8\7,\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c6\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\31\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d4\5\34\17\2\u00d0\u00d1\7+\2"+
		"\2\u00d1\u00d3\5\34\17\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00d8\7,\2\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\7,\2\2\u00da\u00db"+
		"\7\37\2\2\u00db\u00dc\7,\2\2\u00dc\u00dd\7 \2\2\u00dd\35\3\2\2\2\u00de"+
		"\u00df\b\20\1\2\u00df\u00f1\5 \21\2\u00e0\u00e1\t\3\2\2\u00e1\u00f1\5"+
		"\36\20\t\u00e2\u00e3\7\r\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5\7\"\2\2\u00e5"+
		"\u00f1\5\"\22\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\7"+
		"\"\2\2\u00e9\u00f1\5\"\22\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\t\4\2\2\u00ec"+
		"\u00f1\5\"\22\2\u00ed\u00ee\7,\2\2\u00ee\u00ef\t\5\2\2\u00ef\u00f1\5\""+
		"\22\2\u00f0\u00de\3\2\2\2\u00f0\u00e0\3\2\2\2\u00f0\u00e2\3\2\2\2\u00f0"+
		"\u00e6\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\u00fa\3\2"+
		"\2\2\u00f2\u00f3\f\4\2\2\u00f3\u00f4\t\6\2\2\u00f4\u00f9\5\36\20\5\u00f5"+
		"\u00f6\f\3\2\2\u00f6\u00f7\t\7\2\2\u00f7\u00f9\5\36\20\4\u00f8\u00f2\3"+
		"\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\37\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\37\2"+
		"\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\7 \2\2\u0100!\3\2\2\2\u0101\u0107"+
		"\5$\23\2\u0102\u0107\5&\24\2\u0103\u0107\5(\25\2\u0104\u0107\7\66\2\2"+
		"\u0105\u0107\79\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107#\3\2\2\2\u0108"+
		"\u0109\t\b\2\2\u0109%\3\2\2\2\u010a\u010b\t\t\2\2\u010b\'\3\2\2\2\u010c"+
		"\u010d\t\n\2\2\u010d)\3\2\2\2\u010e\u010f\b\26\1\2\u010f\u0116\5\60\31"+
		"\2\u0110\u0116\5.\30\2\u0111\u0112\t\13\2\2\u0112\u0116\5*\26\n\u0113"+
		"\u0114\7*\2\2\u0114\u0116\5*\26\t\u0115\u010e\3\2\2\2\u0115\u0110\3\2"+
		"\2\2\u0115\u0111\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u012b\3\2\2\2\u0117"+
		"\u0118\f\b\2\2\u0118\u0119\t\f\2\2\u0119\u012a\5*\26\t\u011a\u011b\f\7"+
		"\2\2\u011b\u011c\t\r\2\2\u011c\u012a\5*\26\b\u011d\u011e\f\6\2\2\u011e"+
		"\u011f\t\4\2\2\u011f\u012a\5*\26\7\u0120\u0121\f\5\2\2\u0121\u0122\t\16"+
		"\2\2\u0122\u012a\5*\26\6\u0123\u0124\f\4\2\2\u0124\u0125\t\6\2\2\u0125"+
		"\u012a\5*\26\5\u0126\u0127\f\3\2\2\u0127\u0128\t\7\2\2\u0128\u012a\5*"+
		"\26\4\u0129\u0117\3\2\2\2\u0129\u011a\3\2\2\2\u0129\u011d\3\2\2\2\u0129"+
		"\u0120\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c+\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012e\u0133\5*\26\2\u012f\u0130\7+\2\2\u0130\u0132\5*\26\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134-\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7,\2\2\u0137\u0139"+
		"\7\37\2\2\u0138\u013a\5,\27\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u013b\3\2\2\2\u013b\u013c\7 \2\2\u013c/\3\2\2\2\u013d\u013e\7\37"+
		"\2\2\u013e\u013f\5*\26\2\u013f\u0140\7 \2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u0143\5\"\22\2\u0142\u013d\3\2\2\2\u0142\u0141\3\2\2\2\u0143\61\3\2\2"+
		"\2%\67<@FMO[glsx|\u0083\u0089\u008d\u0093\u0097\u0099\u00a6\u00ac\u00b0"+
		"\u00b7\u00bf\u00cc\u00d4\u00f0\u00f8\u00fa\u0106\u0115\u0129\u012b\u0133"+
		"\u0139\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}