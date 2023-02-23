package io.intercom.android.sdk.conversation.composer;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.core.content.C1335a;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.intercom.composer.ComposerFragment;
import com.intercom.composer.ComposerHost;
import com.intercom.composer.OnInputSelectedListener;
import com.intercom.composer.input.Input;
import com.intercom.input.gallery.GalleryImage;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager;
import io.intercom.android.sdk.conversation.composer.textinput.TextInputManager;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ComposerPresenter implements OnInputSelectedListener {
    private static final int SELECT_INPUT_DELAY_MS = 100;
    private final ComposerFragment composerFragment;
    private final FrameLayout composerLayout;
    private String conversationId;
    private final Runnable defaultInputRunnable;
    private final GalleryInputManager galleryInputManager;
    private final Handler handler;
    private final InputDrawableManager inputDrawableManager;
    InputProvider inputProvider;
    private final MetricTracker metricTracker;
    private final Store<State> store;
    private final TextInputManager textInputManager;

    /* loaded from: classes.dex */
    public interface Listener {
        void onRemoteImageSelected(GalleryImage galleryImage);

        void onSendButtonPressed(CharSequence charSequence);

        void onUploadImageSelected(GalleryImage galleryImage);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ComposerPresenter(Listener listener, FrameLayout frameLayout, FragmentManager fragmentManager, LayoutInflater layoutInflater, NexusClient nexusClient, UserIdentity userIdentity, Provider provider, MetricTracker metricTracker, String str, String str2, Store store, Context context, int $i0) {
        Looper $r14 = Looper.getMainLooper();
        Handler r27 = new Handler($r14);
        this.handler = r27;
        this.defaultInputRunnable = new Runnable() { // from class: io.intercom.android.sdk.conversation.composer.ComposerPresenter.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public void run() {
                ComposerPresenter $r2 = ComposerPresenter.this;
                ComposerFragment $r1 = $r2.composerFragment;
                $r1.selectInput(ComposerInputIndentifier.TEXT, true);
            }
        };
        this.store = store;
        this.composerLayout = frameLayout;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        Object $r16 = provider.get();
        AppConfig $r17 = (AppConfig) $r16;
        boolean $z0 = $r17.primaryColorRenderDarkText();
        if ($z0) {
            int $i02 = C10110R.color.intercom_black;
            $i0 = C1335a.m36324d(context, $i02);
        }
        InputDrawableManager r29 = new InputDrawableManager(context, $i0);
        this.inputDrawableManager = r29;
        String $r20 = ComposerFragment.class.getName();
        Fragment $r21 = fragmentManager.m35938g0($r20);
        boolean $z02 = $r21 instanceof ComposerFragment;
        if ($z02) {
            ComposerFragment $r22 = (ComposerFragment) $r21;
            this.composerFragment = $r22;
        } else {
            ComposerFragment $r222 = ComposerFragment.newInstance(null, false, $i0);
            this.composerFragment = $r222;
            AbstractC1449b0 $r23 = fragmentManager.m35924l();
            int $i03 = C10110R.C10112id.composer_container;
            Fragment $r223 = this.composerFragment;
            String $r202 = ComposerFragment.class.getName();
            $r23.m35820s($i03, $r223, $r202);
            $r23.mo35805i();
        }
        ComposerFragment $r224 = this.composerFragment;
        $r224.setComposerHost(new ComposerHost() { // from class: io.intercom.android.sdk.conversation.composer.ComposerPresenter.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.composer.ComposerHost
            public List getInputs() {
                ComposerPresenter $r2 = ComposerPresenter.this;
                InputProvider $r3 = $r2.inputProvider;
                List $r1 = $r3.getInputs();
                return $r1;
            }
        });
        ComposerFragment $r225 = this.composerFragment;
        $r225.setOnInputSelectedListener(this);
        InputDrawableManager $r18 = this.inputDrawableManager;
        TextInputManager r31 = new TextInputManager(context, layoutInflater, userIdentity, nexusClient, metricTracker, str, str2, $r18, store, listener);
        this.textInputManager = r31;
        InputDrawableManager $r182 = this.inputDrawableManager;
        GalleryInputManager r32 = new GalleryInputManager(context, $r182, listener, metricTracker, str);
        this.galleryInputManager = r32;
        int $i04 = Build.VERSION.SDK_INT;
        boolean $z03 = true;
        if ($i04 >= 16 && $i04 < 23) {
            int $i05 = C1335a.m36327a(context, "android.permission.READ_EXTERNAL_STORAGE");
            if ($i05 != 0) {
                $z03 = false;
            }
        }
        Object $r162 = provider.get();
        AppConfig $r172 = (AppConfig) $r162;
        setUpInputs(fragmentManager, $z03, $r172);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void addInputsToProvider(List list) {
        InputProvider $r2 = this.inputProvider;
        $r2.addInputs(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpInputs(FragmentManager fragmentManager, boolean z, AppConfig appConfig) {
        ArrayList $r1 = new ArrayList();
        TextInputManager $r4 = this.textInputManager;
        Input $r5 = $r4.createInput();
        $r1.add($r5);
        boolean $z1 = appConfig.isGifsEnabled();
        if ($z1) {
            GalleryInputManager $r6 = this.galleryInputManager;
            Input $r52 = $r6.createGifInput();
            $r1.add($r52);
        }
        if (z) {
            boolean $z0 = appConfig.isAttachmentsEnabled();
            if ($z0) {
                GalleryInputManager $r62 = this.galleryInputManager;
                Input $r53 = $r62.createGalleryInput();
                $r1.add($r53);
            }
        }
        String $r8 = InputProvider.class.getName();
        Fragment $r9 = fragmentManager.m35938g0($r8);
        if ($r9 == null) {
            this.inputProvider = new InputProvider();
            addInputsToProvider($r1);
            AbstractC1449b0 $r11 = fragmentManager.m35924l();
            InputProvider $r10 = this.inputProvider;
            String $r82 = InputProvider.class.getName();
            $r11.m35826e($r10, $r82);
            $r11.mo35805i();
            return;
        }
        InputProvider $r102 = (InputProvider) $r9;
        this.inputProvider = $r102;
        List $r12 = $r102.getInputs();
        boolean $z02 = $r12.isEmpty();
        if ($z02) {
            addInputsToProvider($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void cleanup() {
        TextInputManager $r1 = this.textInputManager;
        $r1.cleanup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void hideComposer() {
        FrameLayout $r1 = this.composerLayout;
        $r1.setVisibility(8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isOpen() {
        ComposerFragment $r1 = this.composerFragment;
        boolean $z0 = $r1.isOpen();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        ComposerFragment $r1 = this.composerFragment;
        $r1.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.composer.OnInputSelectedListener
    public void onInputSelected(Input input) {
        Store $r2 = this.store;
        Action $r3 = Actions.composerInputChanged();
        $r2.dispatch($r3);
        MetricTracker $r4 = this.metricTracker;
        String $r5 = this.conversationId;
        String $r6 = input.getUniqueIdentifier();
        $r4.clickedInput($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void requestFocus() {
        TextInputManager $r1 = this.textInputManager;
        $r1.requestFocus();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void returnToDefaultInput() {
        Handler $r1 = this.handler;
        Runnable $r2 = this.defaultInputRunnable;
        $r1.postDelayed($r2, 100L);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setConversationId(String str) {
        this.conversationId = str;
        TextInputManager $r2 = this.textInputManager;
        $r2.setConversationId(str);
        GalleryInputManager $r3 = this.galleryInputManager;
        $r3.setConversationId(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setHint(int i) {
        TextInputManager $r1 = this.textInputManager;
        $r1.setHint(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showComposer() {
        FrameLayout $r1 = this.composerLayout;
        $r1.setVisibility(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateMaxLines() {
        TextInputManager $r1 = this.textInputManager;
        $r1.updateMaxLines();
    }
}
