package io.intercom.android.sdk.conversation;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.views.IntercomLinkView;
/* loaded from: classes.dex */
public class IntercomLinkPresenter {
    private static final String SOLUTION_LIVE_CHAT = "live_chat";
    private final Provider<AppConfig> appConfigProvider;
    private final String appId;
    private final String conversationId;
    private final boolean fromHomeScreen;
    final IntercomLinkView intercomLinkView;
    private final FeedbackDialog outputStream;
    private final String userId;
    private String solution = SOLUTION_LIVE_CHAT;
    private boolean wasAtBottom = false;

    /* loaded from: classes.dex */
    public interface IntercomLinkHost {
        void addBottomPadding(int i);

        boolean isAtBottom();
    }

    public IntercomLinkPresenter(IntercomLinkView intercomLinkView, Provider provider, FeedbackDialog feedbackDialog, String str, String str2, String str3, boolean z) {
        this.intercomLinkView = intercomLinkView;
        this.appConfigProvider = provider;
        this.outputStream = feedbackDialog;
        this.conversationId = str;
        this.appId = str2;
        this.userId = str3;
        this.fromHomeScreen = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onProfileScrolled(View view) {
        boolean $z0 = shouldShowIntercomLink();
        if ($z0 && view != null) {
            IntercomLinkView $r2 = this.intercomLinkView;
            $r2.hideIfIntersectedOrShow(view);
        }
    }

    public void setSolution(String str) {
        this.solution = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setup(IntercomLinkHost intercomLinkHost) {
        TextView $r2 = this.intercomLinkView;
        TextView r7 = $r2;
        r7.setAlpha(0.0f);
        boolean $z0 = shouldShowIntercomLink();
        if ($z0) {
            TextView $r22 = this.intercomLinkView;
            TextView r72 = $r22;
            Resources $r3 = r72.getResources();
            int $i1 = C10110R.dimen.intercom_link_height;
            int $i12 = $r3.getDimensionPixelSize($i1);
            int $i0 = C10110R.dimen.intercom_link_text_padding;
            intercomLinkHost.addBottomPadding($i12 + ($r3.getDimensionPixelSize($i0) * 2));
            TextView $r23 = this.intercomLinkView;
            TextView r73 = $r23;
            r73.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.conversation.IntercomLinkPresenter.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TextView $r32 = IntercomLinkPresenter.this.intercomLinkView;
                    TextView r9 = $r32;
                    float $f0 = r9.getAlpha();
                    if ($f0 == 1.0f) {
                        IntercomLinkPresenter $r24 = IntercomLinkPresenter.this;
                        IntercomLinkView $r33 = $r24.intercomLinkView;
                        Provider $r4 = $r24.appConfigProvider;
                        FeedbackDialog $r5 = IntercomLinkPresenter.this.outputStream;
                        boolean $z02 = IntercomLinkPresenter.this.fromHomeScreen;
                        String $r6 = IntercomLinkPresenter.this.appId;
                        String $r7 = IntercomLinkPresenter.this.userId;
                        String $r8 = IntercomLinkPresenter.this.solution;
                        $r33.followIntercomLink($r4, $r5, $z02, $r6, $r7, $r8);
                    }
                }
            });
            String $r5 = this.conversationId;
            boolean $z02 = $r5.isEmpty();
            if ($z02) {
                IntercomLinkView $r24 = this.intercomLinkView;
                $r24.show();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean shouldShowIntercomLink() {
        Provider $r1 = this.appConfigProvider;
        Object $r2 = $r1.get();
        AppConfig $r3 = (AppConfig) $r2;
        boolean $z0 = $r3.shouldShowIntercomLink();
        return $z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateIntercomLink(IntercomLinkHost intercomLinkHost) {
        if (shouldShowIntercomLink()) {
            boolean $z0 = intercomLinkHost.isAtBottom();
            if ($z0) {
                boolean $z1 = this.wasAtBottom;
                if (!$z1) {
                    IntercomLinkView $r2 = this.intercomLinkView;
                    $r2.show();
                    this.wasAtBottom = intercomLinkHost.isAtBottom();
                }
            }
            boolean $z12 = this.wasAtBottom;
            if ($z12 && !$z0) {
                IntercomLinkView $r22 = this.intercomLinkView;
                $r22.hide();
            }
            this.wasAtBottom = intercomLinkHost.isAtBottom();
        }
    }
}
