package ai.kudi.agent.inbox.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.inbox.adapters.InboxAdapter;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.viewmodels.model.PosLabels;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.RecyclerView;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13252b;
/* compiled from: InboxAdapter.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004 !\"#B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u001c\u0010\u0019\u001a\u00020\u000f2\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0014\u0010\u001f\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/inbox/adapters/InboxAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/inbox/adapters/InboxAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "issues", "", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "onClickListener", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function3;", "setOnClickListener", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "getItemViewType", "position", "isDateViewAt", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setInbox", "Companion", "DateViewHolder", "InboxViewHolder", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class InboxAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    public static final Companion Companion;
    private static final int VIEW_DATE = 0;
    private static final int VIEW_ISSUES = 1;
    private final Context context;
    private List<Issue.Ticket> issues;
    private InterfaceC11772q<? super Issue.Ticket, ? super View, ? super Integer, C13666w> onClickListener;

    /* compiled from: InboxAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/inbox/adapters/InboxAdapter$Companion;", "", "()V", "VIEW_DATE", "", "VIEW_ISSUES", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: InboxAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/inbox/adapters/InboxAdapter$DateViewHolder;", "Lai/kudi/agent/inbox/adapters/InboxAdapter$ViewHolder;", "Lai/kudi/agent/inbox/adapters/InboxAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/inbox/adapters/InboxAdapter;Landroid/view/View;)V", "dateTextView", "Landroid/widget/TextView;", "getDateTextView", "()Landroid/widget/TextView;", "setDateTextView", "(Landroid/widget/TextView;)V", "bindTransaction", "", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "setDate", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class DateViewHolder extends ViewHolder {
        private TextView dateTextView;
        final /* synthetic */ InboxAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public DateViewHolder(InboxAdapter inboxAdapter, View view) {
            super(inboxAdapter, view);
            Log_OC.getArray(inboxAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = inboxAdapter;
            View $r1 = view.findViewById(C0001R.C0003id.dateHeaderTextView);
            Log_OC.loadImage($r1, "container.findViewById(R.id.dateHeaderTextView)");
            TextView $r3 = (TextView) $r1;
            this.dateTextView = $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setDate(Issue.Ticket ticket) {
            String $r4;
            try {
                HashMap $r2 = ticket.getDateView();
                Object $r3 = $r2.get("createdAt");
                String $r42 = (String) $r3;
                Log_OC.append($r42);
                Date $r5 = StringExtKt.formatKudiDateAlt3($r42);
                boolean $z0 = DateExtKt.isToday($r5);
                if ($z0) {
                    $r4 = "TODAY";
                } else {
                    boolean $z02 = DateExtKt.isYesterday($r5);
                    $r4 = $z02 ? "YESTERDAY" : DateExtKt.formatWithStyle$default($r5, "MMM dd, yyyy", null, 2, null);
                }
                TextView $r6 = this.dateTextView;
                $r6.setText($r4);
            } catch (ParseException $r7) {
                CrashlyticsReport.logException($r7);
                $r7.printStackTrace();
            }
        }

        @Override // ai.kudi.agent.inbox.adapters.InboxAdapter.ViewHolder
        public void bindTransaction(Issue.Ticket ticket) {
            Log_OC.getArray(ticket, "ticket");
            setDate(ticket);
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

    /* compiled from: InboxAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/inbox/adapters/InboxAdapter$InboxViewHolder;", "Lai/kudi/agent/inbox/adapters/InboxAdapter$ViewHolder;", "Lai/kudi/agent/inbox/adapters/InboxAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/inbox/adapters/InboxAdapter;Landroid/view/View;)V", "amountTextView", "Landroid/widget/TextView;", "getAmountTextView", "()Landroid/widget/TextView;", "setAmountTextView", "(Landroid/widget/TextView;)V", "dateTextView", "getDateTextView", "setDateTextView", "issueTypeView", "getIssueTypeView", "setIssueTypeView", "statusTextView", "getStatusTextView", "setStatusTextView", "ticketTitleTextView", "getTicketTitleTextView", "setTicketTitleTextView", "bindTransaction", "", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "setAmount", "setDate", "setStatus", "setTitle", "setType", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class InboxViewHolder extends ViewHolder {
        private TextView amountTextView;
        private TextView dateTextView;
        private TextView issueTypeView;
        private TextView statusTextView;
        final /* synthetic */ InboxAdapter this$0;
        private TextView ticketTitleTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public InboxViewHolder(InboxAdapter inboxAdapter, View view) {
            super(inboxAdapter, view);
            Log_OC.getArray(inboxAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = inboxAdapter;
            View $r3 = view.findViewById(C0001R.C0003id.issueTypeTextView);
            Log_OC.loadImage($r3, "container.findViewById(R.id.issueTypeTextView)");
            TextView $r4 = (TextView) $r3;
            this.issueTypeView = $r4;
            View $r32 = view.findViewById(C0001R.C0003id.ticketTitleTextView);
            Log_OC.loadImage($r32, "container.findViewById(R.id.ticketTitleTextView)");
            TextView $r42 = (TextView) $r32;
            this.ticketTitleTextView = $r42;
            View $r33 = view.findViewById(C0001R.C0003id.dateTextView);
            Log_OC.loadImage($r33, "container.findViewById(R.id.dateTextView)");
            TextView $r43 = (TextView) $r33;
            this.dateTextView = $r43;
            View $r34 = view.findViewById(C0001R.C0003id.amountTextView);
            Log_OC.loadImage($r34, "container.findViewById(R.id.amountTextView)");
            TextView $r44 = (TextView) $r34;
            this.amountTextView = $r44;
            View $r2 = view.findViewById(C0001R.C0003id.statusTextView);
            Log_OC.loadImage($r2, "container.findViewById(R.id.statusTextView)");
            TextView $r45 = (TextView) $r2;
            this.statusTextView = $r45;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setAmount(Issue.Ticket ticket) {
            HashMap $r3 = ticket.getMeta();
            Object $r4 = $r3.get(TransactionField.AMOUNT);
            String $r5 = (String) $r4;
            if ($r5 == null) {
                $r5 = "0";
            }
            String $r52 = StringExtKt.getRemoveAllLetters($r5);
            int $i0 = $r52.length();
            boolean $z0 = $i0 == 0;
            String $r6 = $z0 ? "0" : $r52;
            TextView $r7 = this.amountTextView;
            InboxAdapter $r8 = this.this$0;
            try {
                Context $r9 = $r8.getContext();
                String $r53 = $r9.getString(C0001R.string.naira_symbol);
                Locale $r10 = Locale.US;
                NumberFormat $r11 = NumberFormat.getNumberInstance($r10);
                double $d0 = Double.parseDouble($r6);
                String $r12 = $r11.format($d0);
                $r7.setText(Log_OC.m10359a($r53, (Object) $r12));
            } catch (NumberFormatException e) {
                TextView $r72 = this.amountTextView;
                $r72.setText($r6);
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setDate(Issue.Ticket ticket) {
            String $r3 = ticket.getTimeCreated();
            Date $r4 = StringExtKt.formatKudiDateAlt3($r3);
            TextView $r1 = this.dateTextView;
            TimeZone $r5 = TimeZone.getTimeZone("GMT+1");
            Log_OC.loadImage($r5, "getTimeZone(\"GMT+1\")");
            String $r32 = DateExtKt.formatWithStyle($r4, "dd MMM, yyyy, hh:mm a", $r5);
            $r1.setText($r32);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setStatus(Issue.Ticket ticket) {
            int $i0;
            String $r2;
            if (ticket.getStatus() == null) {
                ticket.setStatus("UNRESOLVED");
            }
            String $r22 = ticket.getStatus();
            boolean $z0 = Log_OC.append($r22, "RESOLVED");
            if ($z0) {
                $i0 = C0001R.color.colorAccent;
                $r2 = "Resolved";
            } else {
                boolean $z02 = Log_OC.append($r22, "OPENED");
                if ($z02) {
                    $i0 = C0001R.color.black;
                    $r2 = "In Progress";
                } else {
                    $i0 = C0001R.color.colorPrimary;
                    $r2 = "Received";
                }
            }
            TextView $r3 = this.statusTextView;
            $r3.setText($r2);
            TextView $r32 = this.statusTextView;
            InboxAdapter $r4 = this.this$0;
            Context $r5 = $r4.getContext();
            $r32.setTextColor(C1335a.m36324d($r5, $i0));
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setTitle(Issue.Ticket ticket) {
            TextView $r1 = this.ticketTitleTextView;
            String $r3 = ticket.getId();
            $r1.setText(Log_OC.m10359a("Ticket ", (Object) $r3));
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void setType(Issue.Ticket ticket) {
            String $r4;
            String $r6;
            HashMap $r2 = ticket.getMeta();
            Object $r3 = $r2.get("type");
            String $r42 = (String) $r3;
            PosLabels $r5 = PosLabels.CHARGE_BACK;
            String $r62 = $r5.getLabel();
            boolean $z0 = Log_OC.append($r42, $r62);
            if ($z0) {
                $r4 = "Chargeback";
            } else {
                PosLabels $r52 = PosLabels.DELAYED_CREDIT;
                String $r63 = $r52.getLabel();
                boolean $z02 = Log_OC.append($r42, $r63);
                if ($z02) {
                    $r4 = "Delayed Credit";
                } else {
                    PosLabels $r53 = PosLabels.END_OF_DAY;
                    String $r64 = $r53.getLabel();
                    boolean $z03 = Log_OC.append($r42, $r64);
                    if ($z03) {
                        $r4 = "End of Day";
                    } else {
                        PosLabels $r54 = PosLabels.ROUTINE_ERROR;
                        String $r65 = $r54.getLabel();
                        boolean $z04 = Log_OC.append($r42, $r65);
                        $r4 = $z04 ? "Routing Error" : "Fund Transfer";
                    }
                }
            }
            TextView $r7 = this.issueTypeView;
            Locale $r8 = Locale.getDefault();
            Log_OC.loadImage($r8, "getDefault()");
            String $r66 = $r4.toLowerCase($r8);
            Log_OC.loadImage($r66, "(this as java.lang.String).toLowerCase(locale)");
            boolean $z05 = Log_OC.append($r66, "pos");
            if ($z05) {
                Locale $r82 = Locale.getDefault();
                Log_OC.loadImage($r82, "getDefault()");
                String $r67 = $r4.toUpperCase($r82);
                $r4 = $r67;
                Log_OC.loadImage($r67, "(this as java.lang.String).toUpperCase(locale)");
            } else {
                int $i0 = $r4.length();
                boolean $z06 = $i0 > 0;
                if ($z06) {
                    StringBuilder $r9 = new StringBuilder();
                    char $c1 = $r4.charAt(0);
                    boolean $z07 = Character.isLowerCase($c1);
                    if ($z07) {
                        Locale $r83 = Locale.getDefault();
                        Log_OC.loadImage($r83, "getDefault()");
                        $r6 = C13252b.m5546d($c1, $r83);
                    } else {
                        $r6 = String.valueOf($c1);
                    }
                    $r9.append($r6.toString());
                    String $r43 = $r4.substring(1);
                    Log_OC.loadImage($r43, "(this as java.lang.String).substring(startIndex)");
                    $r9.append($r43);
                    $r4 = $r9.toString();
                }
            }
            $r7.setText($r4);
        }

        @Override // ai.kudi.agent.inbox.adapters.InboxAdapter.ViewHolder
        public void bindTransaction(Issue.Ticket ticket) {
            Log_OC.getArray(ticket, "ticket");
            setStatus(ticket);
            setDate(ticket);
            setAmount(ticket);
            setType(ticket);
            setTitle(ticket);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getAmountTextView() {
            TextView r1 = this.amountTextView;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getDateTextView() {
            TextView r1 = this.dateTextView;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getIssueTypeView() {
            TextView r1 = this.issueTypeView;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getStatusTextView() {
            TextView r1 = this.statusTextView;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getTicketTitleTextView() {
            TextView r1 = this.ticketTitleTextView;
            return r1;
        }

        public final void setAmountTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.amountTextView = textView;
        }

        public final void setDateTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.dateTextView = textView;
        }

        public final void setIssueTypeView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.issueTypeView = textView;
        }

        public final void setStatusTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.statusTextView = textView;
        }

        public final void setTicketTitleTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.ticketTitleTextView = textView;
        }
    }

    /* compiled from: InboxAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J)\u0010\u000b\u001a\u00020\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/inbox/adapters/InboxAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/inbox/adapters/InboxAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindTransaction", "", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "setOnClickListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ InboxAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(InboxAdapter inboxAdapter, View view) {
            super(view);
            Log_OC.getArray(inboxAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = inboxAdapter;
            this.container = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnClickListener$lambda-0  reason: not valid java name */
        public static final void m39328setOnClickListener$lambda0(InterfaceC11767l interfaceC11767l, View view) {
            Log_OC.getArray(interfaceC11767l, "$tmp0");
            interfaceC11767l.invoke(view);
        }

        public abstract void bindTransaction(Issue.Ticket ticket);

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
            $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.inbox.adapters.FloatingActionButton$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11767l $r2 = InterfaceC11767l.this;
                    InboxAdapter.ViewHolder.m39328setOnClickListener$lambda0($r2, view);
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
    public InboxAdapter(Context context) {
        Log_OC.getArray(context, "context");
        this.context = context;
        ArrayList $r2 = new ArrayList();
        this.issues = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isDateViewAt(int i) {
        List $r1 = this.issues;
        if ($r1 == null) {
            return false;
        }
        try {
            Object $r2 = $r1.get(i);
            Issue.Ticket $r3 = (Issue.Ticket) $r2;
            if ($r3 == null) {
                return false;
            }
            HashMap $r4 = $r3.getDateView();
            Object $r22 = $r4.get("isDateView");
            boolean $z0 = Log_OC.append($r22, "true");
            return $z0;
        } catch (Exception $r5) {
            CrashlyticsReport.logException($r5);
            return false;
        }
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
        List $r1 = this.issues;
        Log_OC.append($r1);
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
        List $r3 = this.issues;
        Log_OC.append($r3);
        Object $r2 = $r3.get(i);
        Issue.Ticket $r4 = (Issue.Ticket) $r2;
        viewHolder.bindTransaction($r4);
        boolean $z0 = viewHolder instanceof InboxViewHolder;
        if ($z0) {
            InboxAdapter$onBindViewHolder$1 $r5 = new InboxAdapter$onBindViewHolder$1(this, viewHolder);
            viewHolder.setOnClickListener($r5);
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
            View $r4 = $r3.inflate(C0001R.C0004layout.content_inbox, viewGroup, false);
            Log_OC.loadImage($r4, "view");
            InboxViewHolder $r5 = new InboxViewHolder(this, $r4);
            return $r5;
        }
        Context $r22 = viewGroup.getContext();
        LayoutInflater $r32 = LayoutInflater.from($r22);
        View $r42 = $r32.inflate(C0001R.C0004layout.inbox_item_header, viewGroup, false);
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

    public final void setInbox(List list) {
        Log_OC.getArray(list, "issues");
        this.issues = list;
    }

    public final void setOnClickListener(InterfaceC11772q interfaceC11772q) {
        this.onClickListener = interfaceC11772q;
    }
}
