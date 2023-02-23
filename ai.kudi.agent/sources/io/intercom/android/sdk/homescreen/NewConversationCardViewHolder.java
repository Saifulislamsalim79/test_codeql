package io.intercom.android.sdk.homescreen;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1265d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.views.OfficeHoursTextView;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.List;
/* loaded from: classes.dex */
public class NewConversationCardViewHolder extends BaseConversationCardViewHolder {
    private final FrameLayout avatarLayout;
    private final ConstraintLayout constraintLayout;
    private final Context context;
    private int homeScreenWidth;
    private final OfficeHoursTextView officeHoursView;
    private final Resources resources;
    private final TextView seePreviousButton;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NewConversationCardViewHolder(View view, Provider provider, HomeClickListener homeClickListener) {
        super(view, provider, homeClickListener);
        int $i0 = C10110R.C10112id.new_conversation_button;
        View $r4 = view.findViewById($i0);
        TextView $r5 = (TextView) $r4;
        int $i02 = C10110R.C10112id.avatar_layout;
        View $r42 = view.findViewById($i02);
        FrameLayout $r6 = (FrameLayout) $r42;
        this.avatarLayout = $r6;
        int $i03 = C10110R.C10112id.new_conversation_card_layout;
        View $r43 = view.findViewById($i03);
        LinearLayout $r7 = (LinearLayout) $r43;
        int $i04 = C10110R.C10112id.office_hours;
        View $r44 = view.findViewById($i04);
        OfficeHoursTextView $r8 = (OfficeHoursTextView) $r44;
        this.officeHoursView = $r8;
        int $i05 = C10110R.C10112id.constraint_layout;
        View $r45 = view.findViewById($i05);
        ConstraintLayout $r9 = (ConstraintLayout) $r45;
        this.constraintLayout = $r9;
        int $i06 = C10110R.C10112id.see_previous;
        View $r1 = view.findViewById($i06);
        TextView $r10 = (TextView) $r1;
        this.seePreviousButton = $r10;
        Context $r11 = $r7.getContext();
        this.context = $r11;
        Resources $r12 = $r11.getResources();
        this.resources = $r12;
        int $i07 = getHomeScreenWidth();
        this.homeScreenWidth = $i07;
        View.OnClickListener $r13 = this.onNewConversationClicked;
        $r5.setOnClickListener($r13);
        TextView $r102 = this.seePreviousButton;
        View.OnClickListener $r132 = this.onSeePreviousClicked;
        $r102.setOnClickListener($r132);
        applyCardBorderStyle($r7);
        applyNewConversationButtonStyle($r5);
        applyAllConversationButtonStyle(this.seePreviousButton);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void applyNewConversationButtonStyle(TextView textView) {
        FontUtils.setRobotoMediumTypeface(textView);
        Provider $r3 = this.appConfigProvider;
        Object $r4 = $r3.get();
        AppConfig $r5 = (AppConfig) $r4;
        updateButtonBackgroundColor(textView, $r5.getPrimaryColor());
        Provider $r32 = this.appConfigProvider;
        Object $r42 = $r32.get();
        AppConfig $r52 = (AppConfig) $r42;
        boolean $z0 = $r52.primaryColorRenderDarkText();
        Context $r2 = this.context;
        int $i0 = ColorUtils.whiteOrDarkColor($r2, $z0);
        textView.setTextColor($i0);
        updateLeftDrawableColor(textView, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void displayAvatars(java.util.List r23, io.intercom.com.bumptech.glide.C10486i r24) {
        /*
            r22 = this;
            r0 = r22
            android.content.res.Resources r3 = r0.resources
            int r4 = io.intercom.android.sdk.C10110R.dimen.intercom_conversation_card_padding
            int r5 = r3.getDimensionPixelOffset(r4)
            r0 = r22
            android.content.res.Resources r3 = r0.resources
            int r4 = io.intercom.android.sdk.C10110R.dimen.intercom_home_card_margin
            int r4 = r3.getDimensionPixelOffset(r4)
            r0 = r22
            int r6 = r0.homeScreenWidth
            int r5 = r5 * 2
            int r5 = r6 - r5
            int r4 = r4 * 2
            int r4 = r5 - r4
            r0 = r22
            android.content.Context r7 = r0.context
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r7)
            r5 = 0
        L29:
            r0 = r23
            int r6 = r0.size()
            if (r5 >= r6) goto L83
            int r6 = io.intercom.android.sdk.C10110R.C10113layout.intercom_view_conversation_card_avatar
            r0 = r22
            android.widget.FrameLayout r9 = r0.avatarLayout
            r11 = 0
            android.view.View r10 = r8.inflate(r6, r9, r11)
            int r6 = io.intercom.android.sdk.C10110R.C10112id.avatar_view
            android.view.View r10 = r10.findViewById(r6)
            r13 = r10
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12 = r13
            r0 = r22
            boolean r14 = r0.updateLeftMarginForIndex(r12, r5, r4)
            if (r14 == 0) goto L83
            r0 = r23
            java.lang.Object r15 = r0.get(r5)
            r17 = r15
            io.intercom.android.sdk.models.Participant r17 = (io.intercom.android.sdk.models.Participant) r17
            r16 = r17
            r0 = r16
            io.intercom.android.sdk.models.Avatar r18 = r0.getAvatar()
            r0 = r22
            io.intercom.android.sdk.Provider<io.intercom.android.sdk.identity.AppConfig> r0 = r0.appConfigProvider
            r19 = r0
            java.lang.Object r15 = r0.get()
            r21 = r15
            io.intercom.android.sdk.identity.AppConfig r21 = (io.intercom.android.sdk.identity.AppConfig) r21
            r20 = r21
            r0 = r18
            r1 = r20
            r2 = r24
            io.intercom.android.sdk.utilities.AvatarUtils.loadAvatarIntoView(r0, r12, r1, r2)
            r0 = r22
            android.widget.FrameLayout r9 = r0.avatarLayout
            r9.addView(r12)
            int r5 = r5 + 1
            goto L29
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.homescreen.NewConversationCardViewHolder.displayAvatars(java.util.List, io.intercom.com.bumptech.glide.i):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int getHomeScreenWidth() {
        Resources $r1 = this.resources;
        DisplayMetrics $r2 = $r1.getDisplayMetrics();
        int $i1 = $r2.widthPixels;
        Resources $r12 = this.resources;
        int $i0 = C10110R.bool.intercom_is_two_pane;
        boolean $z0 = $r12.getBoolean($i0);
        if ($z0) {
            TypedValue $r3 = new TypedValue();
            Resources $r13 = this.resources;
            int $i02 = C10110R.dimen.intercom_two_pane_inbox_percentage;
            $r13.getValue($i02, $r3, true);
            float $f0 = $i1;
            float $f1 = $r3.getFloat();
            return (int) ($f0 * $f1);
        }
        return $i1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean updateLeftMarginForIndex(ImageView imageView, int i, int i2) {
        ViewGroup.LayoutParams $r2 = imageView.getLayoutParams();
        FrameLayout.LayoutParams $r3 = (FrameLayout.LayoutParams) $r2;
        Context $r4 = imageView.getContext();
        Resources $r5 = $r4.getResources();
        int $i2 = C10110R.dimen.intercom_conversation_card_avatar_margin;
        int $i1 = i * $r5.getDimensionPixelSize($i2);
        int $i22 = C10110R.dimen.intercom_conversation_card_avatar_size;
        if ($r5.getDimensionPixelSize($i22) + $i1 <= i2) {
            ((ViewGroup.MarginLayoutParams) $r3).leftMargin = $i1;
            imageView.setLayoutParams($r3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void updateNewConversationButtonPosition(int i) {
        C1265d $r1 = new C1265d();
        ConstraintLayout $r2 = this.constraintLayout;
        $r1.m36603g($r2);
        int $i0 = C10110R.C10112id.avatar_layout;
        int $i1 = C10110R.C10112id.new_conversation_button;
        int $i2 = C10110R.C10112id.see_previous;
        Resources $r3 = this.resources;
        int $i3 = $r3.getDimensionPixelSize(C10110R.dimen.intercom_home_new_conversation_button_margin);
        if (i <= 2) {
            $r1.m36600j($i1, 1, $i0, 2, $i3);
            $r1.m36600j($i1, 3, $i0, 3, 0);
            $r1.m36600j($i1, 4, $i0, 4, 0);
            $r1.m36600j($i2, 3, $i0, 4, $i3);
        } else {
            $r1.m36600j($i1, 3, $i0, 4, $i3);
            $r1.m36600j($i2, 1, $i1, 2, $i3);
            $r1.m36601i($i2, 5, $i1, 5);
        }
        ConstraintLayout $r22 = this.constraintLayout;
        $r1.m36607c($r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void bindTeamPresence(TeamPresence teamPresence, C10486i c10486i, ConversationCard conversationCard) {
        boolean $z0 = teamPresence.isEmpty();
        if ($z0) {
            TextView $r4 = this.officeHoursView;
            TextView $r6 = $r4;
            $r6.setVisibility(8);
            FrameLayout $r5 = this.avatarLayout;
            $r5.setVisibility(8);
            TextView $r62 = this.seePreviousButton;
            $r62.setVisibility(8);
            return;
        }
        TextView $r63 = this.seePreviousButton;
        boolean $z02 = conversationCard.hasOlderConversations();
        byte $b0 = $z02 ? (byte) 0 : (byte) 8;
        $r63.setVisibility($b0);
        TextView $r42 = this.officeHoursView;
        TextView $r64 = $r42;
        $r64.setVisibility(0);
        FrameLayout $r52 = this.avatarLayout;
        $r52.setVisibility(0);
        List $r7 = teamPresence.getActiveAdmins();
        boolean $z03 = $r7.isEmpty();
        if (!$z03) {
            displayAvatars($r7, c10486i);
            int $i1 = $r7.size();
            updateNewConversationButtonPosition($i1);
        }
        OfficeHoursTextView $r43 = this.officeHoursView;
        updateOfficeHours($r43, teamPresence);
        TextView $r65 = this.seePreviousButton;
        boolean $z04 = conversationCard.hasOlderUnreadConversations();
        updateOlderConversationUnreadState($r65, $z04);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void updateOfficeHours(OfficeHoursTextView officeHoursTextView, TeamPresence teamPresence) {
        CharSequence $r3 = teamPresence.getOfficeHours();
        boolean $z0 = TextUtils.isEmpty($r3);
        if ($z0) {
            OfficeHoursTextView r5 = officeHoursTextView;
            r5.setText(teamPresence.getExpectedResponseDelay());
            return;
        }
        OfficeHoursTextView r52 = officeHoursTextView;
        r52.setText($r3);
        Context $r4 = this.context;
        int $i0 = C10110R.color.intercom_conversation_card_summary_text;
        officeHoursTextView.setOfficeHoursDrawable(C1335a.m36324d($r4, $i0));
    }
}
