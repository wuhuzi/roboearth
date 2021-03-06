/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/share/sensor_msgs/msg/PointCloud2.msg */

package ros.pkg.sensor_msgs.msg;

import java.nio.ByteBuffer;

public class PointCloud2 extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public long height;
  public long width;
  public java.util.ArrayList<ros.pkg.sensor_msgs.msg.PointField> fields = new java.util.ArrayList<ros.pkg.sensor_msgs.msg.PointField>();
  public boolean is_bigendian;
  public long point_step;
  public long row_step;
  public short[] data = new short[0];
  public boolean is_dense;

  public PointCloud2() {
  }

  public static java.lang.String __s_getDataType() { return "sensor_msgs/PointCloud2"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "1158d486dd51d683ce2f1be655c3c181"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This message holds a collection of N-dimensional points, which may\n" +
"# contain additional information such as normals, intensity, etc. The\n" +
"# point data is stored as a binary blob, its layout described by the\n" +
"# contents of the \"fields\" array.\n" +
"\n" +
"# The point cloud data may be organized 2d (image-like) or 1d\n" +
"# (unordered). Point clouds organized as 2d images may be produced by\n" +
"# camera depth sensors such as stereo or time-of-flight.\n" +
"\n" +
"# Time of sensor data acquisition, and the coordinate frame ID (for 3d\n" +
"# points).\n" +
"Header header\n" +
"\n" +
"# 2D structure of the point cloud. If the cloud is unordered, height is\n" +
"# 1 and width is the length of the point cloud.\n" +
"uint32 height\n" +
"uint32 width\n" +
"\n" +
"# Describes the channels and their layout in the binary data blob.\n" +
"PointField[] fields\n" +
"\n" +
"bool    is_bigendian # Is this data bigendian?\n" +
"uint32  point_step   # Length of a point in bytes\n" +
"uint32  row_step     # Length of a row in bytes\n" +
"uint8[] data         # Actual point data, size is (row_step*height)\n" +
"\n" +
"bool is_dense        # True if there are no invalid points\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
"================================================================================\n" +
"MSG: sensor_msgs/PointField\n" +
"# This message holds the description of one point entry in the\n" +
"# PointCloud2 message format.\n" +
"uint8 INT8    = 1\n" +
"uint8 UINT8   = 2\n" +
"uint8 INT16   = 3\n" +
"uint8 UINT16  = 4\n" +
"uint8 INT32   = 5\n" +
"uint8 UINT32  = 6\n" +
"uint8 FLOAT32 = 7\n" +
"uint8 FLOAT64 = 8\n" +
"\n" +
"string name      # Name of field\n" +
"uint32 offset    # Offset from start of point struct\n" +
"uint8  datatype  # Datatype enumeration, see above\n" +
"uint32 count     # How many elements in the field\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public PointCloud2 clone() {
    PointCloud2 c = new PointCloud2();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 4; // height
    __l += 4; // width
    __l += 4;
    for(ros.pkg.sensor_msgs.msg.PointField val : fields) {
      __l += val.serializationLength();
    }
    __l += 1; // is_bigendian
    __l += 4; // point_step
    __l += 4; // row_step
    __l += 4 + data.length * 1; // data
    __l += 1; // is_dense
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    bb.putInt((int)height);
    bb.putInt((int)width);
    bb.putInt(fields.size());
    for(ros.pkg.sensor_msgs.msg.PointField val : fields) {
      val.serialize(bb, seq);
    }
    bb.put((byte)(is_bigendian ? 1 : 0));
    bb.putInt((int)point_step);
    bb.putInt((int)row_step);
    bb.putInt(data.length);
    for(short val : data) {
      bb.put((byte)val);
    }
    bb.put((byte)(is_dense ? 1 : 0));
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    height = (long)(bb.getInt() & 0xffffffff);
    width = (long)(bb.getInt() & 0xffffffff);

    int __fields_len = bb.getInt();
    fields = new java.util.ArrayList<ros.pkg.sensor_msgs.msg.PointField>(__fields_len);
    for(int __i=0; __i<__fields_len; __i++) {
      ros.pkg.sensor_msgs.msg.PointField __tmp = new ros.pkg.sensor_msgs.msg.PointField();
      __tmp.deserialize(bb);
      fields.add(__tmp);;
    }
    is_bigendian = bb.get() != 0 ? true : false;
    point_step = (long)(bb.getInt() & 0xffffffff);
    row_step = (long)(bb.getInt() & 0xffffffff);

    int __data_len = bb.getInt();
    data = new short[__data_len];
    for(int __i=0; __i<__data_len; __i++) {
      data[__i] = (short)(bb.get() & 0xff);
    }
    is_dense = bb.get() != 0 ? true : false;
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof PointCloud2))
      return false;
    PointCloud2 other = (PointCloud2) o;
    return
      header.equals(other.header) &&
      height == other.height &&
      width == other.width &&
      fields.equals(other.fields) &&
      is_bigendian == other.is_bigendian &&
      point_step == other.point_step &&
      row_step == other.row_step &&
      java.util.Arrays.equals(data, other.data) &&
      is_dense == other.is_dense &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (int)(this.height ^ (this.height >>> 32));
    result = prime * result + (int)(this.width ^ (this.width >>> 32));
    result = prime * result + (this.fields == null ? 0 : this.fields.hashCode());
    result = prime * result + (this.is_bigendian ? 1231 : 1237);
    result = prime * result + (int)(this.point_step ^ (this.point_step >>> 32));
    result = prime * result + (int)(this.row_step ^ (this.row_step >>> 32));
    result = prime * result + java.util.Arrays.hashCode(this.data);
    result = prime * result + (this.is_dense ? 1231 : 1237);
    return result;
  }
} // class PointCloud2

