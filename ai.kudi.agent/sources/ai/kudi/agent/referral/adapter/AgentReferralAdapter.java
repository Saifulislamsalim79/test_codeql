package ai.kudi.agent.referral.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.IntExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.referral.AgentReferralModel;
import ai.kudi.agent.referral.AgentReferralStatus;
import ai.kudi.agent.referral.adapter.AgentReferralAdapter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import java.util.Random;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p491i0.C11837e;
import kotlin.p491i0.C11841h;
import kotlin.p557z.C13726r;
/* compiled from: AgentReferralAdapter.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002'(B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u001c\u0010\u001e\u001a\u00020\u00182\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH\u0016J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000bH\u0016J\u0014\u0010%\u001a\u00020\u00182\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fRa\u0010\u0010\u001aI\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/referral/adapter/AgentReferralAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/referral/adapter/AgentReferralAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "agentReferrerList", "", "Lai/kudi/agent/referral/AgentReferralModel;", "colorList", "", "", "getColorList", "()Ljava/util/List;", "getContext", "()Landroid/content/Context;", "listener", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "referralId", "phoneNumber", TransactionField.STATUS, "", "getListener", "()Lkotlin/jvm/functions/Function3;", "setListener", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAgentReferral", AttributeType.LIST, "AgentReferralViewHolder", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AgentReferralAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    private List<AgentReferralModel> agentReferrerList;
    private final List<Integer> colorList;
    private final Context context;
    private InterfaceC11772q<? super String, ? super String, ? super String, C13666w> listener;

    /* compiled from: AgentReferralAdapter.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/referral/adapter/AgentReferralAdapter$AgentReferralViewHolder;", "Lai/kudi/agent/referral/adapter/AgentReferralAdapter$ViewHolder;", "Lai/kudi/agent/referral/adapter/AgentReferralAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/referral/adapter/AgentReferralAdapter;Landroid/view/View;)V", "indexTextView", "Landroid/widget/TextView;", "phoneNumberTextView", "referAction", "statusIndicator", "statusView", "bindTransaction", "", "agentReferrerModel", "Lai/kudi/agent/referral/AgentReferralModel;", "generateRandomNumber", "", "setBackgroundColor", "setIndex", "index", "", "setPhoneNumber", "phoneNumber", "setReferralStatus", TransactionField.STATUS, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class AgentReferralViewHolder extends ViewHolder {
        private final TextView indexTextView;
        private final TextView phoneNumberTextView;
        private final TextView referAction;
        private final View statusIndicator;
        private final TextView statusView;
        final /* synthetic */ AgentReferralAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public AgentReferralViewHolder(AgentReferralAdapter agentReferralAdapter, View view) {
            super(agentReferralAdapter, view);
            Log_OC.getArray(agentReferralAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = agentReferralAdapter;
            View $r3 = view.findViewById(C0001R.C0003id.phoneNumberTextView);
            Log_OC.loadImage($r3, "container.findViewById(R.id.phoneNumberTextView)");
            TextView $r4 = (TextView) $r3;
            this.phoneNumberTextView = $r4;
            View $r32 = view.findViewById(C0001R.C0003id.indexTextView);
            Log_OC.loadImage($r32, "container.findViewById(R.id.indexTextView)");
            TextView $r42 = (TextView) $r32;
            this.indexTextView = $r42;
            View $r33 = view.findViewById(C0001R.C0003id.status);
            Log_OC.loadImage($r33, "container.findViewById(R.id.status)");
            TextView $r43 = (TextView) $r33;
            this.statusView = $r43;
            View $r34 = view.findViewById(C0001R.C0003id.statusIndicator);
            Log_OC.loadImage($r34, "container.findViewById(R.id.statusIndicator)");
            this.statusIndicator = $r34;
            View $r2 = view.findViewById(C0001R.C0003id.referAction);
            Log_OC.loadImage($r2, "container.findViewById(R.id.referAction)");
            TextView $r44 = (TextView) $r2;
            this.referAction = $r44;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindTransaction$lambda-0  reason: not valid java name */
        public static final void m40236bindTransaction$lambda0(AgentReferralAdapter agentReferralAdapter, AgentReferralModel agentReferralModel, String str, View view) {
            Log_OC.getArray(agentReferralAdapter, "this$0");
            Log_OC.getArray(agentReferralModel, "$agentReferrerModel");
            Log_OC.getArray(str, "$status");
            InterfaceC11772q $r4 = agentReferralAdapter.getListener();
            if ($r4 == null) {
                return;
            }
            String $r5 = agentReferralModel.getId();
            Log_OC.append($r5);
            String $r6 = agentReferralModel.getReferredPhone();
            $r4.invoke($r5, $r6, str);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final int generateRandomNumber() {
            C11837e $r4;
            Random $r1 = new Random();
            AgentReferralAdapter $r2 = this.this$0;
            List $r3 = $r2.getColorList();
            int $i0 = $r3.size();
            $r4 = C11841h.m10262j(0, $i0);
            int $i02 = IntExtKt.nextInt($r1, $r4);
            return $i02;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setBackgroundColor() {
            int $i0 = generateRandomNumber();
            AgentReferralAdapter $r1 = this.this$0;
            List $r2 = $r1.getColorList();
            Object $r3 = $r2.get($i0);
            Number $r4 = (Number) $r3;
            int $i02 = $r4.intValue();
            AgentReferralAdapter $r12 = this.this$0;
            Context $r5 = $r12.getContext();
            Drawable $r6 = C1335a.m36322f($r5, C0001R.C0002drawable.grey_circular_shape);
            if ($r6 != null) {
                AgentReferralAdapter $r13 = this.this$0;
                Context $r52 = $r13.getContext();
                ViewExtKt.tint($r6, $r52, $i02);
            }
            TextView $r7 = this.indexTextView;
            $r7.setBackground($r6);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setIndex(String str) {
            TextView $r2 = this.indexTextView;
            $r2.setText(str);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setPhoneNumber(String str) {
            TextView $r2 = this.phoneNumberTextView;
            $r2.setText(str);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setReferralStatus(String str) {
            AgentReferralStatus $r2 = AgentReferralStatus.REGISTERED;
            String $r3 = $r2.name();
            boolean $z0 = Log_OC.append(str, $r3);
            if ($z0) {
                TextView $r4 = this.statusView;
                $r4.setText("Registered");
                View $r5 = this.statusIndicator;
                AgentReferralAdapter $r6 = this.this$0;
                Context $r7 = $r6.getContext();
                Drawable $r8 = C1335a.m36322f($r7, C0001R.C0002drawable.referred_status);
                Log_OC.append($r8);
                Log_OC.loadImage($r8, "getDrawable(context,\n                                                                           R.drawable.referred_status)!!");
                AgentReferralAdapter $r62 = this.this$0;
                Context $r72 = $r62.getContext();
                $r5.setBackground(ViewExtKt.tint($r8, $r72, (int) C0001R.color.referralColor_registered));
                TextView $r42 = this.referAction;
                $r42.setText("View");
                TextView $r43 = this.referAction;
                $r43.setCompoundDrawablesWithIntrinsicBounds(C0001R.C0002drawable.ic_refer_view, 0, 0, 0);
                return;
            }
            AgentReferralStatus $r22 = AgentReferralStatus.INACTIVE;
            String $r32 = $r22.name();
            boolean $z02 = Log_OC.append(str, $r32);
            if ($z02) {
                TextView $r44 = this.statusView;
                $r44.setText("Inactive");
                View $r52 = this.statusIndicator;
                AgentReferralAdapter $r63 = this.this$0;
                Context $r73 = $r63.getContext();
                Drawable $r82 = C1335a.m36322f($r73, C0001R.C0002drawable.referred_status);
                Log_OC.append($r82);
                Log_OC.loadImage($r82, "getDrawable(context,\n                                                                           R.drawable.referred_status)!!");
                AgentReferralAdapter $r64 = this.this$0;
                Context $r74 = $r64.getContext();
                $r52.setBackground(ViewExtKt.tint($r82, $r74, (int) C0001R.color.referralColor_inactive));
                TextView $r45 = this.referAction;
                $r45.setText("Buzz");
                TextView $r46 = this.referAction;
                $r46.setCompoundDrawablesWithIntrinsicBounds(C0001R.C0002drawable.ic_refer_buzz, 0, 0, 0);
                return;
            }
            AgentReferralStatus $r23 = AgentReferralStatus.ACTIVE;
            String $r33 = $r23.name();
            boolean $z03 = Log_OC.append(str, $r33);
            if ($z03) {
                TextView $r47 = this.statusView;
                $r47.setText("Active");
                View $r53 = this.statusIndicator;
                AgentReferralAdapter $r65 = this.this$0;
                Context $r75 = $r65.getContext();
                Drawable $r83 = C1335a.m36322f($r75, C0001R.C0002drawable.referred_status);
                Log_OC.append($r83);
                Log_OC.loadImage($r83, "getDrawable(context,\n                                                                           R.drawable.referred_status)!!");
                AgentReferralAdapter $r66 = this.this$0;
                Context $r76 = $r66.getContext();
                $r53.setBackground(ViewExtKt.tint($r83, $r76, (int) C0001R.color.referralColor_active));
                TextView $r48 = this.referAction;
                $r48.setText("View");
                TextView $r49 = this.referAction;
                $r49.setCompoundDrawablesWithIntrinsicBounds(C0001R.C0002drawable.ic_refer_view, 0, 0, 0);
                return;
            }
            View $r54 = this.statusIndicator;
            AgentReferralAdapter $r67 = this.this$0;
            Context $r77 = $r67.getContext();
            Drawable $r84 = C1335a.m36322f($r77, C0001R.C0002drawable.referred_status);
            Log_OC.append($r84);
            Log_OC.loadImage($r84, "getDrawable(context,\n                                                                           R.drawable.referred_status)!!");
            AgentReferralAdapter $r68 = this.this$0;
            Context $r78 = $r68.getContext();
            $r54.setBackground(ViewExtKt.tint($r84, $r78, (int) C0001R.color.referralColor_pending));
            TextView $r410 = this.statusView;
            $r410.setText("Pending");
            TextView $r411 = this.referAction;
            $r411.setText("Buzz");
            TextView $r412 = this.referAction;
            $r412.setCompoundDrawablesWithIntrinsicBounds(C0001R.C0002drawable.ic_refer_buzz, 0, 0, 0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.referral.adapter.AgentReferralAdapter.ViewHolder
        public void bindTransaction(final AgentReferralModel agentReferralModel) {
            Log_OC.getArray(agentReferralModel, "agentReferrerModel");
            int $i0 = getAdapterPosition();
            String $r5 = String.valueOf($i0 + 1);
            setIndex(StringExtKt.padDigit($r5));
            String $r52 = agentReferralModel.getReferredPhone();
            setPhoneNumber($r52);
            setBackgroundColor();
            final String $r53 = agentReferralModel.getStatus();
            Log_OC.append($r53);
            setReferralStatus($r53);
            TextView $r2 = this.referAction;
            final AgentReferralAdapter $r3 = this.this$0;
            $r2.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.referral.adapter.l
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AgentReferralAdapter $r22 = AgentReferralAdapter.this;
                    AgentReferralModel $r32 = agentReferralModel;
                    String $r4 = $r53;
                    AgentReferralAdapter.AgentReferralViewHolder.m40236bindTransaction$lambda0($r22, $r32, $r4, view);
                }
            });
        }
    }

    /* compiled from: AgentReferralAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/referral/adapter/AgentReferralAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/referral/adapter/AgentReferralAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindTransaction", "", "agentReferrerModel", "Lai/kudi/agent/referral/AgentReferralModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ AgentReferralAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(AgentReferralAdapter agentReferralAdapter, View view) {
            super(view);
            Log_OC.getArray(agentReferralAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = agentReferralAdapter;
            this.container = view;
        }

        public abstract void bindTransaction(AgentReferralModel agentReferralModel);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected final View getContainer() {
            View r1 = this.container;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralAdapter(Context context) {
        List $r2;
        List $r22;
        Log_OC.getArray(context, "context");
        this.context = context;
        $r2 = C13726r.m3891e();
        this.agentReferrerList = $r2;
        Integer $r4 = Integer.valueOf((int) C0001R.color.pendingColor);
        Integer $r42 = Integer.valueOf((int) C0001R.color.purple);
        Integer $r43 = Integer.valueOf((int) C0001R.color.red);
        Integer $r44 = Integer.valueOf((int) C0001R.color.colorAccent);
        Integer $r45 = Integer.valueOf((int) C0001R.color.referralColor_peach);
        Integer $r46 = Integer.valueOf((int) C0001R.color.referralColor_pink);
        Integer[] $r3 = {$r4, $r42, $r43, $r44, $r45, $r46};
        $r22 = C13726r.m3885k($r3);
        this.colorList = $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getColorList() {
        List r1 = this.colorList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Context r1 = this.context;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.agentReferrerList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11772q getListener() {
        InterfaceC11772q r1 = this.listener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        List $r3 = this.agentReferrerList;
        Object $r2 = $r3.get(i);
        AgentReferralModel $r4 = (AgentReferralModel) $r2;
        viewHolder.bindTransaction($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder $r2 = viewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r2 = this.context;
        LayoutInflater $r3 = LayoutInflater.from($r2);
        View $r4 = $r3.inflate(C0001R.C0004layout.content_agent_referral_list, viewGroup, false);
        Log_OC.loadImage($r4, "view");
        AgentReferralViewHolder $r5 = new AgentReferralViewHolder(this, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setAgentReferral(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        this.agentReferrerList = list;
    }

    public final void setListener(InterfaceC11772q interfaceC11772q) {
        this.listener = interfaceC11772q;
    }
}
