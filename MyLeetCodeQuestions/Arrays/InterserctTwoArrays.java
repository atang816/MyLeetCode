{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab560
\pard\pardeftab560\slleading20\partightenfactor0

\f0\fs24 \cf0 /**\
Requirements:\
1. Find numbers that are the same in each array\
2. Can have multiple same numbers\
3. return result array\
\
Pseudo code:\
0. ArrayList <Integer> result = new ArrayList<Integer>();\
0a. ArrayList <Integer> usedIndices = new ArrayList<Integer>();\
\
1. Iterate through nums1\
    1a. Iterate through nums2\
        1b. if(nums[i] == nums[j] && !usedIndices.contains(j))\
                result.add(nums[i])\
                usedIndices.add(j)\
                break\
                \
2. result = result.toArray()\
3. return result\
            \
*/\
import java.util.List;\
import java.util.ArrayList;\
class Solution \{\
    public int[] intersect(int[] nums1, int[] nums2) \{\
        ArrayList <Integer> result = new ArrayList<Integer>();\
        ArrayList <Integer> usedIndices = new ArrayList<Integer>();\
        \
        for(int i = 0; i < nums1.length; i++)\{\
            for(int j = 0; j < nums2.length; j++)\{\
                if(nums1[i] == nums2[j] && !usedIndices.contains(j))\{\
                    result.add(nums1[i]);\
                    usedIndices.add(j);\
                    break;\
                \}\
                \
            \}\
        \}\
        \
        int[] resultArray = new int[result.size()];\
        for(int i = 0; i < result.size(); i++)\
            resultArray[i] = result.get(i);\
\
        return resultArray;\
    \}\
\}}