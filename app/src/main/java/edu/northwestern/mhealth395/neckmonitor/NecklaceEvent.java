package edu.northwestern.mhealth395.neckmonitor;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Created by William on 2/6/2016
 */
public class NecklaceEvent {

    private float float0;
    private float float2;
    private float float3;
    private float float4;
    private float float1;
    private long  timeStamp;

    private final String TAG = "NecklaceEvent";

    public NecklaceEvent (byte[] bytes) {
        timeStamp = System.currentTimeMillis();
        if (bytes.length == 20) {
            float0 = ByteBuffer.wrap(bytes, 0, 4).order(ByteOrder.nativeOrder()).getFloat();
            float1 = ByteBuffer.wrap(bytes, 4, 4).order(ByteOrder.nativeOrder()).getFloat();
            float2 = ByteBuffer.wrap(bytes, 8, 4).order(ByteOrder.nativeOrder()).getFloat();
            float3 = ByteBuffer.wrap(bytes, 12, 4).order(ByteOrder.nativeOrder()).getFloat();
            float4 = ByteBuffer.wrap(bytes, 16, 4).order(ByteOrder.nativeOrder()).getFloat();
        } else {
//            Log.e(TAG, "Wrong number of bytes in constrctor array");
            float0 = 0;
            float2 = 0;
            float3 = 0;
            float4 = 0;
            float1 = 0;
        }
    }

    public float getFloat0() { return float0; }
    public float getFloat2() { return float2; }
    public float getFloat3() { return float3; }
    public float getFloat4()  { return float4;  }
    public float getFloat1(){ return float1;}
    public long  getTimeStamp() { return timeStamp; }


}
