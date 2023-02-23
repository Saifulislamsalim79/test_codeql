package io.intercom.android.sdk.homescreen;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes.dex */
public class RecentConversationCardViewHolder extends BaseConversationCardViewHolder {
    private final HomeClickListener clickListener;
    private final LinearLayout inboxLayout;
    private final TextView newConversationButton;
    View.OnClickListener onConversationClicked;
    private final C10486i requestManager;
    private final TextView seePreviousButton;
    private final TimeFormatter timeFormatter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RecentConversationCardViewHolder(View view, TimeFormatter timeFormatter, Provider provider, C10486i c10486i, HomeClickListener homeClickListener) {
        super(view, provider, homeClickListener);
        this.onConversationClicked = new View.OnClickListener() { // from class: io.intercom.android.sdk.homescreen.RecentConversationCardViewHolder.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object $r2 = view2.getTag();
                boolean $z0 = $r2 instanceof Conversation;
                if ($z0) {
                    Object $r22 = view2.getTag();
                    Conversation $r3 = (Conversation) $r22;
                    RecentConversationCardViewHolder $r4 = RecentConversationCardViewHolder.this;
                    HomeClickListener $r5 = $r4.clickListener;
                    $r5.onConversationClicked($r3);
                }
            }
        };
        this.timeFormatter = timeFormatter;
        this.requestManager = c10486i;
        this.clickListener = homeClickListener;
        int $i0 = C10110R.C10112id.inbox_layout;
        View $r7 = view.findViewById($i0);
        LinearLayout $r8 = (LinearLayout) $r7;
        this.inboxLayout = $r8;
        int $i02 = C10110R.C10112id.new_conversation_button;
        View $r72 = view.findViewById($i02);
        TextView $r9 = (TextView) $r72;
        this.newConversationButton = $r9;
        int $i03 = C10110R.C10112id.see_previous;
        View $r73 = view.findViewById($i03);
        TextView $r92 = (TextView) $r73;
        this.seePreviousButton = $r92;
        TextView $r93 = this.newConversationButton;
        View.OnClickListener $r10 = this.onNewConversationClicked;
        $r93.setOnClickListener($r10);
        TextView $r94 = this.seePreviousButton;
        View.OnClickListener $r102 = this.onSeePreviousClicked;
        $r94.setOnClickListener($r102);
        int $i04 = C10110R.C10112id.recent_conversation_card_layout;
        View $r3 = view.findViewById($i04);
        View $r11 = (ConstraintLayout) $r3;
        View $r32 = $r11;
        applyCardBorderStyle($r32);
        applyNewConversationButtonStyle();
        TextView $r95 = this.seePreviousButton;
        applyAllConversationButtonStyle($r95);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void applyNewConversationButtonStyle() {
        TextView $r1 = this.newConversationButton;
        FontUtils.setRobotoMediumTypeface($r1);
        Provider $r2 = this.appConfigProvider;
        Object $r3 = $r2.get();
        AppConfig $r4 = (AppConfig) $r3;
        int $i1 = $r4.getPrimaryColor();
        TextView $r12 = this.newConversationButton;
        Context $r5 = $r12.getContext();
        boolean $z0 = $r4.primaryColorRenderDarkText();
        if ($z0) {
            TextView $r13 = this.newConversationButton;
            updateButtonBackgroundColor($r13, $i1);
        } else {
            TextView $r14 = this.newConversationButton;
            Drawable $r6 = $r14.getBackground();
            BackgroundUtils.setRippleButtonStroke($r5, $r6, C10110R.C10112id.background, $i1);
        }
        int $i0 = ColorUtils.primaryOrDarkColor($r5, $r4);
        TextView $r15 = this.newConversationButton;
        updateLeftDrawableColor($r15, $i0);
        TextView $r16 = this.newConversationButton;
        $r16.setTextColor($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View createDivider(Context context) {
        View $r1 = new View(context);
        LinearLayout.LayoutParams $r3 = new LinearLayout.LayoutParams(-1, -2);
        Resources $r4 = context.getResources();
        int $i0 = $r4.getDimensionPixelSize(C10110R.dimen.intercom_conversation_card_padding);
        $r3.setMargins($i0, 0, $i0, 0);
        $r1.setLayoutParams($r3);
        Drawable $r5 = C1335a.m36322f(context, C10110R.C10111drawable.intercom_list_divider);
        BackgroundUtils.setBackground($r1, $r5);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bindConversationCard(io.intercom.android.sdk.homescreen.ConversationCard r31, io.intercom.android.sdk.identity.UserIdentity r32, io.intercom.android.sdk.identity.AppConfig r33, io.intercom.android.sdk.models.TeamPresence r34) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.homescreen.RecentConversationCardViewHolder.bindConversationCard(io.intercom.android.sdk.homescreen.ConversationCard, io.intercom.android.sdk.identity.UserIdentity, io.intercom.android.sdk.identity.AppConfig, io.intercom.android.sdk.models.TeamPresence):void");
    }
}
