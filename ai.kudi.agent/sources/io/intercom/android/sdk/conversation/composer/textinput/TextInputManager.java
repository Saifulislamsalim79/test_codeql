package io.intercom.android.sdk.conversation.composer.textinput;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.intercom.composer.input.IconProvider;
import com.intercom.composer.input.Input;
import com.intercom.composer.input.text.SendTextCallback;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.conversation.composer.ComposerInputIndentifier;
import io.intercom.android.sdk.conversation.composer.ComposerPresenter;
import io.intercom.android.sdk.conversation.composer.InputDrawableManager;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.MetricsComposerTextWatcher;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
/* loaded from: classes.dex */
public class TextInputManager {
    private final EditText composerText;
    private final Context context;
    private String conversationId;
    private String initialMessage;
    private final ComposerPresenter.Listener listener;
    private final MetricsComposerTextWatcher metricsTextWatcher;
    private final Store<State> store;
    private final Drawable textIcon;
    private final TextInputWatcher textWatcher;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TextInputManager(Context context, LayoutInflater layoutInflater, UserIdentity userIdentity, NexusClient nexusClient, MetricTracker metricTracker, String str, String str2, InputDrawableManager inputDrawableManager, Store store, ComposerPresenter.Listener listener) {
        this.context = context;
        this.listener = listener;
        this.conversationId = str;
        this.initialMessage = str2;
        this.store = store;
        int $i0 = C10110R.C10111drawable.intercom_input_text;
        Drawable $r11 = inputDrawableManager.createDrawable(context, $i0);
        this.textIcon = $r11;
        int $i02 = C10110R.C10113layout.intercom_composer_edit_text;
        View $r12 = layoutInflater.inflate($i02, (ViewGroup) null);
        EditText $r13 = (EditText) $r12;
        this.composerText = $r13;
        String $r10 = userIdentity.getIntercomId();
        Looper $r16 = Looper.getMainLooper();
        Handler r18 = new Handler($r16);
        TextInputWatcher r19 = new TextInputWatcher($r10, nexusClient, store, r18);
        this.textWatcher = r19;
        MetricsComposerTextWatcher r20 = new MetricsComposerTextWatcher(metricTracker);
        this.metricsTextWatcher = r20;
        r20.setConversationId(str);
        EditText $r132 = this.composerText;
        TextInputWatcher $r14 = this.textWatcher;
        $r132.addTextChangedListener($r14);
        EditText $r133 = this.composerText;
        TextWatcher $r17 = this.metricsTextWatcher;
        TextWatcher r21 = $r17;
        $r133.addTextChangedListener(r21);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void cleanup() {
        Store $r2 = this.store;
        String $r3 = this.conversationId;
        Action $r1 = Actions.composerCleared($r3);
        $r2.dispatch($r1);
        EditText $r4 = this.composerText;
        TextInputWatcher $r5 = this.textWatcher;
        $r4.removeTextChangedListener($r5);
        EditText $r42 = this.composerText;
        TextWatcher $r6 = this.metricsTextWatcher;
        TextWatcher r7 = $r6;
        $r42.removeTextChangedListener(r7);
        EditText $r43 = this.composerText;
        $r43.clearFocus();
        MetricsComposerTextWatcher $r62 = this.metricsTextWatcher;
        $r62.reset();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Input createInput() {
        String $r7;
        String $r2 = this.conversationId;
        boolean $z0 = TextUtils.isEmpty($r2);
        if ($z0) {
            Context $r5 = this.context;
            Resources $r6 = $r5.getResources();
            int $i0 = C10110R.string.intercom_start_conversation;
            $r7 = $r6.getString($i0);
        } else {
            Context $r52 = this.context;
            Resources $r62 = $r52.getResources();
            int $i02 = C10110R.string.intercom_reply_to_conversation;
            $r7 = $r62.getString($i02);
        }
        IconProvider iconProvider = new IconProvider() { // from class: io.intercom.android.sdk.conversation.composer.textinput.TextInputManager.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.composer.input.IconProvider
            public Drawable getIconDrawable(String str, Context context) {
                TextInputManager $r4 = TextInputManager.this;
                Drawable $r22 = $r4.textIcon;
                return $r22;
            }
        };
        String $r22 = this.initialMessage;
        SendTextCallback sendTextCallback = new SendTextCallback() { // from class: io.intercom.android.sdk.conversation.composer.textinput.TextInputManager.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.composer.input.text.SendTextCallback
            public void textToBeSent(Input input, CharSequence charSequence) {
                TextInputManager $r3 = TextInputManager.this;
                ComposerPresenter.Listener $r4 = $r3.listener;
                $r4.onSendButtonPressed(charSequence);
                TextInputManager $r32 = TextInputManager.this;
                Store $r53 = $r32.store;
                Action $r63 = Actions.composerSendButtonPressed();
                $r53.dispatch($r63);
            }
        };
        EditText $r4 = this.composerText;
        MessengerTextInput r11 = new MessengerTextInput(ComposerInputIndentifier.TEXT, iconProvider, $r7, $r22, sendTextCallback, $r4);
        return r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void requestFocus() {
        EditText $r1 = this.composerText;
        $r1.requestFocus();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setConversationId(String str) {
        TextInputWatcher $r2 = this.textWatcher;
        $r2.setConversationId(str);
        MetricsComposerTextWatcher $r3 = this.metricsTextWatcher;
        $r3.setConversationId(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setHint(int i) {
        EditText $r1 = this.composerText;
        $r1.setHint(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateMaxLines() {
        EditText $r1 = this.composerText;
        Context $r2 = this.context;
        Resources $r3 = $r2.getResources();
        int $i0 = C10110R.integer.intercom_max_composer_lines;
        $r1.setMaxLines($r3.getInteger($i0));
    }
}
