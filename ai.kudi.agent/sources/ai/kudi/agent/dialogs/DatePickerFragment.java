package ai.kudi.agent.dialogs;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: DatePickerFragment.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/dialogs/DatePickerFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "defaultDate", "Ljava/util/Calendar;", "isDob", "", "Ljava/lang/Boolean;", "setTodayAsMinimumDate", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "", "view", "Landroid/widget/DatePicker;", "year", "", "month", "day", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class DatePickerFragment extends Chapter implements DatePickerDialog.OnDateSetListener {
    public static final String ARG_DATE_PICKER_DATA = "ARG_DATE_PICKER_DATA";
    public static final String ARG_DOB_DATA = "ARG_DOB_DATA";
    public static final String ARG_MIN_DATE = "MIN_DATE";
    public static final Companion Companion;
    public static final String DATE_KEY = "DATE_KEY";
    public static final String DATE_SET_KEY = "DATE_SET_KEY";
    public static final String year = "DATE_PICKER";
    private Calendar defaultDate;
    private Boolean isDob;
    private Boolean setTodayAsMinimumDate;

    /* compiled from: DatePickerFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/dialogs/DatePickerFragment$Companion;", "", "()V", DatePickerFragment.ARG_DATE_PICKER_DATA, "", DatePickerFragment.ARG_DOB_DATA, "ARG_MIN_DATE", DatePickerFragment.DATE_KEY, DatePickerFragment.DATE_SET_KEY, "TAG", "newInstance", "Lai/kudi/agent/dialogs/DatePickerFragment;", "isDob", "", "defaultDate", "Ljava/util/Calendar;", "setMinDate", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ DatePickerFragment newInstance$default(Companion companion, boolean $z0, Calendar $r2, boolean $z1, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = false;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r2 = null;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $z1 = false;
            }
            DatePickerFragment $r0 = companion.newInstance($z0, $r2, $z1);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final DatePickerFragment newInstance(boolean z, Calendar calendar, boolean z2) {
            DatePickerFragment $r2 = new DatePickerFragment();
            Bundle $r3 = new Bundle();
            $r3.putBoolean(DatePickerFragment.ARG_DOB_DATA, z);
            $r3.putSerializable(DatePickerFragment.ARG_DATE_PICKER_DATA, calendar);
            $r3.putBoolean(DatePickerFragment.ARG_MIN_DATE, z2);
            $r2.setArguments($r3);
            return $r2;
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
    @Override // androidx.fragment.app.Chapter
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle $r1 = getArguments();
        if ($r1 != null) {
            boolean $z0 = $r1.getBoolean(ARG_DOB_DATA);
            Boolean $r2 = Boolean.valueOf($z0);
            this.isDob = $r2;
            Serializable $r3 = $r1.getSerializable(ARG_DATE_PICKER_DATA);
            boolean $z02 = $r3 instanceof Calendar;
            Calendar $r4 = $z02 ? (Calendar) $r3 : null;
            this.defaultDate = $r4;
            boolean $z03 = $r1.getBoolean(ARG_MIN_DATE);
            Boolean $r22 = Boolean.valueOf($z03);
            this.setTodayAsMinimumDate = $r22;
        }
        Calendar $r5 = Calendar.getInstance();
        Calendar $r42 = $r5;
        int $i0 = $r5.get(1);
        int $i1 = $i0;
        Calendar $r52 = this.defaultDate;
        if ($r52 != null) {
            $r42 = $r52;
        }
        int $i2 = $r42.get(1);
        int $i3 = $r42.get(2);
        int $i4 = $r42.get(5);
        FragmentActivity $r7 = requireActivity();
        DatePickerDialog $r6 = new DatePickerDialog($r7, this, $i2, $i3, $i4);
        Boolean $r23 = this.setTodayAsMinimumDate;
        Boolean $r8 = Boolean.TRUE;
        boolean $z04 = Log_OC.append($r23, $r8);
        if ($z04) {
            DatePicker $r9 = $r6.getDatePicker();
            Calendar $r43 = Calendar.getInstance();
            long $l5 = $r43.getTimeInMillis();
            $r9.setMinDate($l5);
            return $r6;
        }
        DatePicker $r92 = $r6.getDatePicker();
        Calendar $r44 = Calendar.getInstance();
        Boolean $r24 = this.isDob;
        Boolean $r82 = Boolean.TRUE;
        boolean $z05 = Log_OC.append($r24, $r82);
        if ($z05) {
            $i1 = $i0 - 18;
        }
        $r44.set(1, $i1);
        C13666w c13666w = C13666w.f30112a;
        long $l52 = $r44.getTimeInMillis();
        $r92.setMaxDate($l52);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Log_OC.getArray(datePicker, "view");
        Calendar $r2 = Calendar.getInstance();
        $r2.set(1, i);
        $r2.set(2, i2);
        $r2.set(5, i3);
        FragmentManager $r3 = getParentFragmentManager();
        Bundle $r4 = new Bundle();
        Date $r5 = $r2.getTime();
        $r4.putSerializable(DATE_KEY, $r5);
        C13666w c13666w = C13666w.f30112a;
        $r3.m35913o1(DATE_SET_KEY, $r4);
    }
}
