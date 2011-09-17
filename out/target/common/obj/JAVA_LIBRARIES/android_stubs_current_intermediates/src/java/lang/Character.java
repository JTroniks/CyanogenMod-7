package java.lang;
public final class Character
  implements java.io.Serializable, java.lang.Comparable<java.lang.Character>
{
public static class Subset
{
protected  Subset(java.lang.String string) { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static final class UnicodeBlock
  extends java.lang.Character.Subset
{
UnicodeBlock() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public static final  java.lang.Character.UnicodeBlock forName(java.lang.String blockName) { throw new RuntimeException("Stub!"); }
public static  java.lang.Character.UnicodeBlock of(char c) { throw new RuntimeException("Stub!"); }
public static  java.lang.Character.UnicodeBlock of(int codePoint) { throw new RuntimeException("Stub!"); }
public static final java.lang.Character.UnicodeBlock SURROGATES_AREA;
public static final java.lang.Character.UnicodeBlock BASIC_LATIN;
public static final java.lang.Character.UnicodeBlock LATIN_1_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock LATIN_EXTENDED_A;
public static final java.lang.Character.UnicodeBlock LATIN_EXTENDED_B;
public static final java.lang.Character.UnicodeBlock IPA_EXTENSIONS;
public static final java.lang.Character.UnicodeBlock SPACING_MODIFIER_LETTERS;
public static final java.lang.Character.UnicodeBlock COMBINING_DIACRITICAL_MARKS;
public static final java.lang.Character.UnicodeBlock GREEK;
public static final java.lang.Character.UnicodeBlock CYRILLIC;
public static final java.lang.Character.UnicodeBlock CYRILLIC_SUPPLEMENTARY;
public static final java.lang.Character.UnicodeBlock ARMENIAN;
public static final java.lang.Character.UnicodeBlock HEBREW;
public static final java.lang.Character.UnicodeBlock ARABIC;
public static final java.lang.Character.UnicodeBlock SYRIAC;
public static final java.lang.Character.UnicodeBlock THAANA;
public static final java.lang.Character.UnicodeBlock DEVANAGARI;
public static final java.lang.Character.UnicodeBlock BENGALI;
public static final java.lang.Character.UnicodeBlock GURMUKHI;
public static final java.lang.Character.UnicodeBlock GUJARATI;
public static final java.lang.Character.UnicodeBlock ORIYA;
public static final java.lang.Character.UnicodeBlock TAMIL;
public static final java.lang.Character.UnicodeBlock TELUGU;
public static final java.lang.Character.UnicodeBlock KANNADA;
public static final java.lang.Character.UnicodeBlock MALAYALAM;
public static final java.lang.Character.UnicodeBlock SINHALA;
public static final java.lang.Character.UnicodeBlock THAI;
public static final java.lang.Character.UnicodeBlock LAO;
public static final java.lang.Character.UnicodeBlock TIBETAN;
public static final java.lang.Character.UnicodeBlock MYANMAR;
public static final java.lang.Character.UnicodeBlock GEORGIAN;
public static final java.lang.Character.UnicodeBlock HANGUL_JAMO;
public static final java.lang.Character.UnicodeBlock ETHIOPIC;
public static final java.lang.Character.UnicodeBlock CHEROKEE;
public static final java.lang.Character.UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS;
public static final java.lang.Character.UnicodeBlock OGHAM;
public static final java.lang.Character.UnicodeBlock RUNIC;
public static final java.lang.Character.UnicodeBlock TAGALOG;
public static final java.lang.Character.UnicodeBlock HANUNOO;
public static final java.lang.Character.UnicodeBlock BUHID;
public static final java.lang.Character.UnicodeBlock TAGBANWA;
public static final java.lang.Character.UnicodeBlock KHMER;
public static final java.lang.Character.UnicodeBlock MONGOLIAN;
public static final java.lang.Character.UnicodeBlock LIMBU;
public static final java.lang.Character.UnicodeBlock TAI_LE;
public static final java.lang.Character.UnicodeBlock KHMER_SYMBOLS;
public static final java.lang.Character.UnicodeBlock PHONETIC_EXTENSIONS;
public static final java.lang.Character.UnicodeBlock LATIN_EXTENDED_ADDITIONAL;
public static final java.lang.Character.UnicodeBlock GREEK_EXTENDED;
public static final java.lang.Character.UnicodeBlock GENERAL_PUNCTUATION;
public static final java.lang.Character.UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS;
public static final java.lang.Character.UnicodeBlock CURRENCY_SYMBOLS;
public static final java.lang.Character.UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS;
public static final java.lang.Character.UnicodeBlock LETTERLIKE_SYMBOLS;
public static final java.lang.Character.UnicodeBlock NUMBER_FORMS;
public static final java.lang.Character.UnicodeBlock ARROWS;
public static final java.lang.Character.UnicodeBlock MATHEMATICAL_OPERATORS;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_TECHNICAL;
public static final java.lang.Character.UnicodeBlock CONTROL_PICTURES;
public static final java.lang.Character.UnicodeBlock OPTICAL_CHARACTER_RECOGNITION;
public static final java.lang.Character.UnicodeBlock ENCLOSED_ALPHANUMERICS;
public static final java.lang.Character.UnicodeBlock BOX_DRAWING;
public static final java.lang.Character.UnicodeBlock BLOCK_ELEMENTS;
public static final java.lang.Character.UnicodeBlock GEOMETRIC_SHAPES;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_SYMBOLS;
public static final java.lang.Character.UnicodeBlock DINGBATS;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTAL_ARROWS_A;
public static final java.lang.Character.UnicodeBlock BRAILLE_PATTERNS;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTAL_ARROWS_B;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS;
public static final java.lang.Character.UnicodeBlock CJK_RADICALS_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock KANGXI_RADICALS;
public static final java.lang.Character.UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS;
public static final java.lang.Character.UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION;
public static final java.lang.Character.UnicodeBlock HIRAGANA;
public static final java.lang.Character.UnicodeBlock KATAKANA;
public static final java.lang.Character.UnicodeBlock BOPOMOFO;
public static final java.lang.Character.UnicodeBlock HANGUL_COMPATIBILITY_JAMO;
public static final java.lang.Character.UnicodeBlock KANBUN;
public static final java.lang.Character.UnicodeBlock BOPOMOFO_EXTENDED;
public static final java.lang.Character.UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS;
public static final java.lang.Character.UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS;
public static final java.lang.Character.UnicodeBlock CJK_COMPATIBILITY;
public static final java.lang.Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
public static final java.lang.Character.UnicodeBlock YIJING_HEXAGRAM_SYMBOLS;
public static final java.lang.Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS;
public static final java.lang.Character.UnicodeBlock YI_SYLLABLES;
public static final java.lang.Character.UnicodeBlock YI_RADICALS;
public static final java.lang.Character.UnicodeBlock HANGUL_SYLLABLES;
public static final java.lang.Character.UnicodeBlock HIGH_SURROGATES;
public static final java.lang.Character.UnicodeBlock HIGH_PRIVATE_USE_SURROGATES;
public static final java.lang.Character.UnicodeBlock LOW_SURROGATES;
public static final java.lang.Character.UnicodeBlock PRIVATE_USE_AREA;
public static final java.lang.Character.UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS;
public static final java.lang.Character.UnicodeBlock ALPHABETIC_PRESENTATION_FORMS;
public static final java.lang.Character.UnicodeBlock ARABIC_PRESENTATION_FORMS_A;
public static final java.lang.Character.UnicodeBlock VARIATION_SELECTORS;
public static final java.lang.Character.UnicodeBlock COMBINING_HALF_MARKS;
public static final java.lang.Character.UnicodeBlock CJK_COMPATIBILITY_FORMS;
public static final java.lang.Character.UnicodeBlock SMALL_FORM_VARIANTS;
public static final java.lang.Character.UnicodeBlock ARABIC_PRESENTATION_FORMS_B;
public static final java.lang.Character.UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS;
public static final java.lang.Character.UnicodeBlock SPECIALS;
public static final java.lang.Character.UnicodeBlock LINEAR_B_SYLLABARY;
public static final java.lang.Character.UnicodeBlock LINEAR_B_IDEOGRAMS;
public static final java.lang.Character.UnicodeBlock AEGEAN_NUMBERS;
public static final java.lang.Character.UnicodeBlock OLD_ITALIC;
public static final java.lang.Character.UnicodeBlock GOTHIC;
public static final java.lang.Character.UnicodeBlock UGARITIC;
public static final java.lang.Character.UnicodeBlock DESERET;
public static final java.lang.Character.UnicodeBlock SHAVIAN;
public static final java.lang.Character.UnicodeBlock OSMANYA;
public static final java.lang.Character.UnicodeBlock CYPRIOT_SYLLABARY;
public static final java.lang.Character.UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS;
public static final java.lang.Character.UnicodeBlock MUSICAL_SYMBOLS;
public static final java.lang.Character.UnicodeBlock TAI_XUAN_JING_SYMBOLS;
public static final java.lang.Character.UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS;
public static final java.lang.Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
public static final java.lang.Character.UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock TAGS;
public static final java.lang.Character.UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B;
static { SURROGATES_AREA = null; BASIC_LATIN = null; LATIN_1_SUPPLEMENT = null; LATIN_EXTENDED_A = null; LATIN_EXTENDED_B = null; IPA_EXTENSIONS = null; SPACING_MODIFIER_LETTERS = null; COMBINING_DIACRITICAL_MARKS = null; GREEK = null; CYRILLIC = null; CYRILLIC_SUPPLEMENTARY = null; ARMENIAN = null; HEBREW = null; ARABIC = null; SYRIAC = null; THAANA = null; DEVANAGARI = null; BENGALI = null; GURMUKHI = null; GUJARATI = null; ORIYA = null; TAMIL = null; TELUGU = null; KANNADA = null; MALAYALAM = null; SINHALA = null; THAI = null; LAO = null; TIBETAN = null; MYANMAR = null; GEORGIAN = null; HANGUL_JAMO = null; ETHIOPIC = null; CHEROKEE = null; UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null; OGHAM = null; RUNIC = null; TAGALOG = null; HANUNOO = null; BUHID = null; TAGBANWA = null; KHMER = null; MONGOLIAN = null; LIMBU = null; TAI_LE = null; KHMER_SYMBOLS = null; PHONETIC_EXTENSIONS = null; LATIN_EXTENDED_ADDITIONAL = null; GREEK_EXTENDED = null; GENERAL_PUNCTUATION = null; SUPERSCRIPTS_AND_SUBSCRIPTS = null; CURRENCY_SYMBOLS = null; COMBINING_MARKS_FOR_SYMBOLS = null; LETTERLIKE_SYMBOLS = null; NUMBER_FORMS = null; ARROWS = null; MATHEMATICAL_OPERATORS = null; MISCELLANEOUS_TECHNICAL = null; CONTROL_PICTURES = null; OPTICAL_CHARACTER_RECOGNITION = null; ENCLOSED_ALPHANUMERICS = null; BOX_DRAWING = null; BLOCK_ELEMENTS = null; GEOMETRIC_SHAPES = null; MISCELLANEOUS_SYMBOLS = null; DINGBATS = null; MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null; SUPPLEMENTAL_ARROWS_A = null; BRAILLE_PATTERNS = null; SUPPLEMENTAL_ARROWS_B = null; MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null; SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null; MISCELLANEOUS_SYMBOLS_AND_ARROWS = null; CJK_RADICALS_SUPPLEMENT = null; KANGXI_RADICALS = null; IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null; CJK_SYMBOLS_AND_PUNCTUATION = null; HIRAGANA = null; KATAKANA = null; BOPOMOFO = null; HANGUL_COMPATIBILITY_JAMO = null; KANBUN = null; BOPOMOFO_EXTENDED = null; KATAKANA_PHONETIC_EXTENSIONS = null; ENCLOSED_CJK_LETTERS_AND_MONTHS = null; CJK_COMPATIBILITY = null; CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null; YIJING_HEXAGRAM_SYMBOLS = null; CJK_UNIFIED_IDEOGRAPHS = null; YI_SYLLABLES = null; YI_RADICALS = null; HANGUL_SYLLABLES = null; HIGH_SURROGATES = null; HIGH_PRIVATE_USE_SURROGATES = null; LOW_SURROGATES = null; PRIVATE_USE_AREA = null; CJK_COMPATIBILITY_IDEOGRAPHS = null; ALPHABETIC_PRESENTATION_FORMS = null; ARABIC_PRESENTATION_FORMS_A = null; VARIATION_SELECTORS = null; COMBINING_HALF_MARKS = null; CJK_COMPATIBILITY_FORMS = null; SMALL_FORM_VARIANTS = null; ARABIC_PRESENTATION_FORMS_B = null; HALFWIDTH_AND_FULLWIDTH_FORMS = null; SPECIALS = null; LINEAR_B_SYLLABARY = null; LINEAR_B_IDEOGRAMS = null; AEGEAN_NUMBERS = null; OLD_ITALIC = null; GOTHIC = null; UGARITIC = null; DESERET = null; SHAVIAN = null; OSMANYA = null; CYPRIOT_SYLLABARY = null; BYZANTINE_MUSICAL_SYMBOLS = null; MUSICAL_SYMBOLS = null; TAI_XUAN_JING_SYMBOLS = null; MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null; CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null; CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null; TAGS = null; VARIATION_SELECTORS_SUPPLEMENT = null; SUPPLEMENTARY_PRIVATE_USE_AREA_A = null; SUPPLEMENTARY_PRIVATE_USE_AREA_B = null; }
}
public  Character(char value) { throw new RuntimeException("Stub!"); }
public  char charValue() { throw new RuntimeException("Stub!"); }
public  int compareTo(java.lang.Character c) { throw new RuntimeException("Stub!"); }
public static  java.lang.Character valueOf(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isValidCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isSupplementaryCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isHighSurrogate(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isLowSurrogate(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isSurrogatePair(char high, char low) { throw new RuntimeException("Stub!"); }
public static  int charCount(int codePoint) { throw new RuntimeException("Stub!"); }
public static  int toCodePoint(char high, char low) { throw new RuntimeException("Stub!"); }
public static  int codePointAt(java.lang.CharSequence seq, int index) { throw new RuntimeException("Stub!"); }
public static  int codePointAt(char[] seq, int index) { throw new RuntimeException("Stub!"); }
public static  int codePointAt(char[] seq, int index, int limit) { throw new RuntimeException("Stub!"); }
public static  int codePointBefore(java.lang.CharSequence seq, int index) { throw new RuntimeException("Stub!"); }
public static  int codePointBefore(char[] seq, int index) { throw new RuntimeException("Stub!"); }
public static  int codePointBefore(char[] seq, int index, int start) { throw new RuntimeException("Stub!"); }
public static  int toChars(int codePoint, char[] dst, int dstIndex) { throw new RuntimeException("Stub!"); }
public static  char[] toChars(int codePoint) { throw new RuntimeException("Stub!"); }
public static  int codePointCount(java.lang.CharSequence seq, int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
public static  int codePointCount(char[] seq, int offset, int count) { throw new RuntimeException("Stub!"); }
public static  int offsetByCodePoints(java.lang.CharSequence seq, int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
public static  int offsetByCodePoints(char[] seq, int start, int count, int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
public static  int digit(char c, int radix) { throw new RuntimeException("Stub!"); }
public static  int digit(int codePoint, int radix) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public static  char forDigit(int digit, int radix) { throw new RuntimeException("Stub!"); }
public static  int getNumericValue(char c) { throw new RuntimeException("Stub!"); }
public static  int getNumericValue(int codePoint) { throw new RuntimeException("Stub!"); }
public static  int getType(char c) { throw new RuntimeException("Stub!"); }
public static  int getType(int codePoint) { throw new RuntimeException("Stub!"); }
public static  byte getDirectionality(char c) { throw new RuntimeException("Stub!"); }
public static  byte getDirectionality(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isMirrored(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isMirrored(int codePoint) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static  boolean isDefined(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isDefined(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isDigit(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isDigit(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isIdentifierIgnorable(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isIdentifierIgnorable(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isISOControl(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isISOControl(int c) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaIdentifierPart(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaIdentifierPart(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaIdentifierStart(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaIdentifierStart(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaLetter(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaLetterOrDigit(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isLetter(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isLetter(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isLetterOrDigit(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isLetterOrDigit(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isLowerCase(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isLowerCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isSpace(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isSpaceChar(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isSpaceChar(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isTitleCase(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isTitleCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isUnicodeIdentifierPart(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isUnicodeIdentifierPart(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isUnicodeIdentifierStart(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isUnicodeIdentifierStart(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isUpperCase(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isUpperCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isWhitespace(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isWhitespace(int codePoint) { throw new RuntimeException("Stub!"); }
public static  char reverseBytes(char c) { throw new RuntimeException("Stub!"); }
public static  char toLowerCase(char c) { throw new RuntimeException("Stub!"); }
public static  int toLowerCase(int codePoint) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  java.lang.String toString(char value) { throw new RuntimeException("Stub!"); }
public static  char toTitleCase(char c) { throw new RuntimeException("Stub!"); }
public static  int toTitleCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  char toUpperCase(char c) { throw new RuntimeException("Stub!"); }
public static  int toUpperCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static final char MIN_VALUE = 0;
public static final char MAX_VALUE = 65535;
public static final int MIN_RADIX = 2;
public static final int MAX_RADIX = 36;
public static final java.lang.Class<java.lang.Character> TYPE;
public static final byte UNASSIGNED = 0;
public static final byte UPPERCASE_LETTER = 1;
public static final byte LOWERCASE_LETTER = 2;
public static final byte TITLECASE_LETTER = 3;
public static final byte MODIFIER_LETTER = 4;
public static final byte OTHER_LETTER = 5;
public static final byte NON_SPACING_MARK = 6;
public static final byte ENCLOSING_MARK = 7;
public static final byte COMBINING_SPACING_MARK = 8;
public static final byte DECIMAL_DIGIT_NUMBER = 9;
public static final byte LETTER_NUMBER = 10;
public static final byte OTHER_NUMBER = 11;
public static final byte SPACE_SEPARATOR = 12;
public static final byte LINE_SEPARATOR = 13;
public static final byte PARAGRAPH_SEPARATOR = 14;
public static final byte CONTROL = 15;
public static final byte FORMAT = 16;
public static final byte PRIVATE_USE = 18;
public static final byte SURROGATE = 19;
public static final byte DASH_PUNCTUATION = 20;
public static final byte START_PUNCTUATION = 21;
public static final byte END_PUNCTUATION = 22;
public static final byte CONNECTOR_PUNCTUATION = 23;
public static final byte OTHER_PUNCTUATION = 24;
public static final byte MATH_SYMBOL = 25;
public static final byte CURRENCY_SYMBOL = 26;
public static final byte MODIFIER_SYMBOL = 27;
public static final byte OTHER_SYMBOL = 28;
public static final byte INITIAL_QUOTE_PUNCTUATION = 29;
public static final byte FINAL_QUOTE_PUNCTUATION = 30;
public static final byte DIRECTIONALITY_UNDEFINED = -1;
public static final byte DIRECTIONALITY_LEFT_TO_RIGHT = 0;
public static final byte DIRECTIONALITY_RIGHT_TO_LEFT = 1;
public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC = 2;
public static final byte DIRECTIONALITY_EUROPEAN_NUMBER = 3;
public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR = 4;
public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR = 5;
public static final byte DIRECTIONALITY_ARABIC_NUMBER = 6;
public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR = 7;
public static final byte DIRECTIONALITY_NONSPACING_MARK = 8;
public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL = 9;
public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR = 10;
public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR = 11;
public static final byte DIRECTIONALITY_WHITESPACE = 12;
public static final byte DIRECTIONALITY_OTHER_NEUTRALS = 13;
public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING = 14;
public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE = 15;
public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING = 16;
public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE = 17;
public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT = 18;
public static final char MIN_HIGH_SURROGATE = 55296;
public static final char MAX_HIGH_SURROGATE = 56319;
public static final char MIN_LOW_SURROGATE = 56320;
public static final char MAX_LOW_SURROGATE = 57343;
public static final char MIN_SURROGATE = 55296;
public static final char MAX_SURROGATE = 57343;
public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
public static final int MIN_CODE_POINT = 0;
public static final int MAX_CODE_POINT = 1114111;
public static final int SIZE = 16;
static { TYPE = null; }
}
