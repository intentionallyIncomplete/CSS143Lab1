����   4 �  ArrayReviewPractice  java/lang/Object arraySum I arrayAverage D 	theTarget sumOfPosNums keyboardInput Ljava/util/Scanner; <init> ()V Code
      java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable this LArrayReviewPractice; main ([Ljava/lang/String;)V 
Exceptions ' java/io/IOException
   * java/io/PrintWriter , 
myData.txt
 ) .  / (Ljava/lang/String;)V
 ) 1 2 3 print (I)V 5 ,
 ) 7 2 /
 ) 9 :  println
  < = > sum ([I)I
 ) @ : 3
  B C D averageTheElements ([I)D
 ) F : G (D)V
 ) I J  close L java/io/BufferedReader N java/io/FileReader
 M .
 K Q  R (Ljava/io/Reader;)V
 K T U V readLine ()Ljava/lang/String;	  X Y Z out Ljava/io/PrintStream;
 \ ^ ] java/io/PrintStream : /
 K I args [Ljava/lang/String; data [I arp writer Ljava/io/PrintWriter; a 
myDataFile Ljava/io/BufferedReader; line Ljava/lang/String; StackMapTable a c p java/lang/String	  r   i	  u   j indexOf ([II)I indexVal positiveSum	  | 
  populateArray ([I)V � Enter some integers
  � � � nextInt ()I
 \ @ k 
SourceFile ArrayReviewPractice.java !                 	     
                  E     *� *� Y� � � �                         ! "   	 # $  %     &   �     ��
YOYOY�OYOY�OYOL� Y� (M� )Y+� -N6� -+.� 0-4� 6�+����-� 8-,+� ;� ?-,+� A� E-� H� KY� MY+� O� P:� S:� � W� [� S:���� _�       N       ' ) 1 - 7 . ? / E - O 2 S 3 \ 5 e 6 i : { ; � < � = � > � < � @ � A     H    � ` a    � b c  ' x d "  1 n e f  4  g   { $ h i  �  j k  l   1 � 7  m n  )  � <  m n  ) K o    = >     v     =� *+.*� q`� q�+����*� q�           F  H  F  J           ! "      b c    s   l    �   C D     w      =� **� q�+��o� t�+����*� t�           P  R  P  T            ! "       b c    v   l    �   w x     �     ">6� +.� 	>� �+�����           Y  Z  [  \  ]  Z   `     4    " ! "     " b c    " 	      y     s   l    � �   z >     �     6=� )+.p� 	�� +.p� *Y� {+.`� {�+����*� {�           f  h  i  j  k ( f 1 n          6 ! "     6 b c   / v   l   	 �   } ~     �     8=� � W� [+*� � �O�+����=� � W+.� ��+����       "    u  w  x  u   z % { . z 7 }     *    8 ! "     8 b c    s   "  �   l   	 � 
  �    �