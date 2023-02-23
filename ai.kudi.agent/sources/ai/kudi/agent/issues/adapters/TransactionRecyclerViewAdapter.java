package ai.kudi.agent.issues.adapters;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.issues.adapters.TransactionRecyclerViewAdapter;
import ai.kudi.agent.savings.data.model.SavingTransactionItem;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: TransactionRecyclerViewAdapter.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\"#$%B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u001c\u0010\u001b\u001a\u00020\u000f2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eH\u0016J$\u0010!\u001a\u00020\u000f2\u001c\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f0\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007RD\u0010\b\u001a,\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f0\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onClickListener", "Lkotlin/Function3;", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "Landroid/view/View;", "", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function3;", "setOnClickListener", "(Lkotlin/jvm/functions/Function3;)V", "transactions", "", "getItemCount", "getItemViewType", "position", "isDateViewAt", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTransactions", "Companion", "DateViewHolder", "TransactionViewHolder", "ViewHolder", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionRecyclerViewAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    public static final Companion Companion;
    private static final int VIEW_DATE = 0;
    private static final int VIEW_TRANSACTION = 1;
    private final Context context;
    private InterfaceC11772q<? super HashMap<String, String>, ? super View, ? super Integer, C13666w> onClickListener;
    private List<? extends HashMap<String, String>> transactions;

    /* compiled from: TransactionRecyclerViewAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter$Companion;", "", "()V", "VIEW_DATE", "", "VIEW_TRANSACTION", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: TransactionRecyclerViewAdapter.kt */
    @Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011H\u0016J \u0010\u0012\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter$DateViewHolder;", "Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter$ViewHolder;", "Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter;Landroid/view/View;)V", "dateTextView", "Landroid/widget/TextView;", "getDateTextView", "()Landroid/widget/TextView;", "setDateTextView", "(Landroid/widget/TextView;)V", "bindTransaction", "", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "setDate", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class DateViewHolder extends ViewHolder {
        private TextView dateTextView;
        final /* synthetic */ TransactionRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public DateViewHolder(TransactionRecyclerViewAdapter transactionRecyclerViewAdapter, View view) {
            super(transactionRecyclerViewAdapter, view);
            Log_OC.getArray(transactionRecyclerViewAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = transactionRecyclerViewAdapter;
            int $i0 = C0214R.C0216id.dateTextView;
            View $r1 = view.findViewById($i0);
            Log_OC.loadImage($r1, "container.findViewById(R.id.dateTextView)");
            TextView $r3 = (TextView) $r1;
            this.dateTextView = $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setDate(HashMap hashMap) {
            String $r3;
            try {
                Object $r2 = hashMap.get(TransactionField.TIME);
                String $r32 = (String) $r2;
                Date $r4 = StringExtKt.formatKudiDate($r32);
                boolean $z0 = DateExtKt.isToday($r4);
                if ($z0) {
                    $r3 = "TODAY";
                } else {
                    boolean $z02 = DateExtKt.isYesterday($r4);
                    if ($z02) {
                        $r3 = "YESTERDAY";
                    } else {
                        TimeZone $r5 = TimeZone.getTimeZone("GMT+1");
                        Log_OC.loadImage($r5, "getTimeZone(\"GMT+1\")");
                        $r3 = DateExtKt.formatWithStyle($r4, "MMM dd, yyyy", $r5);
                    }
                }
                TextView $r6 = this.dateTextView;
                $r6.setText($r3);
            } catch (ParseException $r7) {
                CrashlyticsReport.logException($r7);
                $r7.printStackTrace();
            }
        }

        @Override // ai.kudi.agent.issues.adapters.TransactionRecyclerViewAdapter.ViewHolder
        public void bindTransaction(HashMap hashMap) {
            Log_OC.getArray(hashMap, "transaction");
            setDate(hashMap);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getDateTextView() {
            TextView r1 = this.dateTextView;
            return r1;
        }

        public final void setDateTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.dateTextView = textView;
        }
    }

    /* compiled from: TransactionRecyclerViewAdapter.kt */
    @Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016J \u0010\u0015\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0002J \u0010\u0016\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0002J \u0010\u0017\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter$TransactionViewHolder;", "Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter$ViewHolder;", "Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter;Landroid/view/View;)V", "amountTextView", "Landroid/widget/TextView;", "balanceTextView", "descriptionTextView", "divider", "indicatorImageView", "Landroid/widget/ImageView;", "statusView", "timeTextView", "bindTransaction", "", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "setDate", "setDescription", "setStatus", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class TransactionViewHolder extends ViewHolder {
        private final TextView amountTextView;
        private final TextView balanceTextView;
        private final TextView descriptionTextView;
        private final View divider;
        private final ImageView indicatorImageView;
        private final TextView statusView;
        final /* synthetic */ TransactionRecyclerViewAdapter this$0;
        private final TextView timeTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public TransactionViewHolder(TransactionRecyclerViewAdapter transactionRecyclerViewAdapter, View view) {
            super(transactionRecyclerViewAdapter, view);
            Log_OC.getArray(transactionRecyclerViewAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = transactionRecyclerViewAdapter;
            int $i0 = C0214R.C0216id.indicatorImageView;
            View $r3 = view.findViewById($i0);
            Log_OC.loadImage($r3, "container.findViewById(R.id.indicatorImageView)");
            ImageView $r4 = (ImageView) $r3;
            this.indicatorImageView = $r4;
            int $i02 = C0214R.C0216id.description_text_view;
            View $r32 = view.findViewById($i02);
            Log_OC.loadImage($r32, "container.findViewById(R.id.description_text_view)");
            TextView $r5 = (TextView) $r32;
            this.descriptionTextView = $r5;
            int $i03 = C0214R.C0216id.amount_text_view;
            View $r33 = view.findViewById($i03);
            Log_OC.loadImage($r33, "container.findViewById(R.id.amount_text_view)");
            TextView $r52 = (TextView) $r33;
            this.amountTextView = $r52;
            int $i04 = C0214R.C0216id.time_text_view;
            View $r34 = view.findViewById($i04);
            Log_OC.loadImage($r34, "container.findViewById(R.id.time_text_view)");
            TextView $r53 = (TextView) $r34;
            this.timeTextView = $r53;
            int $i05 = C0214R.C0216id.balance_text_view;
            View $r35 = view.findViewById($i05);
            Log_OC.loadImage($r35, "container.findViewById(R.id.balance_text_view)");
            TextView $r54 = (TextView) $r35;
            this.balanceTextView = $r54;
            int $i06 = C0214R.C0216id.status;
            View $r36 = view.findViewById($i06);
            Log_OC.loadImage($r36, "container.findViewById(R.id.status)");
            TextView $r55 = (TextView) $r36;
            this.statusView = $r55;
            int $i07 = C0214R.C0216id.divider;
            View $r2 = view.findViewById($i07);
            Log_OC.loadImage($r2, "container.findViewById(R.id.divider)");
            this.divider = $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setDate(HashMap hashMap) {
            Object $r2 = hashMap.get(TransactionField.TIME);
            String $r3 = (String) $r2;
            Date $r4 = StringExtKt.formatKudiDate($r3);
            TextView $r5 = this.timeTextView;
            TimeZone $r6 = TimeZone.getTimeZone("GMT+1");
            Log_OC.loadImage($r6, "getTimeZone(\"GMT+1\")");
            String $r32 = DateExtKt.formatWithStyle($r4, SavingTransactionItem.TIME_FORMAT, $r6);
            $r5.setText($r32);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void setDescription(java.util.HashMap r14) {
            /*
                r13 = this;
                android.widget.TextView r0 = r13.descriptionTextView
                java.lang.String r2 = "type"
                java.lang.Object r1 = r14.get(r2)
                r4 = r1
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3 = r4
                r0.setText(r3)
                java.lang.String r2 = "Amount Added"
                java.lang.Object r1 = r14.get(r2)
                r6 = r1
                java.lang.String r6 = (java.lang.String) r6
                r5 = r6
                if (r5 != 0) goto L25
                java.lang.String r2 = "amount"
                java.lang.Object r1 = r14.get(r2)
                r7 = r1
                java.lang.String r7 = (java.lang.String) r7
                r5 = r7
            L25:
                android.widget.TextView r0 = r13.amountTextView
                r8 = 0
                if (r5 != 0) goto L2c
                r5 = 0
                goto L30
            L2c:
                java.lang.String r5 = ai.kudi.agent.core.util.StringExtKt.getFormatAmount(r5)
            L30:
                r0.setText(r5)
                android.widget.TextView r0 = r13.balanceTextView
                java.lang.String r2 = "Wallet Balance"
                java.lang.Object r1 = r14.get(r2)
                r9 = r1
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r3 = r9
                if (r3 == 0) goto L4a
                int r10 = r3.length()
                if (r10 != 0) goto L48
                goto L4a
            L48:
                r11 = 0
                goto L4b
            L4a:
                r11 = 1
            L4b:
                if (r11 != 0) goto L69
                java.lang.String r2 = "Wallet Balance"
                java.lang.Object r1 = r14.get(r2)
                r12 = r1
                java.lang.String r12 = (java.lang.String) r12
                r5 = r12
                if (r5 != 0) goto L5a
                goto L5e
            L5a:
                java.lang.String r8 = ai.kudi.agent.core.util.StringExtKt.getRemoveAllLetters(r5)
            L5e:
                java.lang.String r8 = ai.kudi.agent.core.util.StringExtKt.getFormatToCurrency(r8)
                java.lang.String r2 = " Balance"
                java.lang.String r8 = kotlin.p483e0.p485d.Log_OC.m10359a(r8, r2)
                goto L6b
            L69:
                java.lang.String r8 = "N/A"
            L6b:
                r0.setText(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.adapters.TransactionRecyclerViewAdapter.TransactionViewHolder.setDescription(java.util.HashMap):void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
            if (r13 == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
            if (r13 == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
            if (r13 == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
            if (r13 == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
            r14 = r24.statusView;
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r14, false, 1, null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void setStatus(java.util.HashMap r25) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.adapters.TransactionRecyclerViewAdapter.TransactionViewHolder.setStatus(java.util.HashMap):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.issues.adapters.TransactionRecyclerViewAdapter.ViewHolder
        public void bindTransaction(HashMap hashMap) {
            Log_OC.getArray(hashMap, "transaction");
            setDate(hashMap);
            setDescription(hashMap);
            setStatus(hashMap);
            int $i0 = getAdapterPosition();
            int $i02 = $i0 + 1;
            TransactionRecyclerViewAdapter $r2 = this.this$0;
            int $i1 = $r2.getItemCount();
            if ($i02 < $i1 - 1) {
                TransactionRecyclerViewAdapter $r22 = this.this$0;
                int $i03 = getAdapterPosition();
                boolean $z0 = $r22.isDateViewAt($i03 + 1);
                if ($z0) {
                    View $r3 = this.divider;
                    ViewExtKt.hide$default($r3, false, 1, null);
                    return;
                }
            }
            View $r32 = this.divider;
            ViewExtKt.show($r32);
        }
    }

    /* compiled from: TransactionRecyclerViewAdapter.kt */
    @Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH&J)\u0010\r\u001a\u00020\b2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindTransaction", "", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "setOnClickListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ TransactionRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(TransactionRecyclerViewAdapter transactionRecyclerViewAdapter, View view) {
            super(view);
            Log_OC.getArray(transactionRecyclerViewAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = transactionRecyclerViewAdapter;
            this.container = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnClickListener$lambda-0  reason: not valid java name */
        public static final void m39343setOnClickListener$lambda0(InterfaceC11767l interfaceC11767l, View view) {
            Log_OC.getArray(interfaceC11767l, "$tmp0");
            interfaceC11767l.invoke(view);
        }

        public abstract void bindTransaction(HashMap hashMap);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected final View getContainer() {
            View r1 = this.container;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void setOnClickListener(final InterfaceC11767l interfaceC11767l) {
            Log_OC.getArray(interfaceC11767l, "listener");
            View $r3 = this.container;
            $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.adapters.TestActivity$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11767l $r2 = InterfaceC11767l.this;
                    TransactionRecyclerViewAdapter.ViewHolder.m39343setOnClickListener$lambda0($r2, view);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionRecyclerViewAdapter(Context context) {
        List $r1;
        Log_OC.getArray(context, "context");
        this.context = context;
        $r1 = C13726r.m3891e();
        this.transactions = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isDateViewAt(int i) {
        List $r1 = this.transactions;
        Object $r2 = $r1.get(i);
        HashMap $r3 = (HashMap) $r2;
        Object $r22 = $r3.get("isDateView");
        boolean $z0 = Log_OC.append($r22, "true");
        return $z0;
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
        List $r1 = this.transactions;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        boolean $z0 = isDateViewAt(i);
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11772q getOnClickListener() {
        InterfaceC11772q r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        if (i != -1) {
            List $r3 = this.transactions;
            Object $r2 = $r3.get(i);
            HashMap $r4 = (HashMap) $r2;
            viewHolder.bindTransaction($r4);
            boolean $z0 = viewHolder instanceof TransactionViewHolder;
            if ($z0) {
                TransactionRecyclerViewAdapter$onBindViewHolder$1 $r5 = new TransactionRecyclerViewAdapter$onBindViewHolder$1(this, i);
                viewHolder.setOnClickListener($r5);
            }
        }
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
        if (i == 1) {
            Context $r2 = viewGroup.getContext();
            LayoutInflater $r3 = LayoutInflater.from($r2);
            int $i0 = C0214R.C0217layout.transaction_item;
            View $r4 = $r3.inflate($i0, viewGroup, false);
            Log_OC.loadImage($r4, "view");
            TransactionViewHolder $r5 = new TransactionViewHolder(this, $r4);
            return $r5;
        }
        Context $r22 = viewGroup.getContext();
        LayoutInflater $r32 = LayoutInflater.from($r22);
        int $i02 = C0214R.C0217layout.transaction_item_header;
        View $r42 = $r32.inflate($i02, viewGroup, false);
        Log_OC.loadImage($r42, "view");
        DateViewHolder $r6 = new DateViewHolder(this, $r42);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setOnClickListener(InterfaceC11772q interfaceC11772q) {
        this.onClickListener = interfaceC11772q;
    }

    public final void setTransactions(List list) {
        Log_OC.getArray(list, "transactions");
        this.transactions = list;
        notifyDataSetChanged();
    }
}
