package io.intercom.android.sdk.utilities;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public final class Phrase {
    private static final int EOF = 0;
    private char curChar;
    private int curCharIndex;
    private CharSequence formatted;
    private Token head;
    private final Set<String> keys = new HashSet();
    private final Map<String, CharSequence> keysToValues = new HashMap();
    private final CharSequence pattern;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class KeyToken extends Token {
        private final String key;
        private CharSequence value;

        KeyToken(Token token, String str) {
            super(token);
            this.key = str;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            this.value = map.get(this.key);
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, this.key.length() + formattedStart + 2, this.value);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return this.value.length();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class LeftCurlyBracketToken extends Token {
        LeftCurlyBracketToken(Token token) {
            super(token);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, formattedStart + 2, "{");
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class TextToken extends Token {
        private final int textLength;

        TextToken(Token token, int i) {
            super(token);
            this.textLength = i;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return this.textLength;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class Token {
        Token next;
        private final Token prev;

        protected Token(Token token) {
            this.prev = token;
            if (token != null) {
                token.next = this;
            }
        }

        abstract void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map);

        abstract int getFormattedLength();

        final int getFormattedStart() {
            Token token = this.prev;
            if (token == null) {
                return 0;
            }
            return token.getFormattedStart() + this.prev.getFormattedLength();
        }
    }

    private Phrase(CharSequence charSequence) {
        this.curChar = charSequence.length() > 0 ? charSequence.charAt(0) : (char) 0;
        this.pattern = charSequence;
        Token token = null;
        while (true) {
            token = token(token);
            if (token == null) {
                return;
            }
            if (this.head == null) {
                this.head = token;
            }
        }
    }

    private void consume() {
        int i = this.curCharIndex + 1;
        this.curCharIndex = i;
        this.curChar = i == this.pattern.length() ? (char) 0 : this.pattern.charAt(this.curCharIndex);
    }

    public static Phrase from(Fragment fragment, int i) {
        return from(fragment.getResources(), i);
    }

    private KeyToken key(Token token) {
        char c;
        char c2;
        StringBuilder sb = new StringBuilder();
        consume();
        while (true) {
            char c3 = this.curChar;
            if ((c3 < 'a' || c3 > 'z') && (((c = this.curChar) < 'A' || c > 'Z') && (c2 = this.curChar) != '_')) {
                break;
            }
            sb.append(this.curChar);
            consume();
        }
        if (c2 == '}') {
            consume();
            if (sb.length() != 0) {
                String sb2 = sb.toString();
                this.keys.add(sb2);
                return new KeyToken(token, sb2);
            }
            throw new IllegalArgumentException("Empty key: {} in '" + ((Object) this.pattern) + "'");
        }
        throw new IllegalArgumentException("Missing closing brace: } in '" + ((Object) this.pattern) + "'");
    }

    private LeftCurlyBracketToken leftCurlyBracket(Token token) {
        consume();
        consume();
        return new LeftCurlyBracketToken(token);
    }

    private char lookahead() {
        if (this.curCharIndex < this.pattern.length() - 1) {
            return this.pattern.charAt(this.curCharIndex + 1);
        }
        return (char) 0;
    }

    private TextToken text(Token token) {
        int i = this.curCharIndex;
        while (true) {
            char c = this.curChar;
            if (c == '{' || c == 0) {
                break;
            }
            consume();
        }
        return new TextToken(token, this.curCharIndex - i);
    }

    private Token token(Token token) {
        char c = this.curChar;
        if (c == 0) {
            return null;
        }
        if (c == '{') {
            char lookahead = lookahead();
            if (lookahead == '{') {
                return leftCurlyBracket(token);
            }
            if (lookahead >= 'a' && lookahead <= 'z') {
                return key(token);
            }
            throw new IllegalArgumentException("Unexpected character '" + lookahead + "'; expected key in '" + ((Object) this.pattern) + "'");
        }
        return text(token);
    }

    public CharSequence format() {
        if (this.formatted == null) {
            if (this.keysToValues.keySet().containsAll(this.keys)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.pattern);
                for (Token token = this.head; token != null; token = token.next) {
                    token.expand(spannableStringBuilder, this.keysToValues);
                }
                this.formatted = spannableStringBuilder;
            } else {
                HashSet hashSet = new HashSet(this.keys);
                hashSet.removeAll(this.keysToValues.keySet());
                throw new IllegalArgumentException("Missing keys: " + hashSet + " in '" + ((Object) this.pattern) + "'");
            }
        }
        return this.formatted;
    }

    public void into(TextView textView) {
        if (textView != null) {
            textView.setText(format());
            return;
        }
        throw new IllegalArgumentException("TextView must not be null.");
    }

    public Phrase put(String str, CharSequence charSequence) {
        if (!this.keys.contains(str)) {
            throw new IllegalArgumentException("Key '" + str + "' not found in '" + ((Object) this.pattern) + "'");
        } else if (charSequence != null) {
            this.keysToValues.put(str, charSequence);
            this.formatted = null;
            return this;
        } else {
            throw new IllegalArgumentException("Null value for '" + str + "' in '" + ((Object) this.pattern) + "'");
        }
    }

    public Phrase putOptional(String str, CharSequence charSequence) {
        return this.keys.contains(str) ? put(str, charSequence) : this;
    }

    public String toString() {
        return this.pattern.toString();
    }

    public static Phrase from(View view, int i) {
        return from(view.getResources(), i);
    }

    public Phrase putOptional(String str, int i) {
        return this.keys.contains(str) ? put(str, i) : this;
    }

    public static Phrase from(Context context, int i) {
        return from(context.getResources(), i);
    }

    public static Phrase from(Resources resources, int i) {
        return from(resources.getText(i));
    }

    public static Phrase from(CharSequence charSequence) {
        return new Phrase(charSequence);
    }

    public Phrase put(String str, int i) {
        return put(str, Integer.toString(i));
    }
}
