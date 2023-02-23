package ai.kudi.agent.core.util.printer;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.viewmodels.BluetoothDeviceModel;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.e;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.Priority;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13254d;
/* compiled from: Printer.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\u0010\u0004\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0003J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0003J\b\u0010\u001c\u001a\u00020\nH\u0003J\b\u0010\u001d\u001a\u00020\nH\u0003J\b\u0010\u001e\u001a\u00020\nH\u0003R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0004\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00030\u00030\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/core/util/printer/Printer;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "callback", "Lkotlin/Function1;", "Ljava/io/OutputStream;", "Lkotlin/ParameterName;", "name", "outputStream", "", "(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)V", "applicationUUID", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothSocket", "Landroid/bluetooth/BluetoothSocket;", "selectedBluetoothDevice", "Landroid/bluetooth/BluetoothDevice;", "weakActivityReference", "Ljava/lang/ref/WeakReference;", "displayListOfDevices", "initialiseBluetoothConnection", "listOfDevices", "Ljava/util/ArrayList;", "Lai/kudi/agent/users/viewmodels/BluetoothDeviceModel;", "lookUpBluetoothDevices", "print", "retryUponFailure", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Printer {
    public static final Companion Companion;
    private final UUID applicationUUID;
    private final BluetoothAdapter bluetoothAdapter;
    private BluetoothSocket bluetoothSocket;
    private final InterfaceC11767l<OutputStream, C13666w> callback;
    private BluetoothDevice selectedBluetoothDevice;
    private final WeakReference<e> weakActivityReference;

    /* compiled from: Printer.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ&\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0014¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/core/util/printer/Printer$Companion;", "", "()V", "addSpace", "", TransactionField.TIME, "", "printCustom", "", AttributeType.TEXT, "size", "", "alignment", "outputStream", "Ljava/io/OutputStream;", "printNewLine", "printPhoto", "img", "resource", "Landroid/content/res/Resources;", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final String addSpace(int i) {
            String $r1 = "";
            for (int $i1 = 0; $i1 < i; $i1++) {
                $r1 = Log_OC.m10359a($r1, (Object) " ");
            }
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void printCustom(String str, Number number, Number number2, OutputStream outputStream) {
            Log_OC.getArray(str, AttributeType.TEXT);
            Log_OC.getArray(number, "size");
            Log_OC.getArray(number2, "alignment");
            Log_OC.getArray(outputStream, "outputStream");
            byte[] $r8 = {PrinterCommands.MODIFIER_SYMBOL, 33, 3};
            byte[] $r3 = {PrinterCommands.MODIFIER_SYMBOL, 33, 8};
            byte[] $r4 = {PrinterCommands.MODIFIER_SYMBOL, 33, 32};
            byte[] $r5 = {PrinterCommands.MODIFIER_SYMBOL, 33, PrinterCommands.DLE};
            try {
                boolean $z0 = Log_OC.append(number, 0);
                if ($z0) {
                    outputStream.write($r8);
                } else {
                    boolean $z02 = Log_OC.append(number, 1);
                    if ($z02) {
                        outputStream.write($r3);
                    } else {
                        boolean $z03 = Log_OC.append(number, 2);
                        if ($z03) {
                            outputStream.write($r4);
                        } else {
                            boolean $z04 = Log_OC.append(number, 3);
                            if ($z04) {
                                outputStream.write($r5);
                            }
                        }
                    }
                }
                boolean $z05 = Log_OC.append(number2, 0);
                if ($z05) {
                    byte[] $r32 = PrinterCommands.ESC_ALIGN_LEFT;
                    outputStream.write($r32);
                } else {
                    boolean $z06 = Log_OC.append(number2, 1);
                    if ($z06) {
                        byte[] $r33 = PrinterCommands.ESC_ALIGN_CENTER;
                        outputStream.write($r33);
                    } else {
                        boolean $z07 = Log_OC.append(number2, 2);
                        if ($z07) {
                            byte[] $r34 = PrinterCommands.ESC_ALIGN_RIGHT;
                            outputStream.write($r34);
                        }
                    }
                }
                Charset $r10 = C13254d.f29413a;
                byte[] $r35 = str.getBytes($r10);
                Log_OC.loadImage($r35, "(this as java.lang.String).getBytes(charset)");
                outputStream.write($r35);
            } catch (IOException $r11) {
                CrashlyticsReport.logException($r11);
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void printNewLine(OutputStream outputStream) {
            Log_OC.getArray(outputStream, "outputStream");
            byte[] $r2 = PrinterCommands.FEED_LINE;
            try {
                outputStream.write($r2);
            } catch (IOException $r3) {
                CrashlyticsReport.logException($r3);
                $r3.printStackTrace();
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void printPhoto(int i, Resources resources, OutputStream outputStream, byte[] bArr) {
            Log_OC.getArray(resources, "resource");
            Log_OC.getArray(outputStream, "outputStream");
            Log_OC.getArray(bArr, "alignment");
            try {
                Bitmap $r4 = BitmapFactory.decodeResource(resources, i);
                if ($r4 != null) {
                    byte[] $r5 = PrinterUtil.decodeBitmap($r4);
                    outputStream.write(bArr);
                    outputStream.write($r5);
                }
            } catch (Exception $r6) {
                CrashlyticsReport.logException($r6);
                $r6.printStackTrace();
            }
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
    public Printer(AppCompatActivity appCompatActivity, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(appCompatActivity, "activity");
        Log_OC.getArray(interfaceC11767l, "callback");
        this.callback = interfaceC11767l;
        BluetoothAdapter $r3 = BluetoothAdapter.getDefaultAdapter();
        this.bluetoothAdapter = $r3;
        UUID $r4 = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
        this.applicationUUID = $r4;
        WeakReference $r5 = new WeakReference(appCompatActivity);
        this.weakActivityReference = $r5;
        lookUpBluetoothDevices();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0034 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void displayListOfDevices() {
        /*
            r32 = this;
            r0 = r32
            java.lang.ref.WeakReference<androidx.appcompat.app.e> r2 = r0.weakActivityReference
            java.lang.Object r3 = r2.get()
            r5 = r3
            androidx.appcompat.app.AppCompatActivity r5 = (androidx.appcompat.app.AppCompatActivity) r5
            r4 = r5
            if (r4 != 0) goto Lf
            return
        Lf:
            androidx.appcompat.app.d$a r6 = new androidx.appcompat.app.d$a
            r7 = r6
            int r8 = ai.kudi.agent.core.C0038R.style.AlertDialogTheme
            r6.<init>(r4, r8)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            java.lang.String r9 = "Select your printer"
            r7.setTitle(r9)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r10 = 1
            r7.setCancelable(r10)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = r11
            r11.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r0 = r32
            java.util.ArrayList r11 = r0.listOfDevices()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            java.util.Iterator r13 = r11.iterator()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
        L30:
            boolean r14 = r13.hasNext()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            if (r14 == 0) goto L72
            java.lang.Object r3 = r13.next()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r16 = r3
            ai.kudi.agent.users.viewmodels.BluetoothDeviceModel r16 = (ai.kudi.agent.users.viewmodels.BluetoothDeviceModel) r16
            r15 = r16
            java.lang.StringBuilder r17 = new java.lang.StringBuilder
            r18 = r17
            r0 = r17
            r0.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            java.lang.String r19 = r15.getName()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r0 = r18
            r1 = r19
            r0.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            java.lang.String r9 = ": "
            r0 = r18
            r0.append(r9)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            java.lang.String r19 = r15.getDeviceAddress()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r0 = r18
            r1 = r19
            r0.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r0 = r18
            java.lang.String r19 = r0.toString()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r0 = r19
            r12.add(r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            goto L30
        L72:
            int r8 = r12.size()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            if (r8 != 0) goto L7d
            java.lang.String r9 = "No Device found"
            r12.add(r9)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
        L7d:
            r10 = 0
            java.lang.String[] r0 = new java.lang.String[r10]
            r20 = r0
            java.lang.Object[] r21 = r12.toArray(r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            if (r21 == 0) goto Lc0
            r23 = r21
            java.lang.CharSequence[] r23 = (java.lang.CharSequence[]) r23
            r22 = r23
            ai.kudi.agent.core.util.printer.MainActivity$1 r24 = new ai.kudi.agent.core.util.printer.MainActivity$1
            r25 = r24
            r0 = r24
            r1 = r32
            r0.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r0 = r22
            r1 = r25
            r7.setItems(r0, r1)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            ai.kudi.agent.core.util.printer.Token r26 = ai.kudi.agent.core.util.printer.Token.FUNCTION
            java.lang.String r9 = "Cancel"
            r0 = r26
            r7.setNegativeButton(r9, r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            androidx.appcompat.app.d r27 = r7.create()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            java.lang.String r9 = "alertDialogBuilder.create()"
            r0 = r27
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r9)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            r29 = r27
            android.app.Dialog r29 = (android.app.Dialog) r29
            r28 = r29
            r0 = r28
            r0.show()     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            return
        Lc0:
            java.lang.NullPointerException r30 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0 = r30
            r0.<init>(r9)     // Catch: java.lang.IndexOutOfBoundsException -> Lca
            throw r30
        Lca:
            r31 = move-exception
            r0 = r31
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.printer.Printer.displayListOfDevices():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: displayListOfDevices$lambda-0  reason: not valid java name */
    public static final void m39185displayListOfDevices$lambda0(ArrayList arrayList, Printer printer, AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        BluetoothDevice $r5;
        Log_OC.getArray(arrayList, "$listOfDevices");
        Log_OC.getArray(printer, "this$0");
        Log_OC.getArray(appCompatActivity, "$activity");
        int $i1 = arrayList.size();
        if (i > $i1 - 1) {
            return;
        }
        BluetoothAdapter $r4 = printer.bluetoothAdapter;
        if ($r4 == null) {
            $r5 = null;
        } else {
            Object $r6 = arrayList.get(i);
            BluetoothDeviceModel $r7 = (BluetoothDeviceModel) $r6;
            String $r8 = $r7.getDeviceAddress();
            $r5 = $r4.getRemoteDevice($r8);
        }
        printer.selectedBluetoothDevice = $r5;
        ContextExtKt.toast(appCompatActivity, "Connecting...", 1);
        printer.initialiseBluetoothConnection();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initialiseBluetoothConnection() {
        Thread $r1 = new Thread(new Runnable() { // from class: ai.kudi.agent.core.util.printer.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                Printer $r12 = Printer.this;
                Printer.m39187initialiseBluetoothConnection$lambda5($r12);
            }
        });
        $r1.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: initialiseBluetoothConnection$lambda-5  reason: not valid java name */
    public static final void m39187initialiseBluetoothConnection$lambda5(final Printer printer) {
        Log_OC.getArray(printer, "this$0");
        WeakReference $r2 = printer.weakActivityReference;
        try {
            Object $r3 = $r2.get();
            final AppCompatActivity $r4 = (AppCompatActivity) $r3;
            if ($r4 != null) {
                BluetoothDevice $r5 = printer.selectedBluetoothDevice;
                Log_OC.append($r5);
                UUID $r1 = printer.applicationUUID;
                printer.bluetoothSocket = $r5.createRfcommSocketToServiceRecord($r1);
                BluetoothAdapter $r7 = printer.bluetoothAdapter;
                if ($r7 != null) {
                    $r7.cancelDiscovery();
                }
                BluetoothSocket $r6 = printer.bluetoothSocket;
                if ($r6 != null) {
                    $r6.connect();
                }
                $r4.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.core.util.printer.DownloaderService$LVLRunnable
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppCompatActivity $r12 = AppCompatActivity.this;
                        Printer $r22 = printer;
                        Printer.m39188initialiseBluetoothConnection$lambda5$lambda3($r12, $r22);
                    }
                });
            }
        } catch (IOException $r9) {
            CrashlyticsReport.logException($r9);
            $r9.printStackTrace();
            WeakReference $r22 = printer.weakActivityReference;
            Object $r32 = $r22.get();
            AppCompatActivity $r42 = (AppCompatActivity) $r32;
            if ($r42 == null) {
                return;
            }
            $r42.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.core.util.printer.InitiationListener$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    Printer $r12 = Printer.this;
                    Printer.m39189initialiseBluetoothConnection$lambda5$lambda4($r12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initialiseBluetoothConnection$lambda-5$lambda-3  reason: not valid java name */
    public static final void m39188initialiseBluetoothConnection$lambda5$lambda3(AppCompatActivity appCompatActivity, Printer printer) {
        Log_OC.getArray(printer, "this$0");
        ContextExtKt.toast$default(appCompatActivity, "Device connected", 0, 2, (Object) null);
        printer.print();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initialiseBluetoothConnection$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39189initialiseBluetoothConnection$lambda5$lambda4(Printer printer) {
        Log_OC.getArray(printer, "this$0");
        printer.retryUponFailure();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList listOfDevices() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.bluetooth.BluetoothAdapter r1 = r14.bluetoothAdapter
            r2 = 0
            if (r1 != 0) goto Lb
            goto L1b
        Lb:
            java.util.Set r3 = r1.getBondedDevices()
            if (r3 != 0) goto L12
            goto L1b
        L12:
            ai.kudi.agent.core.util.printer.Printer$listOfDevices$$inlined$sortedBy$1 r4 = new ai.kudi.agent.core.util.printer.Printer$listOfDevices$$inlined$sortedBy$1
            r4.<init>()
            java.util.List r2 = kotlin.p557z.C13722p.m3911u0(r3, r4)
        L1b:
            if (r2 == 0) goto L26
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L24
            goto L26
        L24:
            r5 = 0
            goto L27
        L26:
            r5 = 1
        L27:
            if (r5 == 0) goto L2a
            return r0
        L2a:
            java.util.Iterator r6 = r2.iterator()
        L2e:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L57
            java.lang.Object r7 = r6.next()
            r9 = r7
            android.bluetooth.BluetoothDevice r9 = (android.bluetooth.BluetoothDevice) r9
            r8 = r9
            ai.kudi.agent.users.viewmodels.BluetoothDeviceModel r10 = new ai.kudi.agent.users.viewmodels.BluetoothDeviceModel
            java.lang.String r11 = r8.getName()
            java.lang.String r12 = "value.name"
            kotlin.p483e0.p485d.Log_OC.loadImage(r11, r12)
            java.lang.String r13 = r8.getAddress()
            java.lang.String r12 = "value.address"
            kotlin.p483e0.p485d.Log_OC.loadImage(r13, r12)
            r10.<init>(r11, r13)
            r0.add(r10)
            goto L2e
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.printer.Printer.listOfDevices():java.util.ArrayList");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void lookUpBluetoothDevices() {
        WeakReference $r3 = this.weakActivityReference;
        Object $r4 = $r3.get();
        AppCompatActivity $r5 = (AppCompatActivity) $r4;
        if ($r5 == null) {
            return;
        }
        BluetoothAdapter $r6 = this.bluetoothAdapter;
        if ($r6 != null) {
            boolean $z0 = $r6.isEnabled();
            if (!$z0) {
                CustomDialog.Companion $r1 = CustomDialog.Companion;
                Printer$lookUpBluetoothDevices$1 $r2 = new Printer$lookUpBluetoothDevices$1(this, $r5);
                CustomDialog.Companion.show$default($r1, "Turn On Bluetooth", "You are about to turn your bluetooth to make connection", "Turn On", (String) null, $r2, (InterfaceC11756a) null, $r5, 40, (Object) null);
                return;
            }
        }
        BluetoothDevice $r7 = this.selectedBluetoothDevice;
        if ($r7 == null) {
            displayListOfDevices();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void print() {
        AbstractC1565i $r9;
        Priority $r10;
        Thread.sleep(5000L);
        BluetoothSocket $r2 = this.bluetoothSocket;
        OutputStream $r3 = $r2 == null ? null : $r2.getOutputStream();
        boolean $z0 = false;
        if ($r3 == null) {
            WeakReference $r4 = this.weakActivityReference;
            if ($r4.get() != null) {
                WeakReference $r42 = this.weakActivityReference;
                Object $r5 = $r42.get();
                Log_OC.append($r5);
                Log_OC.loadImage($r5, "weakActivityReference.get()!!");
                int $i0 = C0038R.string.print_error_message;
                ContextExtKt.toast$default((Context) $r5, $i0, 0, 2, (Object) null);
                return;
            }
            return;
        }
        InterfaceC11767l $r7 = this.callback;
        $r7.invoke($r3);
        Printer$print$disconnectCallback$1 $r1 = new Printer$print$disconnectCallback$1(this);
        WeakReference $r43 = this.weakActivityReference;
        AppCompatActivity $r8 = (AppCompatActivity) $r43.get();
        if ($r8 != null && ($r9 = $r8.getLifecycle()) != null && ($r10 = $r9.mo35505b()) != null) {
            Priority $r11 = Priority.f4719G;
            boolean $z1 = $r10.m35575c($r11);
            if ($z1) {
                $z0 = true;
            }
        }
        if ($z0) {
            CustomDialog.Companion $r12 = CustomDialog.Companion;
            WeakReference $r44 = this.weakActivityReference;
            Object $r52 = $r44.get();
            Log_OC.append($r52);
            Log_OC.loadImage($r52, "weakActivityReference.get()!!");
            Context $r6 = (Context) $r52;
            CustomDialog.Companion.show$default($r12, "Printing Status", "Printing Successful", "Ok", "Disconnect", (InterfaceC11756a) null, $r1, $r6, 16, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void retryUponFailure() {
        WeakReference $r3 = this.weakActivityReference;
        Object $r4 = $r3.get();
        AppCompatActivity $r5 = (AppCompatActivity) $r4;
        if ($r5 == null) {
            return;
        }
        AbstractC1565i $r6 = $r5.getLifecycle();
        Priority $r7 = $r6.mo35505b();
        Priority $r8 = Priority.f4719G;
        boolean $z0 = $r7.m35575c($r8);
        if ($z0) {
            CustomDialog.Companion $r9 = CustomDialog.Companion;
            Printer$retryUponFailure$1 $r1 = new Printer$retryUponFailure$1(this);
            Printer$retryUponFailure$2 $r2 = new Printer$retryUponFailure$2(this);
            $r9.show("Printing Status", "Printing failed. Cannot connect to device", "RETRY", "Cancel", $r1, $r2, $r5);
        }
    }
}
