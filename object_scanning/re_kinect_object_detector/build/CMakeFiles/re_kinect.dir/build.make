# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 2.8

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/build

# Include any dependencies generated for this target.
include CMakeFiles/re_kinect.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/re_kinect.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/re_kinect.dir/flags.make

CMakeFiles/re_kinect.dir/src/slam_main.o: CMakeFiles/re_kinect.dir/flags.make
CMakeFiles/re_kinect.dir/src/slam_main.o: ../src/slam_main.cpp
CMakeFiles/re_kinect.dir/src/slam_main.o: ../manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/share/pcl/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/re_kinect.dir/src/slam_main.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/re_kinect.dir/src/slam_main.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/build/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/re_kinect.dir/src/slam_main.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/re_kinect.dir/src/slam_main.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/src/slam_main.cpp

CMakeFiles/re_kinect.dir/src/slam_main.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/re_kinect.dir/src/slam_main.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/src/slam_main.cpp > CMakeFiles/re_kinect.dir/src/slam_main.i

CMakeFiles/re_kinect.dir/src/slam_main.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/re_kinect.dir/src/slam_main.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/src/slam_main.cpp -o CMakeFiles/re_kinect.dir/src/slam_main.s

CMakeFiles/re_kinect.dir/src/slam_main.o.requires:
.PHONY : CMakeFiles/re_kinect.dir/src/slam_main.o.requires

CMakeFiles/re_kinect.dir/src/slam_main.o.provides: CMakeFiles/re_kinect.dir/src/slam_main.o.requires
	$(MAKE) -f CMakeFiles/re_kinect.dir/build.make CMakeFiles/re_kinect.dir/src/slam_main.o.provides.build
.PHONY : CMakeFiles/re_kinect.dir/src/slam_main.o.provides

CMakeFiles/re_kinect.dir/src/slam_main.o.provides.build: CMakeFiles/re_kinect.dir/src/slam_main.o

CMakeFiles/re_kinect.dir/src/recognitionmodel.o: CMakeFiles/re_kinect.dir/flags.make
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: ../src/recognitionmodel.cpp
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: ../manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/share/pcl/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/re_kinect.dir/src/recognitionmodel.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/build/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/re_kinect.dir/src/recognitionmodel.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/re_kinect.dir/src/recognitionmodel.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/src/recognitionmodel.cpp

CMakeFiles/re_kinect.dir/src/recognitionmodel.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/re_kinect.dir/src/recognitionmodel.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/src/recognitionmodel.cpp > CMakeFiles/re_kinect.dir/src/recognitionmodel.i

CMakeFiles/re_kinect.dir/src/recognitionmodel.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/re_kinect.dir/src/recognitionmodel.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/src/recognitionmodel.cpp -o CMakeFiles/re_kinect.dir/src/recognitionmodel.s

CMakeFiles/re_kinect.dir/src/recognitionmodel.o.requires:
.PHONY : CMakeFiles/re_kinect.dir/src/recognitionmodel.o.requires

CMakeFiles/re_kinect.dir/src/recognitionmodel.o.provides: CMakeFiles/re_kinect.dir/src/recognitionmodel.o.requires
	$(MAKE) -f CMakeFiles/re_kinect.dir/build.make CMakeFiles/re_kinect.dir/src/recognitionmodel.o.provides.build
.PHONY : CMakeFiles/re_kinect.dir/src/recognitionmodel.o.provides

CMakeFiles/re_kinect.dir/src/recognitionmodel.o.provides.build: CMakeFiles/re_kinect.dir/src/recognitionmodel.o

# Object files for target re_kinect
re_kinect_OBJECTS = \
"CMakeFiles/re_kinect.dir/src/slam_main.o" \
"CMakeFiles/re_kinect.dir/src/recognitionmodel.o"

# External object files for target re_kinect
re_kinect_EXTERNAL_OBJECTS =

../bin/re_kinect: CMakeFiles/re_kinect.dir/src/slam_main.o
../bin/re_kinect: CMakeFiles/re_kinect.dir/src/recognitionmodel.o
../bin/re_kinect: CMakeFiles/re_kinect.dir/build.make
../bin/re_kinect: CMakeFiles/re_kinect.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable ../bin/re_kinect"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/re_kinect.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/re_kinect.dir/build: ../bin/re_kinect
.PHONY : CMakeFiles/re_kinect.dir/build

CMakeFiles/re_kinect.dir/requires: CMakeFiles/re_kinect.dir/src/slam_main.o.requires
CMakeFiles/re_kinect.dir/requires: CMakeFiles/re_kinect.dir/src/recognitionmodel.o.requires
.PHONY : CMakeFiles/re_kinect.dir/requires

CMakeFiles/re_kinect.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/re_kinect.dir/cmake_clean.cmake
.PHONY : CMakeFiles/re_kinect.dir/clean

CMakeFiles/re_kinect.dir/depend:
	cd /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/build /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/build /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/object_scanning/re_kinect_object_detector/build/CMakeFiles/re_kinect.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/re_kinect.dir/depend
