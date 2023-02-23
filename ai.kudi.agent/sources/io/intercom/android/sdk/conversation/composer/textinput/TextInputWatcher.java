package io.intercom.android.sdk.conversation.composer.textinput;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.nexus.NexusEvent;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes.dex */
class TextInputWatcher implements TextWatcher {
    private static final long IS_TYPING_DELAY = 1000;
    private final Handler handler;
    private final NexusClient nexusClient;
    private final Store<State> store;
    private final String userId;
    private String conversationId = "";
    boolean shouldSendIsTyping = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextInputWatcher(String str, NexusClient nexusClient, Store store, Handler handler) {
        this.userId = str;
        this.nexusClient = nexusClient;
        this.store = store;
        this.handler = handler;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        boolean $z0 = this.shouldSendIsTyping;
        if ($z0) {
            this.shouldSendIsTyping = false;
            Handler $r2 = this.handler;
            $r2.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.conversation.composer.textinput.TextInputWatcher.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public void run() {
                    TextInputWatcher $r1 = TextInputWatcher.this;
                    $r1.shouldSendIsTyping = true;
                }
            }, IS_TYPING_DELAY);
            NexusClient $r4 = this.nexusClient;
            String $r5 = this.conversationId;
            String $r6 = this.userId;
            NexusEvent $r7 = NexusEvent.getUserIsTypingEvent($r5, $r6);
            $r4.fire($r7);
            int $i0 = editable.length();
            if ($i0 == 0) {
                Store $r8 = this.store;
                String $r52 = this.conversationId;
                Action $r9 = Actions.composerCleared($r52);
                $r8.dispatch($r9);
                return;
            }
            Store $r82 = this.store;
            String $r53 = this.conversationId;
            Action $r92 = Actions.composerTypedIn($r53);
            $r82.dispatch($r92);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setConversationId(String str) {
        this.conversationId = str;
    }
}
