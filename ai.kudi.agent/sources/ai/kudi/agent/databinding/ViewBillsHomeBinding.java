package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.SafeViewPager;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.carouselView.CarouselView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewBillsHomeBinding implements InterfaceC8209a {
    public final View accountSetupDivider;
    public final AppCompatTextView accountSetupTitle;
    public final AppBarLayout appBar;
    public final RecyclerView billersRecyclerView;
    public final KudiButton buttonFundWallet;
    public final CardView cardAccountSetupContainer;
    public final CardView cardActionContainer;
    public final LinearLayout cardBuyAirtime;
    public final CardView cardRvContainer;
    public final LinearLayout cardSendMoney;
    public final LinearLayout cardWithdrawCash;
    public final ConstraintLayout clPersonalDetails;
    public final CarouselView kshockCarouselView;
    public final AppCompatImageButton navDrawerToggle;
    public final AppCompatTextView needHelpButton;
    public final TextView notificationCountText;
    public final AppCompatImageButton notificationMenuItem;
    private final ConstraintLayout rootView;
    public final SafeViewPager rvNotifications;
    public final TextView textActionText;
    public final TextView textGreeting;
    public final TextView textWalletBalance;
    public final RecyclerView todoList;
    public final Toolbar toolbar;
    public final CircleImageView userMenuPicture;
    public final ViewHomeBillsHeaderBinding viewBillsHeader;

    private ViewBillsHomeBinding(ConstraintLayout constraintLayout, View view, AppCompatTextView appCompatTextView, AppBarLayout appBarLayout, RecyclerView recyclerView, KudiButton kudiButton, CardView cardView, CardView cardView2, LinearLayout linearLayout, CardView cardView3, LinearLayout linearLayout2, LinearLayout linearLayout3, ConstraintLayout constraintLayout2, CarouselView carouselView, AppCompatImageButton appCompatImageButton, AppCompatTextView appCompatTextView2, TextView textView, AppCompatImageButton appCompatImageButton2, SafeViewPager safeViewPager, TextView textView2, TextView textView3, TextView textView4, RecyclerView recyclerView2, Toolbar toolbar, CircleImageView circleImageView, ViewHomeBillsHeaderBinding viewHomeBillsHeaderBinding) {
        this.rootView = constraintLayout;
        this.accountSetupDivider = view;
        this.accountSetupTitle = appCompatTextView;
        this.appBar = appBarLayout;
        this.billersRecyclerView = recyclerView;
        this.buttonFundWallet = kudiButton;
        this.cardAccountSetupContainer = cardView;
        this.cardActionContainer = cardView2;
        this.cardBuyAirtime = linearLayout;
        this.cardRvContainer = cardView3;
        this.cardSendMoney = linearLayout2;
        this.cardWithdrawCash = linearLayout3;
        this.clPersonalDetails = constraintLayout2;
        this.kshockCarouselView = carouselView;
        this.navDrawerToggle = appCompatImageButton;
        this.needHelpButton = appCompatTextView2;
        this.notificationCountText = textView;
        this.notificationMenuItem = appCompatImageButton2;
        this.rvNotifications = safeViewPager;
        this.textActionText = textView2;
        this.textGreeting = textView3;
        this.textWalletBalance = textView4;
        this.todoList = recyclerView2;
        this.toolbar = toolbar;
        this.userMenuPicture = circleImageView;
        this.viewBillsHeader = viewHomeBillsHeaderBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewBillsHomeBinding bind(View view) {
        int $i0 = C0001R.C0003id.account_setup_divider;
        View $r1 = view.findViewById(C0001R.C0003id.account_setup_divider);
        if ($r1 != null) {
            $i0 = C0001R.C0003id.account_setup_title;
            View $r2 = view.findViewById(C0001R.C0003id.account_setup_title);
            AppCompatTextView appCompatTextView = (AppCompatTextView) $r2;
            if (appCompatTextView != null) {
                $i0 = C0001R.C0003id.app_bar;
                View $r22 = view.findViewById(C0001R.C0003id.app_bar);
                AppBarLayout appBarLayout = (AppBarLayout) $r22;
                if (appBarLayout != null) {
                    $i0 = C0001R.C0003id.billersRecyclerView;
                    View $r23 = view.findViewById(C0001R.C0003id.billersRecyclerView);
                    RecyclerView recyclerView = (RecyclerView) $r23;
                    if (recyclerView != null) {
                        $i0 = C0001R.C0003id.button_fund_wallet;
                        View $r24 = view.findViewById(C0001R.C0003id.button_fund_wallet);
                        KudiButton kudiButton = (KudiButton) $r24;
                        if (kudiButton != null) {
                            $i0 = C0001R.C0003id.card_account_setup_container;
                            View $r25 = view.findViewById(C0001R.C0003id.card_account_setup_container);
                            CardView cardView = (CardView) $r25;
                            if (cardView != null) {
                                $i0 = C0001R.C0003id.card_action_container;
                                View $r26 = view.findViewById(C0001R.C0003id.card_action_container);
                                CardView $r8 = (CardView) $r26;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.card_buy_airtime;
                                    View $r27 = view.findViewById(C0001R.C0003id.card_buy_airtime);
                                    LinearLayout $r9 = (LinearLayout) $r27;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.card_rv_container;
                                        View $r28 = view.findViewById(C0001R.C0003id.card_rv_container);
                                        CardView $r10 = (CardView) $r28;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.card_send_money;
                                            View $r29 = view.findViewById(C0001R.C0003id.card_send_money);
                                            LinearLayout $r11 = (LinearLayout) $r29;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.card_withdraw_cash;
                                                View $r210 = view.findViewById(C0001R.C0003id.card_withdraw_cash);
                                                LinearLayout $r12 = (LinearLayout) $r210;
                                                if ($r12 != null) {
                                                    $i0 = C0001R.C0003id.cl_personal_details;
                                                    View $r211 = view.findViewById(C0001R.C0003id.cl_personal_details);
                                                    ConstraintLayout $r13 = (ConstraintLayout) $r211;
                                                    if ($r13 != null) {
                                                        $i0 = C0001R.C0003id.kshock_carousel_view;
                                                        View $r212 = view.findViewById(C0001R.C0003id.kshock_carousel_view);
                                                        CarouselView $r14 = (CarouselView) $r212;
                                                        if ($r14 != null) {
                                                            $i0 = C0001R.C0003id.nav_drawer_toggle;
                                                            View $r213 = view.findViewById(C0001R.C0003id.nav_drawer_toggle);
                                                            AppCompatImageButton $r15 = (AppCompatImageButton) $r213;
                                                            if ($r15 != null) {
                                                                $i0 = C0001R.C0003id.needHelpButton;
                                                                View $r214 = view.findViewById(C0001R.C0003id.needHelpButton);
                                                                AppCompatTextView $r16 = (AppCompatTextView) $r214;
                                                                if ($r16 != null) {
                                                                    $i0 = C0001R.C0003id.notification_count_text;
                                                                    View $r215 = view.findViewById(C0001R.C0003id.notification_count_text);
                                                                    TextView $r17 = (TextView) $r215;
                                                                    if ($r17 != null) {
                                                                        $i0 = C0001R.C0003id.notification_menu_item;
                                                                        View $r216 = view.findViewById(C0001R.C0003id.notification_menu_item);
                                                                        AppCompatImageButton $r18 = (AppCompatImageButton) $r216;
                                                                        if ($r18 != null) {
                                                                            $i0 = C0001R.C0003id.rv_notifications;
                                                                            View $r217 = view.findViewById(C0001R.C0003id.rv_notifications);
                                                                            SafeViewPager $r19 = (SafeViewPager) $r217;
                                                                            if ($r19 != null) {
                                                                                $i0 = C0001R.C0003id.text_action_text;
                                                                                View $r218 = view.findViewById(C0001R.C0003id.text_action_text);
                                                                                TextView $r20 = (TextView) $r218;
                                                                                if ($r20 != null) {
                                                                                    $i0 = C0001R.C0003id.text_greeting;
                                                                                    View $r219 = view.findViewById(C0001R.C0003id.text_greeting);
                                                                                    TextView $r21 = (TextView) $r219;
                                                                                    if ($r21 != null) {
                                                                                        $i0 = C0001R.C0003id.text_wallet_balance;
                                                                                        View $r220 = view.findViewById(C0001R.C0003id.text_wallet_balance);
                                                                                        TextView $r222 = (TextView) $r220;
                                                                                        if ($r222 != null) {
                                                                                            $i0 = C0001R.C0003id.todo_list;
                                                                                            View $r221 = view.findViewById(C0001R.C0003id.todo_list);
                                                                                            RecyclerView $r232 = (RecyclerView) $r221;
                                                                                            if ($r232 != null) {
                                                                                                $i0 = C0001R.C0003id.toolbar;
                                                                                                View $r223 = view.findViewById(C0001R.C0003id.toolbar);
                                                                                                Toolbar $r242 = (Toolbar) $r223;
                                                                                                if ($r242 != null) {
                                                                                                    $i0 = C0001R.C0003id.user_menu_picture;
                                                                                                    View $r224 = view.findViewById(C0001R.C0003id.user_menu_picture);
                                                                                                    CircleImageView $r252 = (CircleImageView) $r224;
                                                                                                    if ($r252 != null) {
                                                                                                        $i0 = C0001R.C0003id.view_bills_header;
                                                                                                        View $r225 = view.findViewById(C0001R.C0003id.view_bills_header);
                                                                                                        if ($r225 != null) {
                                                                                                            ViewHomeBillsHeaderBinding $r262 = ViewHomeBillsHeaderBinding.bind($r225);
                                                                                                            ConstraintLayout $r282 = (ConstraintLayout) view;
                                                                                                            ViewBillsHomeBinding $r272 = new ViewBillsHomeBinding($r282, $r1, appCompatTextView, appBarLayout, recyclerView, kudiButton, cardView, $r8, $r9, $r10, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r20, $r21, $r222, $r232, $r242, $r252, $r262);
                                                                                                            return $r272;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r292 = view.getResources();
        String $r30 = $r292.getResourceName($i0);
        NullPointerException $r31 = new NullPointerException("Missing required view with ID: ".concat($r30));
        throw $r31;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewBillsHomeBinding inflate(LayoutInflater layoutInflater) {
        ViewBillsHomeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewBillsHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_bills_home, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewBillsHomeBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
